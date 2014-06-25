/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.Fee;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.enums.FeePeriod;
import com.creditcloud.config.enums.FeeScope;
import com.creditcloud.config.enums.FeeType;
import com.creditcloud.model.loan.AdvancePenalty;
import com.creditcloud.model.loan.OverduePenalty;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
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
public class FeeUtilsTest {

    public FeeUtilsTest() {
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
    public void testMergeFee() {
        Fee expectedFee;
        BigDecimal rate = new BigDecimal("0.02");
        FeeScope scope = FeeScope.PRINCIPAL;
        FeePeriod period = FeePeriod.SINGLE;

        Fee defaultFee = new Fee(FeeType.FLOATING, BigDecimal.ZERO, rate, period, scope);
        Fee result = FeeUtils.mergeFee(defaultFee, BigDecimal.ZERO, scope);
        expectedFee = new Fee(FeeType.FLOATING, BigDecimal.ZERO, BigDecimal.ZERO, period, scope);
        assertEquals(expectedFee, result);
    }

    @Test
    public void testIsAdvanceRepay() {
        FeeConfig config = new FeeConfig();
        config.setMinDaysForAdvanceRepay(5);

        Repayment repayment = new Repayment(BigDecimal.valueOf(10000),
                                            BigDecimal.valueOf(1000),
                                            BigDecimal.valueOf(100000),
                                            LocalDate.now().plusDays(10));
        boolean result = FeeUtils.isValidAdvanceRepay(config, repayment);
        assertTrue(result);

        /**
         * valid advance repay
         */
        repayment.setDueDate(LocalDate.now().plusDays(10));
        result = FeeUtils.isValidAdvanceRepay(config, repayment);
        assertTrue(result);

        repayment.setDueDate(LocalDate.now().plusDays(6));
        result = FeeUtils.isValidAdvanceRepay(config, repayment);
        assertTrue(result);

        /**
         * invalid advance repay
         */
        repayment.setDueDate(LocalDate.now().plusDays(5));
        result = FeeUtils.isValidAdvanceRepay(config, repayment);
        assertTrue(!result);

        repayment.setDueDate(LocalDate.now().plusDays(1));
        result = FeeUtils.isValidAdvanceRepay(config, repayment);
        assertTrue(!result);

        repayment.setDueDate(LocalDate.now().minusDays(1));
        result = FeeUtils.isValidAdvanceRepay(config, repayment);
        assertTrue(!result);
    }

    /**
     * Test of advanceFee method, of class FeeUtils.
     */
    @Test
    public void testAdvanceFee() {
        FeeConfig config = new FeeConfig();
        Fee feeToClient = new Fee(FeeType.FLOATING, BigDecimal.ZERO, BigDecimal.valueOf(0.50), FeePeriod.SINGLE, FeeScope.INTEREST);
        Fee feeToInvest = new Fee(FeeType.FLOATING, BigDecimal.ZERO, BigDecimal.valueOf(0.10), FeePeriod.SINGLE, FeeScope.INTEREST);
        config.setAdvanceRepayClientFee(feeToClient);
        config.setAdvanceRepayInvestFee(feeToInvest);
        config.setMinDaysForAdvanceRepay(5);

        Repayment repayment = new Repayment(BigDecimal.valueOf(10000), BigDecimal.valueOf(1000), BigDecimal.valueOf(100000), LocalDate.now().plusDays(10));
        AdvancePenalty result = FeeUtils.advanceFee(config, repayment);
        AdvancePenalty expected = new AdvancePenalty(BigDecimal.valueOf(500.00), BigDecimal.valueOf(100.00));
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        //min days advance repay without any advance penalty
        repayment.setDueDate(LocalDate.now().plusDays(1));
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        config.setMinDaysForAdvanceRepay(0);
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.valueOf(500.00), BigDecimal.valueOf(100.00));
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        repayment.setDueDate(LocalDate.now());
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        config.setMinDaysForAdvanceRepay(5);
        repayment.setDueDate(LocalDate.now().plusDays(5));
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        repayment.setDueDate(LocalDate.now().plusDays(6));
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        if (equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        config.getAdvanceRepayClientFee().setScope(FeeScope.PRINCIPAL);
        config.getAdvanceRepayInvestFee().setScope(FeeScope.PRINCIPAL);
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.valueOf(5000.00), BigDecimal.valueOf(1000.00));
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        config.getAdvanceRepayClientFee().setScope(FeeScope.BOTH);
        config.getAdvanceRepayInvestFee().setScope(FeeScope.BOTH);
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.valueOf(5500.00), BigDecimal.valueOf(1100.00));
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        config.getAdvanceRepayClientFee().setScope(FeeScope.OUTSTANDING);
        config.getAdvanceRepayInvestFee().setScope(FeeScope.OUTSTANDING);
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.valueOf(50000.00), BigDecimal.valueOf(10000.00));
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }

        config.getAdvanceRepayClientFee().setPeriod(FeePeriod.MONTHLY);
        config.getAdvanceRepayInvestFee().setPeriod(FeePeriod.MONTHLY);
        result = FeeUtils.advanceFee(config, repayment);
        expected = new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        if (!equalAdvancePenalty(result, expected)) {
            fail("not equal");
        }
    }

    @Test
    public void testOverduePenalty() {
        FeeConfig config = new FeeConfig();
        Fee overdueFee = new Fee(FeeType.FLOATING, BigDecimal.ZERO, BigDecimal.valueOf(0.001), FeePeriod.DAILY, FeeScope.INTEREST);
        Fee penaltyFee = new Fee(FeeType.FLOATING, BigDecimal.ZERO, BigDecimal.valueOf(0.002), FeePeriod.DAILY, FeeScope.INTEREST);
        config.setLoanOverdueFee(overdueFee);
        config.setLoanPenaltyFee(penaltyFee);
        config.setMaxDaysForOverdueFee(10);

        Repayment repayment = new Repayment(BigDecimal.valueOf(10000), BigDecimal.valueOf(1000), BigDecimal.valueOf(100000), LocalDate.now().minusDays(10));
        OverduePenalty result = FeeUtils.overdueFee(config, repayment);
        OverduePenalty expected = new OverduePenalty(BigDecimal.valueOf(10), BigDecimal.valueOf(20));
        if (!equalOverduePenalty(result, expected)) {
            fail("not equal");
        }

        repayment.setDueDate(LocalDate.now().minusDays(5));
        result = FeeUtils.overdueFee(config, repayment);
        expected = new OverduePenalty(BigDecimal.valueOf(5), BigDecimal.valueOf(10));
        if (!equalOverduePenalty(result, expected)) {
            fail("not equal");
        }

        repayment.setDueDate(LocalDate.now().minusDays(11));
        result = FeeUtils.overdueFee(config, repayment);
        expected = new OverduePenalty(BigDecimal.valueOf(10), BigDecimal.valueOf(20));
        if (!equalOverduePenalty(result, expected)) {
            fail("not equal");
        }

        config.getLoanOverdueFee().setScope(FeeScope.PRINCIPAL);
        config.getLoanPenaltyFee().setScope(FeeScope.PRINCIPAL);
        result = FeeUtils.overdueFee(config, repayment);
        expected = new OverduePenalty(BigDecimal.valueOf(100), BigDecimal.valueOf(200));
        if (!equalOverduePenalty(result, expected)) {
            fail("not equal");
        }

        config.getLoanOverdueFee().setScope(FeeScope.BOTH);
        config.getLoanPenaltyFee().setScope(FeeScope.BOTH);
        result = FeeUtils.overdueFee(config, repayment);
        expected = new OverduePenalty(BigDecimal.valueOf(110), BigDecimal.valueOf(220));
        if (!equalOverduePenalty(result, expected)) {
            fail("not equal");
        }

        config.getLoanOverdueFee().setScope(FeeScope.OUTSTANDING);
        config.getLoanPenaltyFee().setScope(FeeScope.OUTSTANDING);
        result = FeeUtils.overdueFee(config, repayment);
        expected = new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        if (!equalOverduePenalty(result, expected)) {
            fail("not equal");
        }
    }

    @Test
    public void testCopyOf() {
        FeeConfig config = new FeeConfig();
        config.setMaxDaysForOverdueFee(1);
        Fee loanServiceFee = new Fee(FeeType.BOTH, BigDecimal.ZERO, BigDecimal.ZERO, FeePeriod.SINGLE, FeeScope.BOTH);
        config.setLoanServiceFee(loanServiceFee);

        FeeConfig copy = FeeUtils.copyOf(config);
        assertEquals(copy.getMaxDaysForOverdueFee(), 1);
        assertEquals(copy.getLoanServiceFee(), loanServiceFee);

        copy.setMaxDaysForOverdueFee(2);
        copy.getLoanServiceFee().setPeriod(FeePeriod.MONTHLY);

        assertEquals(config.getMaxDaysForOverdueFee(), 1);
        assertEquals(config.getLoanServiceFee(), loanServiceFee);
    }

    private boolean equalAdvancePenalty(AdvancePenalty result, AdvancePenalty expected) {
        return result.getFeeToClient().compareTo(expected.getFeeToClient()) == 0
                && result.getFeeToInvest().compareTo(expected.getFeeToInvest()) == 0;
    }

    private boolean equalOverduePenalty(OverduePenalty result, OverduePenalty expected) {
        return result.getOverdue().compareTo(expected.getOverdue()) == 0
                && result.getPenalty().compareTo(expected.getPenalty()) == 0;
    }
}
