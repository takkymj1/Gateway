/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.calculator.LoanDetail.Duration;
import com.creditcloud.model.LoanRequest;
import com.creditcloud.model.enums.LoanRequestMethod;

/**
 *
 * @author sobranie
 */
public final class LoanCalculator {

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
    
    public static LoanDetail analyze (final LoanRequest loanRequest) {
        
        return null;
    }
}
