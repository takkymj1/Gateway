/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.util;

import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.user.User;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author peili
 */
public class CloneUtilTest {
    
    public CloneUtilTest() {
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
    public void testCloneObj() {
        // GIVEN
        User user = new User();
        user.setName("testUserName");
        LoanRequest request = new LoanRequest();
        request.setUser(user);
        Loan loan = new Loan();
        loan.setLoanRequest(request);
        // WHEN
        Loan clonedLoan = (Loan) CloneUtil.cloneObj(loan);
        // THEN
        assertTrue(loan.equals(clonedLoan));
        // WHEN
        clonedLoan.getLoanRequest().setUser(null);
        // THEN
        assertFalse(loan.equals(clonedLoan));
        assertNull(clonedLoan.getLoanRequest().getUser());
        assertNotNull(loan.getLoanRequest().getUser());
        assertEquals("testUserName", loan.getLoanRequest().getUser().getName());
    }
}
