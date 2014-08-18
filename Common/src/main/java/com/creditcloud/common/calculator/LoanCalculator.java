/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.utils.DateUtils;
import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.constant.TimeConstant;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import static com.creditcloud.model.enums.loan.RepaymentMethod.BulletRepayment;
import static com.creditcloud.model.enums.loan.RepaymentMethod.EqualInstallment;
import static com.creditcloud.model.enums.loan.RepaymentMethod.EqualInterest;
import static com.creditcloud.model.enums.loan.RepaymentMethod.MonthlyInterest;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.LoanDetail;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.math.MathContext;
import org.joda.time.LocalDate;

/**
 *
 * @author sobranie
 */
public final class LoanCalculator {

    private static final BigDecimal ZERO = new BigDecimal(0).setScale(2);

    private static final BigDecimal ONE = new BigDecimal(1).setScale(2);

    private static final BigDecimal monthsPerYear = new BigDecimal(TimeConstant.MONTHS_PER_YEAR);

    private static final BigDecimal daysPerYear = new BigDecimal(TimeConstant.DAYS_PER_YEAR);

    /**
     * rate is in format like 2400 which is actually 24.00%
     */
    private static final BigDecimal rateScale = new BigDecimal(10000);

    private static final MathContext mc = new MathContext(16, NumberConstant.ROUNDING_MODE);

