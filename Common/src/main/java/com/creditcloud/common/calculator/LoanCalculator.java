/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.calculator.LoanDetail.Repayment;
import com.creditcloud.common.utils.DateUtils;
import com.creditcloud.model.LoanRequest;
import com.creditcloud.model.enums.loanRequest.LoanRequestMethod;
import static com.creditcloud.model.enums.loanRequest.LoanRequestMethod.BulletRepayment;
import static com.creditcloud.model.enums.loanRequest.LoanRequestMethod.MonthlyInterest;
import com.creditcloud.model.enums.loanRequest.LoanRequestPurpose;
import com.creditcloud.model.enums.loanRequest.LoanRequestStatus;
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

    private static final BigDecimal zero = new BigDecimal(0);

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
                               final LoanRequestMethod method) {
        int result = 0;
        if (method == LoanRequestMethod.BulletRepayment) {
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
     * @param loanRequest
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyze(final LoanRequest loanRequest,
                                     final Date asOfDate) {
        LoanDetail result = null;
        //get duration first
        Duration duration = new Duration(loanRequest.getDuration());
        //principal
        BigDecimal principal = new BigDecimal(loanRequest.getAmount());
        //now get rates
        BigDecimal rateYear = new BigDecimal(loanRequest.getRate()).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal rateDay = rateYear.divide(daysPerYear, mc);
        //dealing with different methods
        BigDecimal interest;
        switch (loanRequest.getMethod()) {
            case BulletRepayment:
                //add yearly interest
                interest = principal.multiply(rateYear).multiply(new BigDecimal(duration.getYears()));
                //add monthly interest
                interest = interest.add(principal.multiply(rateMonth).multiply(new BigDecimal(duration.getMonths())));
                //add daily interest
                interest = interest.add(principal.multiply(rateDay).multiply(new BigDecimal(duration.getDays())));
                //create result
                result = new LoanDetail(principal, interest, duration, BulletRepayment);
                //add single amortize item
                result.getRepayments().add(new Repayment(principal, interest, zero, DateUtils.offset(asOfDate, duration)));
                break;
            case MonthlyInterest:   //in this case we don't need to worry about duration.days since that must be 0
                BigDecimal amortizedInterest = principal.multiply(rateMonth);
                interest = amortizedInterest.multiply(new BigDecimal(duration.getTotalMonths()));
                //create result
                result = new LoanDetail(principal, interest, duration, MonthlyInterest);
                //add amortized items
                Date dueDate = asOfDate;
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
                break;
        }
        return result;
    }
}
