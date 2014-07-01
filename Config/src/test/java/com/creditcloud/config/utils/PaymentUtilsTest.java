/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.Fee;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.PaymentConfig;
import com.creditcloud.config.enums.FeePeriod;
import com.creditcloud.config.enums.FeePhase;
import com.creditcloud.config.enums.FeeScope;
import com.creditcloud.config.enums.FeeType;
import com.creditcloud.model.loan.LoanFee;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rooseek
 */
public class PaymentUtilsTest {

    public PaymentUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCheckTenderRate() {
        LoanFee loanFee = new LoanFee();
        FeeConfig feeConfig = new FeeConfig();
        PaymentConfig paymentConfig = new PaymentConfig();
        paymentConfig.setMaxTenderRate("0.10");
        int months = 1;

        /**
         * test guarantee fee
         */
        loanFee.setLoanGuaranteeFee(BigDecimal.valueOf(0.09));
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanGuaranteeFee(BigDecimal.valueOf(0.10));
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanGuaranteeFee(BigDecimal.valueOf(0.11));
        assertFalse(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));

        /**
         * test service fee
         */
        loanFee.setLoanGuaranteeFee(BigDecimal.ZERO);
        loanFee.setLoanServiceFee(BigDecimal.valueOf(0.09));
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanServiceFee(BigDecimal.valueOf(0.11));
        assertFalse(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));

        /**
         * test risk fee
         */
        loanFee.setLoanServiceFee(BigDecimal.ZERO);
        loanFee.setLoanRiskFee(BigDecimal.valueOf(0.09));
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanRiskFee(BigDecimal.valueOf(0.11));
        assertFalse(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));

        /**
         * test manage fee
         */
        feeConfig.setLoanManageFee(new Fee(FeeType.BOTH, BigDecimal.ZERO, BigDecimal.ZERO, FeePeriod.SINGLE, FeeScope.BOTH));
        feeConfig.getLoanManageFee().setPhase(FeePhase.LOAN);
        loanFee.setLoanRiskFee(BigDecimal.ZERO);
        loanFee.setLoanManageFee(BigDecimal.valueOf(0.09));
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanManageFee(BigDecimal.valueOf(0.11));
        assertFalse(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanManageFee(BigDecimal.valueOf(0.09));
        months = 3;
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        feeConfig.setLoanManageFee(new Fee(FeeType.BOTH, BigDecimal.ZERO, BigDecimal.ZERO, FeePeriod.MONTHLY, FeeScope.BOTH));
        assertFalse(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        feeConfig.getLoanManageFee().setPeriod(FeePeriod.SINGLE);
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));

        /**
         * test all above fee
         */
        loanFee.setLoanGuaranteeFee(new BigDecimal("0.025"));
        loanFee.setLoanServiceFee(new BigDecimal("0.025"));
        loanFee.setLoanRiskFee(new BigDecimal("0.025"));
        loanFee.setLoanManageFee(new BigDecimal("0.025"));
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        loanFee.setLoanManageFee(new BigDecimal("0.035"));
        assertFalse(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
        feeConfig.getLoanManageFee().setPhase(FeePhase.REPAY);
        assertTrue(PaymentUtils.checkTenderRate(loanFee, months, paymentConfig, feeConfig));
    }
}