    /**
     *
     * @param amount
     * @param duration
     * @param rate     2400 means 24.00%
     * @param method
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyze(final int amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate) {
        return analyze(BigDecimal.valueOf(amount), duration, rate, method, asOfDate);
    }

    /**
     *
     * @param amount
     * @param duration
     * @param rate     2400 means 24.00%
     * @param method
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyze(final BigDecimal amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate) {
        LoanDetail result = null;
        //principal
        BigDecimal principal = amount;
        //now get rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal rateDay = rateYear.divide(daysPerYear, mc);
        //dealing with different methods
        BigDecimal interest, amortizedInterest, amortizedPrincipal, outstandingPrincipal;
        LocalDate dueDate = asOfDate;
        int tenure;
        switch (method) {
            case BulletRepayment:
                //add yearly interest
                interest = principal.multiply(rateYear).multiply(new BigDecimal(duration.getYears()));
                //add monthly interest
                interest = interest.add(principal.multiply(rateMonth).multiply(new BigDecimal(duration.getMonths())));
                //add daily interest
                interest = interest.add(principal.multiply(rateDay).multiply(new BigDecimal(duration.getDays())));
                //ceilling the interest
                interest = interest.setScale(2, NumberConstant.ROUNDING_MODE);
                //create result
                result = new LoanDetail(principal, interest, duration, BulletRepayment);
                //add single amortize item
                result.getRepayments().add(new Repayment(principal, interest, ZERO, DateUtils.offset(asOfDate, duration)));
                break;
            case MonthlyInterest:   //in this case we don't need to worry about duration.days since that must be 0
                amortizedInterest = principal.multiply(rateMonth).setScale(2, NumberConstant.ROUNDING_MODE);
                interest = amortizedInterest.multiply(new BigDecimal(duration.getTotalMonths()));
                //create result
                result = new LoanDetail(principal, interest, duration, MonthlyInterest);
                //add amortized items
                for (int i = 0; i < duration.getTotalMonths(); i++) {
                    dueDate = DateUtils.offset(dueDate, new Duration(0, 1, 0));
                    if (i < duration.getTotalMonths() - 1) {    //only interest, no principal
                        result.getRepayments().add(new Repayment(ZERO, amortizedInterest, principal, dueDate));
                    } else {    //last ONE we pay off the principal as well as interest
                        result.getRepayments().add(new Repayment(principal, amortizedInterest, ZERO, dueDate));
                    }
                }
                break;
            case EqualInstallment:
                //times of repayments in months
                tenure = duration.getYears() * 12 + duration.getMonths();
                //pre-calc
                BigDecimal[] is = new BigDecimal[tenure + 1];
                for (int i = 0; i <= tenure; i++) {
                    is[i] = rateMonth.add(ONE).pow(i);
                }
                BigDecimal baseInterest = principal.multiply(rateMonth);
                //calc installment
                BigDecimal installment = baseInterest.multiply(is[tenure]).divide(is[tenure].subtract(ONE), mc);
                installment = installment.setScale(2, NumberConstant.ROUNDING_MODE);
                //reset total interest
                interest = ZERO;
                //create loanDetail
                result = new LoanDetail(principal, interest, duration, EqualInstallment);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    dueDate = DateUtils.offset(dueDate, new Duration(0, 1, 0));
                    amortizedInterest = baseInterest.subtract(installment, mc).multiply(is[i]).add(installment, mc).setScale(2, NumberConstant.ROUNDING_MODE);
                    amortizedPrincipal = installment.subtract(amortizedInterest);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {  //last ONE we need to fix the rounding error and let the oustanding principal be ZERO
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 dueDate));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 dueDate));
                    }
                    interest = interest.add(amortizedInterest);
                }
                //fix interest
                result.setInterest(interest);
                break;
            case EqualPrincipal:
                //times of repayments in months
                tenure = duration.getYears() * 12 + duration.getMonths();
                //calc amortized principal first
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                //calc by each month
                BigDecimal[] interests = new BigDecimal[tenure];
                BigDecimal[] outstandingPrincipals = new BigDecimal[tenure];
                outstandingPrincipal = principal;
                interest = ZERO;
                for (int i = 0; i < tenure; i++) {
                    interests[i] = outstandingPrincipal.multiply(rateMonth, mc).setScale(2, NumberConstant.ROUNDING_MODE);
                    interest = interest.add(interests[i]);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    outstandingPrincipals[i] = outstandingPrincipal;
                }
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualInstallment);
                //deal with amortized items
                for (int i = 0; i < tenure; i++) {
                    dueDate = DateUtils.offset(dueDate, new Duration(0, 1, 0));
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipals[i]),
                                                                 interests[i],
                                                                 ZERO,
                                                                 dueDate));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 interests[i],
                                                                 outstandingPrincipals[i],
                                                                 dueDate));
                    }
                }
                break;
            case EqualInterest:
                //times of repayments in months
                tenure = duration.getYears() * 12 + duration.getMonths();
                //calc amortized principal and interest
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                amortizedInterest = principal.multiply(rateMonth).setScale(2, NumberConstant.ROUNDING_MODE);
                interest = amortizedInterest.multiply(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualInterest);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    dueDate = DateUtils.offset(dueDate, new Duration(0, 1, 0));
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 dueDate));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 dueDate));
                    }
                }
                break;
        }
        return result;
    }

    public static LoanDetail analyze(LoanRequest request, LocalDate asOfDate) {
        return analyze(request.getAmount(),
                       request.getDuration(),
                       request.getRate(),
                       request.getMethod(),
                       asOfDate);
    }

    /**
     * 快速计算利息
     *
     * @param amount   金额
     * @param rate     利率，2400代表24%
     * @param duration 期限
     * @return
     */
    public static BigDecimal quickInterest(int amount, int rate, Duration duration) {
        //principal
        BigDecimal principal = new BigDecimal(amount);
        //rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal rateDay = rateYear.divide(daysPerYear, mc);
        //calc
        BigDecimal interest = principal.multiply(rateYear).multiply(new BigDecimal(duration.getYears()));
        //add monthly interest
        interest = interest.add(principal.multiply(rateMonth).multiply(new BigDecimal(duration.getMonths())));
        //add daily interest
        interest = interest.add(principal.multiply(rateDay).multiply(new BigDecimal(duration.getDays())));
        //return
        return interest.setScale(2, NumberConstant.ROUNDING_MODE);
    }
}
