/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.LoanDetail;
import com.creditcloud.model.loan.Repayment;
import junit.framework.Assert;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        LocalDate expected = new LocalDate(2014, 2, 28);
        for (Repayment repayment : loanDetail.getRepayments()) {
//            Assert.assertTrue(expected.equals(repayment.getDueDate()));
            expected = expected.plusMonths(1);
        }

        loanDetail = LoanCalculator.analyze(10000,
                                            new Duration(0, 3, 0),
                                            2400,
                                            RepaymentMethod.EqualInterest,
                                            new LocalDate(2014, 2, 28));
        expected = new LocalDate(2014, 3, 31);
        for (Repayment repayment : loanDetail.getRepayments()) {
   //         Assert.assertTrue(expected.equals(repayment.getDueDate()));
            expected = expected.plusMonths(1);
        }

        loanDetail = LoanCalculator.analyze(10000,
                                            new Duration(0, 12, 0),
                                            2400,
                                            RepaymentMethod.EqualInterest,
                                            new LocalDate(2014, 11, 30));
        expected = new LocalDate(2014, 12, 30);
        for (Repayment repayment : loanDetail.getRepayments()) {
   //         Assert.assertTrue(expected.equals(repayment.getDueDate()));
            expected = expected.plusMonths(1);
        }
    }
    
    @Test
    public void testCountDueDate(){
        LocalDate expected=null;
        expected=LoanCalculator.countDueDate(new LocalDate(2014,1,31));
        Assert.assertTrue(expected.equals(new LocalDate(2014,2,28)));
        expected=LoanCalculator.countDueDate(new LocalDate(2000,1,31));
        Assert.assertTrue(expected.equals(new LocalDate(2000,2,29)));
        expected=LoanCalculator.countDueDate(new LocalDate(2014,7,31));
        Assert.assertTrue(expected.equals(new LocalDate(2014,8,31)));
        expected=LoanCalculator.countDueDate(new LocalDate(2014,2,28));
        Assert.assertTrue(expected.equals(new LocalDate(2014,3,31)));
        expected=LoanCalculator.countDueDate(new LocalDate(2014,12,30));
        Assert.assertTrue(expected.equals(new LocalDate(2015,1,30)));
        expected=LoanCalculator.countDueDate(new LocalDate(2014,12,31));
        Assert.assertTrue(expected.equals(new LocalDate(2015,1,31)));
    }
}
  