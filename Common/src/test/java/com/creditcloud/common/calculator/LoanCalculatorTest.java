/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.utils.DateUtils;
import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.loan.RepaymentPeriod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.LoanDetail;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
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

    //值为0时,调用没有repayDateOfMonth参数的方法
    private final int repayDateOfMonth = 10;
    
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
    public void testAnalyzeMonthly(){
        LoanDetail loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.MonthlyInterest, 
                                            new LocalDate(2015, 01, 22));
        //按周期付息，到期还本，每个月还款
        LoanDetail loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.MonthlyInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly, repayDateOfMonth);
        //固定日期在起息日之前，需要把月份+1
        int fixMonth = 0;
        if(repayDateOfMonth - 22 < 0){
            fixMonth = fixMonth + 1;
        }
        
        for (int i = 0; i < loanDetail.getRepayments().size(); i++) {
            Repayment repayment = loanDetail.getRepayments().get(i);
            Repayment repaymentWithPeriod = loanDetailWithPeriod.getRepayments().get(i);
            assertTrue(repayment.getAmountInterest()
                    .equals(repaymentWithPeriod.getAmountInterest()));
            if(i !=  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }
        }
        //EqualInstallment
        loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 01, 22));
        //按周期等额本息，每个月还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly, repayDateOfMonth);
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
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            } else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }
        }
        //EqualPrincipal
        loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualPrincipal, 
                                            new LocalDate(2015, 01, 22));
        //按周期等额本金，每个月还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualPrincipal, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly, repayDateOfMonth);
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
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }
        }
        //EqualInterest
        loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 01, 22));
        //按周期平息，到期还本，每个月还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Monthly, repayDateOfMonth);
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
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repaymentWithPeriod.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.Monthly.getMonthsOfPeriod(),0))));
                }
            }
        }
    }
    
    @Test
    public void testAnalyzeBiMonthly(){
        //按周期付息，到期还本，每两个月还款
        LoanDetail loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(0, 6, 0),
                                            1200, RepaymentMethod.MonthlyInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.BiMonthly, repayDateOfMonth);
        BigDecimal expectedAmortizedInterest = new BigDecimal(1000000 * 0.01 * 2).setScale(2, NumberConstant.ROUNDING_MODE);
        BigDecimal expectedPrincipal = new BigDecimal(1000000);
        int fixMonth = 0;
        if(repayDateOfMonth - 22 < 0){
            fixMonth = fixMonth + 1;
        }
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            assertTrue(repayment.getAmountInterest().equals(expectedAmortizedInterest));
            if(i != loanDetailWithPeriod.getRepayments().size() - 1){
                if (repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth+(i+1)*RepaymentPeriod.BiMonthly.getMonthsOfPeriod(),0))));
                }
            }
            if(i == loanDetailWithPeriod.getRepayments().size() - 1){
                assertTrue(repayment.getAmountPrincipal().equals(expectedPrincipal));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0, (i+1)*RepaymentPeriod.BiMonthly.getMonthsOfPeriod(),0))));
                }
            }
        }
        
        //按周期等额本金，每两个月还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(900000), 
                                            new Duration(0, 6, 0),
                                            1200, RepaymentMethod.EqualPrincipal, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.BiMonthly, repayDateOfMonth);
        BigDecimal expectedAmortizedPrincipal = new BigDecimal(300000).setScale(2, NumberConstant.ROUNDING_MODE);
        BigDecimal[] interests = new BigDecimal[3];
        interests[0] = new BigDecimal(900000 * 0.01 * 2).setScale(2, NumberConstant.ROUNDING_MODE);
        interests[1] = new BigDecimal((900000 - 300000) * 0.01 * 2).setScale(2, NumberConstant.ROUNDING_MODE);
        interests[2] = new BigDecimal((900000 - 300000 * 2)  * 0.01 * 2).setScale(2, NumberConstant.ROUNDING_MODE);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            assertTrue(repayment.getAmountInterest().equals(interests[i]));
            if(i != loanDetailWithPeriod.getRepayments().size() - 1){
                if (repayDateOfMonth > 0){
                assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0, fixMonth + (i+1)*RepaymentPeriod.BiMonthly.getMonthsOfPeriod(),0))));
                }
            }
            if(i == loanDetailWithPeriod.getRepayments().size() - 1){
                assertTrue(repayment.getAmountPrincipal().equals(expectedAmortizedPrincipal));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0, (i+1)*RepaymentPeriod.BiMonthly.getMonthsOfPeriod(),0))));
                }
            }
        }
    }
    
    @Test
    public void testAnalyzeQuarterly(){
        //按周期等额本息，每个季度还款
        LoanDetail loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(1, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 02, 22),
                                            RepaymentPeriod.Quarterly, repayDateOfMonth);
        
        int fixMonth = 0;
        if(repayDateOfMonth - 22 < 0){
            fixMonth = fixMonth + 1;
        }
        BigDecimal expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            //验证等额本息
            if(i > 0 
                    && i !=  loanDetailWithPeriod.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmount(RepayType.PrincipalAndInterest)));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + 1+(i+1)*RepaymentPeriod.Quarterly.getMonthsOfPeriod(),0))));
                }
            }else if(i == loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,1+(i+1)*RepaymentPeriod.Quarterly.getMonthsOfPeriod(),0))));
                }
            }
        }
        assertTrue(expectedPrincipal.equals(new BigDecimal(1000000).setScale(2, NumberConstant.ROUNDING_MODE)));
    
        //按周期平息，到期还本，每个季度还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(1, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 02, 22),
                                            RepaymentPeriod.Quarterly, repayDateOfMonth);
        expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            if(i > 0 
                    && i !=  loanDetailWithPeriod.getRepayments().size() - 1){//最后一次会修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmountInterest()
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmountInterest()));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(
                            DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),//2月没有31号，使用1月计算，之后再补回相差月份
                                    new Duration(0,fixMonth + 1+(i+1)*RepaymentPeriod.Quarterly.getMonthsOfPeriod(),0))));
                }
            }else if(i == loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,1+(i+1)*RepaymentPeriod.Quarterly.getMonthsOfPeriod(),0))));
                }
            }
        }
        assertTrue(expectedPrincipal.equals(new BigDecimal(1000000).setScale(2, NumberConstant.ROUNDING_MODE)));
    }
    
    @Test
    public void testAnalyzeHalfYearly(){
        //按周期等额本息，每半年还款
        LoanDetail loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.HalfYearly, repayDateOfMonth);
        
        int fixMonth = 0;
        if(repayDateOfMonth - 22 < 0){
            fixMonth = fixMonth + 1;
        }
        BigDecimal expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            //验证等额本息
            if(i > 0 
                    && i !=  loanDetailWithPeriod.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmount(RepayType.PrincipalAndInterest)));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.HalfYearly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.HalfYearly.getMonthsOfPeriod(),0))));
                }
            }
        }
        assertTrue(expectedPrincipal.equals(new BigDecimal(1000000).setScale(2, NumberConstant.ROUNDING_MODE)));
    
        //按周期平息，到期还本，每半年还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(1, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.HalfYearly, repayDateOfMonth);
        expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            if(i > 0 
                    && i !=  loanDetailWithPeriod.getRepayments().size() - 1){//最后一次会修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmountInterest()
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmountInterest()));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.HalfYearly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.HalfYearly.getMonthsOfPeriod(),0))));
                }
            }
        }
        assertTrue(expectedPrincipal.equals(new BigDecimal(1000000).setScale(2, NumberConstant.ROUNDING_MODE)));
    }
    
    @Test
    public void testAnalyzeYearly(){
        //按周期等额本金，每年还款
        LoanDetail loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(4, 0, 0),
                                            1200, RepaymentMethod.EqualPrincipal, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Yearly, repayDateOfMonth);
        int fixMonth = 0;
        if(repayDateOfMonth - 22 < 0){
            fixMonth = fixMonth + 1;
        }
        BigDecimal expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            //验证等额本金
            if(i > 0 
                    && i !=  loanDetailWithPeriod.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmountPrincipal()
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmountPrincipal()));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.Yearly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.Yearly.getMonthsOfPeriod(),0))));
                }
            }
        }
        assertTrue(expectedPrincipal.equals(new BigDecimal(1000000).setScale(2, NumberConstant.ROUNDING_MODE)));
    
        //按周期平息，到期还本，每年还款
        loanDetailWithPeriod = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(4, 0, 0),
                                            1200, RepaymentMethod.EqualInterest, 
                                            new LocalDate(2015, 01, 22),
                                            RepaymentPeriod.Yearly, repayDateOfMonth);
        expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetailWithPeriod.getRepayments().size(); i++) {
            Repayment repayment = loanDetailWithPeriod.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            //验证等额利息
            if(i > 0 
                    && i !=  loanDetailWithPeriod.getRepayments().size() - 1){//最后一次会修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmountInterest()
                        .equals(loanDetailWithPeriod.getRepayments().get(i-1).getAmountInterest()));
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, repayDateOfMonth),new Duration(0,fixMonth + (i+1)*RepaymentPeriod.Yearly.getMonthsOfPeriod(),0))));
                }
            }else if(i ==  loanDetailWithPeriod.getRepayments().size() - 1){
                if(repayDateOfMonth > 0){
                    assertTrue(repayment.getDueDate().equals(DateUtils.offset(new LocalDate(2015, 01, 22),new Duration(0,(i+1)*RepaymentPeriod.Yearly.getMonthsOfPeriod(),0))));
                }
            }
        }
        assertTrue(expectedPrincipal.equals(new BigDecimal(1000000).setScale(2, NumberConstant.ROUNDING_MODE)));
    }
    
    @Test
    public void testAnalyzeRoundingAmount() {
        LoanDetail loanDetail = LoanCalculator.analyze(new BigDecimal(1000000), 
                                            new Duration(2, 0, 0),
                                            1200, RepaymentMethod.EqualInstallment, 
                                            new LocalDate(2015, 01, 22));
        
        BigDecimal expectedPrincipal = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetail.getRepayments().size(); i++) {
            Repayment repayment = loanDetail.getRepayments().get(i);
            expectedPrincipal = expectedPrincipal.add(repayment.getAmountPrincipal());
            //验证等额本息
            if(i > 0 
                    && i !=  loanDetail.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                        .equals(loanDetail.getRepayments().get(i-1).getAmount(RepayType.PrincipalAndInterest)));
            }
        }
        
        LoanDetail loanDetail2 = LoanCalculator.analyze(new BigDecimal(1000000), 
                                                        new Duration(2, 0, 0),
                                                        1200, RepaymentMethod.EqualInstallment, 
                                                        new LocalDate(2015, 01, 22),
                                                       RoundingMode.DOWN);
        System.out.println(loanDetail2);
        
        BigDecimal expectedPrincipal2 = new BigDecimal(BigInteger.ZERO);
        for (int i = 0; i < loanDetail2.getRepayments().size(); i++) {
            Repayment repayment = loanDetail2.getRepayments().get(i);
            expectedPrincipal2 = expectedPrincipal2.add(repayment.getAmountPrincipal());
            //验证等额本息
            if(i > 0 
                    && i !=  loanDetail2.getRepayments().size() - 1){//最后一次修正四舍五入带来的误差，不会与之前相等
                assertTrue(repayment.getAmount(RepayType.PrincipalAndInterest)
                        .equals(loanDetail2.getRepayments().get(i-1).getAmount(RepayType.PrincipalAndInterest)));
            }
        }
        //使用RoundingMode.DOWN进位方式的利息值会小
        assertTrue(loanDetail.getInterest().compareTo(loanDetail2.getInterest()) >= 0);
    }
}
