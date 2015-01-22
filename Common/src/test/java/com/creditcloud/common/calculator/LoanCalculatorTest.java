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
import java.math.BigDecimal;
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
        expected = new LocalDate(2015, 01, 22);
        i = 0;
        for (Repayment repayment : loanDetail.getRepayments()) {
            assertTrue(expected.plusYears(++i).equals(repayment.getDueDate()));
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
}
