/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.misc.Duration;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class DateUtilsTest {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    
    public DateUtilsTest() {
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
     * Test of offset method, of class DateUtils.
     */
    @Test
    public void testOffset() throws ParseException {
        System.out.println("offset");
        Date asOfDate = sdf.parse("20110130");
        Duration duration = new Duration(395);
        Date expResult = sdf.parse("20120229");
        Date result = DateUtils.offset(asOfDate, duration);
        assertEquals(expResult, result);
    }
}