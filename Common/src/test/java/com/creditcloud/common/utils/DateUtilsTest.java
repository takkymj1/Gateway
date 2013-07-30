/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.misc.Duration;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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

    /**
     * Test of listDates method, of class DateUtils.
     */
    @Test
    public void testListDates() throws ParseException {

        Date start = sdf.parse("20130601");
        Date end = sdf.parse("20130630");
        List result = DateUtils.listDates(start, end);
        assertEquals(result.size(), 30);

        start = sdf.parse("20130630");
        result = DateUtils.listDates(start, end);
        assertEquals(result.size(), 1);

        start = sdf.parse("20130730");
        result = DateUtils.listDates(start, end);
        assertEquals(result.size(), 0);
    }
}