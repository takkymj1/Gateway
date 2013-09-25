/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.idnumber;

import com.creditcloud.model.constraints.validator.ChineseIdNumber;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class ChineseIdNumberTest {

    public ChineseIdNumberTest() {
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
    public void testCreate() {
        //18 numbers;
        String idNumber = "510105198808062022";
        ChineseIdNumber actual = ChineseIdNumber.create(idNumber);
        assertEquals(idNumber, actual.getIdNumber());
        assertEquals("四川省", actual.getProvince());
        assertEquals("成都市", actual.getCity());
        assertEquals("青羊区", actual.getCounty());
        assertEquals(1988, actual.getYear());
        assertEquals(8, actual.getMonth());
        assertEquals(6, actual.getDay());
        assertEquals(false, actual.isMale());

        idNumber = "15090119791011645X";
        actual = ChineseIdNumber.create(idNumber);
        assertEquals(idNumber, actual.getIdNumber());
        assertEquals("内蒙古自治区", actual.getProvince());
        assertEquals("乌兰察布市", actual.getCity());
        assertEquals("市辖区", actual.getCounty());
        assertEquals(1979, actual.getYear());
        assertEquals(10, actual.getMonth());
        assertEquals(11, actual.getDay());
        assertEquals(true, actual.isMale());

        idNumber = "120103199101153149";
        actual = ChineseIdNumber.create(idNumber);
        assertEquals(idNumber, actual.getIdNumber());
        assertEquals("天津市", actual.getProvince());
        assertEquals("市辖区", actual.getCity());
        assertEquals("河西区", actual.getCounty());
        assertEquals(1991, actual.getYear());
        assertEquals(01, actual.getMonth());
        assertEquals(15, actual.getDay());
        assertEquals(false, actual.isMale());

        idNumber = "653101199004216746";
        actual = ChineseIdNumber.create(idNumber);
        assertEquals(idNumber, actual.getIdNumber());
        assertEquals("新疆维吾尔自治区", actual.getProvince());
        assertEquals("喀什地区", actual.getCity());
        assertEquals("喀什市", actual.getCounty());
        assertEquals(1990, actual.getYear());
        assertEquals(4, actual.getMonth());
        assertEquals(21, actual.getDay());
        assertEquals(false, actual.isMale());


        //15 numbers;
//        idNumber = "510105880806201";
//        actual = ChineseIdNumber.create(idNumber);
//        assertEquals(idNumber, actual.getIdNumber());
//        assertEquals("四川", actual.getProvince());
//        assertEquals(1988, actual.getYear());
//        assertEquals(8, actual.getMonth());
//        assertEquals(6, actual.getDay());
//        assertEquals(true, actual.isMale());

    }

    @Test
    public void testGender() {
        boolean result = ChineseIdNumber.isMale("510105198808062022");
        Assert.assertFalse(result);

        result = ChineseIdNumber.isMale("15090119791011645X");
        Assert.assertTrue(result);
    }

    @Test
    public void testDateOfBirth() {
        Date date = ChineseIdNumber.getDateOfBirth("510105198808062022");
        Assert.assertNotNull(date);
        //1988-08-06
        Date expected = new Date(586796400000l);
        Assert.assertTrue(DateUtils.isSameDay(date, expected));
    }
}