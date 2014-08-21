/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

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
public class NumberUtilsTest {

    public NumberUtilsTest() {
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
    public void testBetween() {
        BigDecimal from = new BigDecimal(10);
        BigDecimal to = new BigDecimal(20);
        int amount = 10;
        assertTrue(NumberUtils.between(from, to, amount));
        assertFalse(NumberUtils.between(to, from, amount));
        amount = 20;
        assertTrue(NumberUtils.between(from, to, amount));
        amount = 9;
        assertFalse(NumberUtils.between(from, to, amount));
        amount = 21;
        assertFalse(NumberUtils.between(from, to, amount));

        BigDecimal temp = BigDecimal.valueOf(10);
        assertTrue(NumberUtils.between(from, to, temp));
        temp = BigDecimal.valueOf(20);
        assertTrue(NumberUtils.between(from, to, temp));
        temp = BigDecimal.valueOf(9);
        assertFalse(NumberUtils.between(from, to, temp));
        temp = BigDecimal.valueOf(21);
        assertFalse(NumberUtils.between(from, to, temp));

        to = from;
        temp = from;
        assertTrue(NumberUtils.between(from, to, temp));
    }
}
