/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.calculator.LoanDetail.Duration;
import com.creditcloud.model.LoanRequest;
import com.creditcloud.model.enums.loanRequest.LoanRequestMethod;
import java.math.BigDecimal;

/**
 *
 * @author sobranie
 */
public final class LoanCalculator {
    
    private static final BigDecimal daysPerYear = new BigDecimal(365);

    /**
     * rate is in format like 2400 which is actually 24.00%
     */
    private static final BigDecimal rateScale = new BigDecimal(10000);

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
    
    public static LoanDetail analyze(final LoanRequest loanRequest) {
        //get duration first
        Duration duration = new Duration(loanRequest.getDuration());
        //principal
        BigDecimal principal = new BigDecimal(loanRequest.getAmount());
        //now calc total interest

        return null;
    }
}
