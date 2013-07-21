/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

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
public class LanguageTest {

    public LanguageTest() {
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
    public void testContainChinese() {
        assertTrue(Language.containChinese("中文"));
        assertTrue(Language.containChinese("1中文a"));
        assertTrue(Language.containChinese("1a中文"));
        assertTrue(Language.containChinese("中文1a"));

        assertFalse(Language.containChinese("1"));
        assertFalse(Language.containChinese("a"));
        assertFalse(Language.containChinese(""));
    }

    @Test
    public void testIsChinese() {
        assertTrue(Language.isChinese("中文"));

        assertFalse(Language.isChinese("1a中文"));
        assertFalse(Language.isChinese("中文1a"));
        assertFalse(Language.isChinese("1"));
        assertFalse(Language.isChinese("a"));
        assertFalse(Language.isChinese(""));
    }

    @Test
    public void testContainNonASCII() {
//        assertTrue(Language.containNonASCII("中文"));
//        assertTrue(Language.containNonASCII("!！"));

        assertFalse(Language.containNonASCII("12"));
        assertFalse(Language.containNonASCII("ab"));
        assertFalse(Language.containNonASCII(" "));
        assertFalse(Language.containNonASCII("  "));
    }
}