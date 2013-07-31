/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.calculator.LoanDetail.Repayment;
import com.creditcloud.common.utils.DateUtils;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import static com.creditcloud.model.enums.loan.RepaymentMethod.BulletRepayment;
import static com.creditcloud.model.enums.loan.RepaymentMethod.EqualInstallment;
import static com.creditcloud.model.enums.loan.RepaymentMethod.MonthlyInterest;
import com.creditcloud.model.misc.Duration;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Date;

/**
 *
 * @author sobranie
 */
public final class LoanCalculator {

    private static final BigDecimal zero = new BigDecimal(0).setScale(2);

    private static final BigDecimal one = new BigDecimal(1);

    private static final BigDecimal monthsPerYear = new BigDecimal(12);

    private static final BigDecimal daysPerYear = new BigDecimal(365);

    /**
     * rate is in format like 2400 which is actually 24.00%
     */
    private static final BigDecimal rateScale = new BigDecimal(10000);

    private static final MathContext mc = new MathContext(16, RoundingMode.HALF_UP);

    /**
     * 计算分几期
     *
     * @param durationInDays
     * @param method
     * @return
     */
    public static int amortize(final int durationInDays,
                               final RepaymentMethod method) {
        int result = 0;
        if (method == RepaymentMethod.BulletRepayment) {
            result = 1;
        } else { //等额本息或按月付息还本
            Duration duration = new Duration(durationInDays);
            result += duration.getYears() * 12;
            result += duration.getMonths();
        }
        return result;
    }

    /**
     *
     * @param amount
     * @param duration
     * @param rate 2400 means 24.00%
     * @param method
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyze(final int amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final Date asOfDate) {
        LoanDetail result = null;
        //principal
        BigDecimal principal = new BigDecimal(amount);
        //now get rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal rateDay = rateYear.divide(daysPerYear, mc);
        //dealing with different methods
        BigDecimal interest, amortizedInterest, amortizedPrincipal;
        Date dueDate = asOfDate;
        switch (method) {
            case BulletRepayment:
                //add yearly interest
                interest = principal.multiply(rateYear).multiply(new BigDecimal(duration.getYears()));
                //add monthly interest
                interest = interest.add(principal.multiply(rateMonth).multiply(new BigDecimal(duration.getMonths())));
                //add daily interest
                interest = interest.add(principal.multiply(rateDay).multiply(new BigDecimal(duration.getDays())));
                //ceilling the interest
                interest = interest.setScale(2, RoundingMode.CEILING);
                //create result
                result = new LoanDetail(principal, interest, duration, BulletRepayment);
                //add single amortize item
                result.getRepayments().add(new Repayment(principal, interest, zero, DateUtils.offset(asOfDate, duration)));
                break;
            case MonthlyInterest:   //in this case we don't need to worry about duration.days since that must be 0
                amortizedInterest = principal.multiply(rateMonth).setScale(2, RoundingMode.CEILING);
                interest = amortizedInterest.multiply(new BigDecimal(duration.getTotalMonths()));
                //create result
                result = new LoanDetail(principal, interest, duration, MonthlyInterest);
                //add amortized items
                for (int i = 0; i < duration.getTotalMonths(); i++) {
                    dueDate = DateUtils.offset(dueDate, new Duration(0, 1, 0));
                    if (i < duration.getTotalMonths() - 1) {    //only interest, no principal
                        result.getRepayments().add(new Repayment(zero, amortizedInterest, principal, dueDate));
                    } else {    //last one we pay off the principal as well as interest
                        result.getRepayments().add(new Repayment(principal, amortizedInterest, zero, dueDate));
                    }
                }
                break;
            case EqualInstallment:
                //times of repayments in months
                int tenure = duration.getYears() * 12 + duration.getMonths();
                //pre-calc
                BigDecimal[] is = new BigDecimal[tenure + 1];
                for (int i = 0; i <= tenure; i++) {
                    is[i] = rateMonth.add(one).pow(i);
                }
                BigDecimal baseInterest = principal.multiply(rateMonth);
                //calc installment
                BigDecimal installment = baseInterest.multiply(is[tenure]).divide(is[tenure].subtract(one), mc);
                installment = installment.setScale(2, RoundingMode.CEILING);
                //calc total interest
                interest = installment.multiply(new BigDecimal(tenure));
                interest = interest.subtract(principal);
                //create loanDetail
                result = new LoanDetail(principal, interest, duration, EqualInstallment);
                //deal with amortized items
                BigDecimal outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    dueDate = DateUtils.offset(dueDate, new Duration(0, 1, 0));
                    amortizedInterest = baseInterest.subtract(installment, mc).multiply(is[i]).add(installment, mc).setScale(2, RoundingMode.CEILING);
                    amortizedPrincipal = installment.subtract(amortizedInterest);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {  //last one we need to fix the rounding error and let the oustanding principal be zero
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 zero,
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
}
