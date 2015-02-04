/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.loan.RepaymentPeriod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.LoanDetail;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * @author rooseek
 */
public class LoanCalculatorTest {

    public LoanCalculatorTest() {
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

    /**
     * Test of analyze method, of class LoanCalculator.
     */
    @Test
    public void testAnalyze() {
        LoanDetail loanDetail = LoanCalculator.analyze(10000,
                                                       new Duration(0, 3, 0),
                                                       2400,
                                                       RepaymentMethod.EqualInterest,
                                                       new LocalDate(2014, 1, 31));
        System.out.println(loanDetail);
        LocalDate expected = new LocalDate(2014, 1, 31);
        int i = 0;
        for (Repayment repayment : loanDetail.getRepayments()) {
            assertTrue(expected.plusMonths(++i).equals(repayment.getDueDate()));
        }

        loanDetail = LoanCalculator.analyze(10000,
                                            new Duration(0, 3, 0),
                                            2400,
                                            RepaymentMethod.EqualInterest,
                                            new LocalDate(2014, 2, 28));
        expected = new LocalDate(2014, 2, 28);
        i = 0;
        for (Repayment repayment : loanDetail.getRepayments()) {
            assertTrue(expected.plusMonths(++i).equals(repayment.getDueDate()));
        }

        loanDetail = LoanCalculator.analyze(10000,
                                            new Duration(0, 12, 0),
                                            2400,
                                            RepaymentMethod.EqualInterest,
                                            new LocalDate(2014, 11, 30));
        expected = new LocalDate(2014, 11, 30);
        i = 0;
        for (Repayment repayment : loanDetail.getRepayments()) {
            assertTrue(expected.plusMonths(++i).equals(repayment.getDueDate()));
        }
        
        loanDetail = LoanCalculator.analyze(1000000, 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.YearlyInterest, 
                                            new LocalDate(2015, 01, 22));
        LocalDate expectedDate = new LocalDate(2015, 01, 22);
        BigDecimal expectedAmortizedInterest = new BigDecimal(1000000 * 0.12).setScale(2, NumberConstant.ROUNDING_MODE);
        BigDecimal expectedPrincipal = new BigDecimal(BigInteger.ZERO).setScale(2);
        BigDecimal expectedOutstandingPrincipal = loanDetail.getPrincipal();
        i = 0;
        for (Repayment repayment : loanDetail.getRepayments()) {
            assertTrue(expectedDate.plusYears(++i).equals(repayment.getDueDate()));
            assertTrue(expectedAmortizedInterest.equals(repayment.getAmountInterest()));
            //last ONE, pay off the principal and interest
            if(i == loanDetail.getRepayments().size()){
                expectedPrincipal = loanDetail.getPrincipal();
                expectedOutstandingPrincipal = expectedOutstandingPrincipal.subtract(loanDetail.getPrincipal())
                                                .setScale(2, NumberConstant.ROUNDING_MODE);
            }
            assertTrue(expectedPrincipal.equals(repayment.getAmountPrincipal()));
            assertTrue(expectedOutstandingPrincipal.equals(repayment.getAmountOutstanding()));
        }
    }

    @Test
    public void testCountDueDate() {
        LocalDate expected = null;
        expected = LoanCalculator.countDueDate(new LocalDate(2014, 1, 31), 1);
        assertTrue(expected.equals(new LocalDate(2014, 2, 28)));
        expected = LoanCalculator.countDueDate(new LocalDate(2000, 1, 31), 3);
        assertTrue(expected.equals(new LocalDate(2000, 4, 30)));
        expected = LoanCalculator.countDueDate(new LocalDate(2014, 7, 31), 1);
        assertTrue(expected.equals(new LocalDate(2014, 8, 31)));
        expected = LoanCalculator.countDueDate(new LocalDate(2014, 2, 28), 5);
        assertTrue(expected.equals(new LocalDate(2014, 7, 31)));
        expected = LoanCalculator.countDueDate(new LocalDate(2014, 12, 30), 2);
        assertTrue(expected.equals(new LocalDate(2015, 2, 28)));
        expected = LoanCalculator.countDueDate(new LocalDate(2014, 12, 31), 1);
        assertTrue(expected.equals(new LocalDate(2015, 1, 31)));
        expected = LoanCalculator.countDueDate(new LocalDate(2000, 1, 30), 1);
        assertTrue(expected.equals(new LocalDate(2000, 2, 29)));
    }

    @Test
    public void testAnalyzeNew() {
        List<Repayment> list = null;
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2014, 1, 31)).getRepayments();

        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2014, 2, 28)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2014, 3, 31)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2014, 4, 30)));
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2000, 1, 31)).getRepayments();

        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2000, 2, 29)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2000, 3, 31)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2000, 4, 30)));
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2014, 7, 31)).getRepayments();
        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2014, 8, 31)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2014, 9, 30)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2014, 10, 31)));
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2014, 2, 28)).getRepayments();
        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2014, 3, 31)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2014, 4, 30)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2014, 5, 31)));
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2014, 12, 30)).getRepayments();
        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2015, 1, 30)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2015, 2, 28)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2015, 3, 30)));
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2014, 12, 31)).getRepayments();
        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2015, 1, 31)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2015, 2, 28)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2015, 3, 31)));
        list = LoanCalculator.analyzeNew(1000,
                                         new Duration(0, 3, 0),
                                         2400,
                                         RepaymentMethod.EqualInterest,
                                         new LocalDate(2014, 3, 15)).getRepayments();
        assertTrue(list.get(0).getDueDate().equals(new LocalDate(2014, 4, 15)));
        assertTrue(list.get(1).getDueDate().equals(new LocalDate(2014, 5, 15)));
        assertTrue(list.get(2).getDueDate().equals(new LocalDate(2014, 6, 15)));
    }
    
    @Test
    public void testAnalyzeMulti(){
        //MonthlyInterest
        LoanDetail loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.MonthlyInterest, 
                                            new LocalDate(2015, 01, 22));
        LoanDetail loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.MonthlyInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly);
        for (int i = 0; i < loanDetail.getRepayments().size(); i++) {
            Repayment repayment = loanDetail.getRepayments().get(i);
            Repayment repaymentWithPeriod = loanDetailWithPeriod.getRepayments().get(i);
            assertTrue(repayment.getAmountInterest()
                    .equals(repaymentWithPeriod.getAmountInterest()));
        }
        //EqualInstallment
        loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 01, 22));
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly);
        for (int i = 0; i < loanDetail.getRepayments().size(); i++) {
            Repayment repayment = loanDetail.getRepayments().get(i);
            Repayment repaymentWithPeriod = loanDetailWithPeriod.getRepayments().get(i);
            //period=Monthly时，计算结果应与旧方法一致
            assertTrue(repayment.getAmountInterest()
                    .equals(repaymentWithPeriod.getAmountInterest()));
            assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                    .equals(repaymentWithPeriod.getAmount(RepayType.PrincipalAndInterest)));
            //验证等额本息
            if(i > 0 
                    && i !=  loanDetail.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                        .equals(loanDetail.getRepayments().get(i-1).getAmount(RepayType.PrincipalAndInterest)));
                assertTrue(repaymentWithPeriod.getAmount(RepayType.PrincipalAndInterest)
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmount(RepayType.PrincipalAndInterest)));
            }
        }
        //EqualPrincipal
        loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualPrincipal, 
                                            new LocalDate(2015, 01, 22));
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualPrincipal, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly);
        for (int i = 0; i < loanDetail.getRepayments().size(); i++) {
            Repayment repayment = loanDetail.getRepayments().get(i);
            Repayment repaymentWithPeriod = loanDetailWithPeriod.getRepayments().get(i);
            assertTrue(repayment.getAmountInterest()
                    .equals(repaymentWithPeriod.getAmountInterest()));
            assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                    .equals(repaymentWithPeriod.getAmount(RepayType.PrincipalAndInterest)));
            //验证等额本金
            if(i > 0 
                    && i !=  loanDetail.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmountPrincipal()
                        .equals(loanDetail.getRepayments().get(i-1).getAmountPrincipal()));
                assertTrue(repaymentWithPeriod.getAmountPrincipal()
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmountPrincipal()));
            }
        }
        //EqualInterest
        loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 01, 22));
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.BiMonthly);
        for (int i = 0; i < loanDetail.getRepayments().size(); i++) {
            Repayment repayment = loanDetail.getRepayments().get(i);
            Repayment repaymentWithPeriod = loanDetailWithPeriod.getRepayments().get(i);
            assertTrue(repayment.getAmountInterest()
                    .equals(repaymentWithPeriod.getAmountInterest()));
            assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                    .equals(repaymentWithPeriod.getAmount(RepayType.PrincipalAndInterest)));
            //验证等额利息
            if(i > 0 
                    && i !=  loanDetail.getRepayments().size() - 1){//最后一次会修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmountInterest()
                        .equals(loanDetail.getRepayments().get(i-1).getAmountInterest()));
                assertTrue(repaymentWithPeriod.getAmountInterest()
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmountInterest()));
            }
        }
    }
}
