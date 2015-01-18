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

    @Test
    public void testRateToString() {
        int rate = 1;
        assertEquals(NumberUtils.rateToString(rate), "0.01%");

        rate = 0;
        assertEquals(NumberUtils.rateToString(rate), "0.0%");

        rate = 10;
        assertEquals(NumberUtils.rateToString(rate), "0.1%");

        rate = 11;
        assertEquals(NumberUtils.rateToString(rate), "0.11%");

        rate = 100;
        assertEquals(NumberUtils.rateToString(rate), "1.0%");

        rate = 110;
        assertEquals(NumberUtils.rateToString(rate), "1.1%");

        rate = 111;
        assertEquals(NumberUtils.rateToString(rate), "1.11%");

        rate = 1000;
        assertEquals(NumberUtils.rateToString(rate), "10.0%");

        rate = 1001;
        assertEquals(NumberUtils.rateToString(rate), "10.01%");

        rate = 1100;
        assertEquals(NumberUtils.rateToString(rate), "11.0%");

        rate = 1110;
        assertEquals(NumberUtils.rateToString(rate), "11.1%");

        rate = 1111;
        assertEquals(NumberUtils.rateToString(rate), "11.11%");
    }
}
