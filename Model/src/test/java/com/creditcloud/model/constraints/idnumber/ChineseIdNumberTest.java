/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.idnumber;

import org.junit.After;
import org.junit.AfterClass;
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
        assertEquals("四川", actual.getProvince());
        assertEquals(1988, actual.getYear());
        assertEquals(8, actual.getMonth());
        assertEquals(6, actual.getDay());
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
}