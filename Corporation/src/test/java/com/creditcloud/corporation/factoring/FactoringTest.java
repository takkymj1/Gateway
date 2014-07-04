/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.factoring;

import org.apache.commons.lang3.ArrayUtils;
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
public class FactoringTest {

    private String original = "a,b,c";

    private String[] splitted = new String[]{"a", "b", "c"};

    public FactoringTest() {
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
    public void testFromCentralBankRegisterNo() {
        assertArrayEquals(splitted, Factoring.fromCentralBankRegisterNo(original));

        assertArrayEquals(ArrayUtils.EMPTY_STRING_ARRAY, Factoring.fromCentralBankRegisterNo(null));

        assertArrayEquals(new String[]{"a"}, Factoring.fromCentralBankRegisterNo("a"));
    }

    @Test
    public void testToCentralBankRegisterNo() {
        assertEquals(original, Factoring.toCentralBankRegisterNo(splitted));

        assertEquals(null, Factoring.toCentralBankRegisterNo(null));

        assertEquals("a", Factoring.toCentralBankRegisterNo(new String[]{"a"}));
    }

}
