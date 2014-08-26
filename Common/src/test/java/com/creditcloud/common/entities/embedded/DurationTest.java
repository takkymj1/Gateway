/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class DurationTest {
    
    public DurationTest() {
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
    public void testMinusMonths() {
        Duration duration = new Duration(1, 0, 3);
        Duration expected = new Duration(0, 9, 3);
        Assert.assertEquals(expected, duration.minusMonths(3));
        Assert.assertEquals(null, duration.minusMonths(13));
        Assert.assertEquals(null, duration.minusMonths(-1));
        Assert.assertEquals(duration, new Duration(1, 0, 3));
        
        duration = new Duration(0, 3, 3);
        expected = new Duration(0, 0, 3);
        Assert.assertEquals(expected, duration.minusMonths(3));
        Assert.assertEquals(duration, new Duration(0, 3, 3));
        
        duration = new Duration(1, 3, 3);
        Assert.assertEquals(new Duration(1, 1, 3), duration.minusMonths(2));
        Assert.assertEquals(new Duration(0, 1, 3), duration.minusMonths(14));
        Assert.assertEquals(duration, new Duration(1, 3, 3));
    }
    
    @Test
    public void testPlusMonths() {
        Duration duration = new Duration(1, 0, 3);
        Assert.assertEquals(new Duration(1, 0, 3), duration);
        Assert.assertEquals(new Duration(1, 3, 3), duration.plusMonths(3));
        Assert.assertEquals(new Duration(2, 3, 3), duration.plusMonths(15));
        Assert.assertEquals(null, duration.plusMonths(-1));
        Assert.assertEquals(duration, new Duration(1, 0, 3));
    }
}
