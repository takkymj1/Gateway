/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sobranie
 */
public class InvestRuleTest {

    InvestRule rule;

    public InvestRuleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        rule = new InvestRule(1000, 100000, 1000);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of valid method, of class InvestRule.
     */
    @Test
    public void testValid() {
        System.out.println("valid");
        assertEquals(true, InvestRule.valid(rule, 1000));
        assertEquals(false, InvestRule.valid(rule, 1000000));
    }

    /**
     * Test of normalize method, of class InvestRule.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        assertEquals(0, InvestRule.normalize(rule, 999));
        assertEquals(1000, InvestRule.normalize(rule, 1000));
        assertEquals(1000, InvestRule.normalize(rule, 1999));
        assertEquals(100000, InvestRule.normalize(rule, 123456678));
    }

}
