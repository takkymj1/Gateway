/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.PaymentConfig;
import com.creditcloud.config.enums.FeePeriod;
import com.creditcloud.config.enums.FeePhase;
import com.creditcloud.model.loan.LoanFee;
import java.math.BigDecimal;

/**
 *
 * @author rooseek
 */
public class PaymentUtils {

    /**
     * 查看LoanFee是否超过三方支付TenderRate上限
     *
     * @param loanFee
     * @param months
     * @param paymentConfig
     * @param feeConfig
     * @return
     */
    public static boolean checkTenderRate(LoanFee loanFee, int months, PaymentConfig paymentConfig, FeeConfig feeConfig) {
        BigDecimal maxTenderRate = new BigDecimal(paymentConfig.getMaxTenderRate());
        BigDecimal feeRate = BigDecimal.ZERO;
        if (loanFee.getLoanGuaranteeFee() != null) {
            feeRate = feeRate.add(loanFee.getLoanGuaranteeFee());
        }
        if (loanFee.getLoanServiceFee() != null) {
            feeRate = feeRate.add(loanFee.getLoanServiceFee());
        }

        if (loanFee.getLoanRiskFee() != null) {
            feeRate = feeRate.add(loanFee.getLoanRiskFee());
        }

        if (loanFee.getLoanManageFee() != null) {
            //放款时候收取
            if (FeePhase.LOAN.equals(feeConfig.getLoanManageFee().getPhase())) {
                //按月收取
                if (FeePeriod.MONTHLY.equals(feeConfig.getLoanManageFee().getPeriod())) {
                    feeRate = feeRate.add(loanFee.getLoanManageFee().multiply(BigDecimal.valueOf(months)));
                } else {
                    feeRate = feeRate.add(loanFee.getLoanManageFee());
                }
            }
        }
        return maxTenderRate.compareTo(feeRate) >= 0;
    }
}
