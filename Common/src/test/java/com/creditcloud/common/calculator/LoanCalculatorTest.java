/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sobranie
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
     * Test of amortize method, of class LoanCalculator.
     */
    @Test
    public void testAmortize() {
        System.out.println("amortize");
        int duration = 365;
        int result = LoanCalculator.amortize(duration, RepaymentMethod.BulletRepayment);
        assertEquals(1, result);
        
        duration = 365;
        result = LoanCalculator.amortize(duration, RepaymentMethod.EqualInstallment);
        assertEquals(12, result);
        
        duration = 365 + 180;
        result = LoanCalculator.amortize(duration, RepaymentMethod.MonthlyInterest);
        assertEquals(18, result);
    }
}