/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class LoanRepaymentTest {

    public LoanRepaymentTest() {
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
     * Test of sortLoanRepaymentByAscendingDueDate method, of class
     * LoanRepayment.
     */
    @Test
    public void testSortLoanRepaymentByAscendingDueDate() {
        List<LoanRepayment> repayments = new ArrayList<>();
        List<LoanRepayment> expected = new ArrayList<>();
        int num = 3;
        for (int i = 0; i < num; i++) {
            LoanRepayment loanRepayment1 = new LoanRepayment();
            loanRepayment1.setRepayment(new Repayment());
            loanRepayment1.getRepayment().setDueDate(LocalDate.now().minusDays(i + 1));
            repayments.add(loanRepayment1);
            LoanRepayment loanRepayment2 = new LoanRepayment();
            loanRepayment2.setRepayment(new Repayment());
            loanRepayment2.getRepayment().setDueDate(LocalDate.now().minusDays(num - i));
            expected.add(loanRepayment2);
        }
        LoanRepayment.sortLoanRepaymentByAscendingDueDate(repayments);
        for (int i = 0; i < num; i++) {
            Assert.assertEquals(repayments.get(i).getRepayment().getDueDate(), expected.get(i).getRepayment().getDueDate());
        }
    }
}
