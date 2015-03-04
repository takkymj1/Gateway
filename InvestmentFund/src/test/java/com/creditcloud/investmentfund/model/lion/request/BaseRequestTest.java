/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.request;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BaseRequestTest {
    
    public BaseRequestTest() {
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
     * Test of sign method, of class BaseRequest.
     */
    @Test
    public void testSign() {
        long stamp = System.currentTimeMillis();
        BaseRequest instance = new BaseRequest("attributeSample", "meridSample", stamp, null);
        Map result = instance.sign();
        assertEquals(result.get("attribute"), instance.getAttribute());
        assertEquals(result.get("merid"), instance.getMerid());
        assertEquals(result.get("stamp"), String.valueOf(instance.getStamp()));
        assertEquals(result.size(), 3);
        System.err.println(new BaseRequest().sign().size());
        assertEquals(new BaseRequest().sign().size(), 1);
    }
    
}
