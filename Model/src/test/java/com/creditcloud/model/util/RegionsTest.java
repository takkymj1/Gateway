/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.util.Regions.Entry;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegionsTest {
    

    public RegionsTest() {
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
        ArrayList al = Regions.getRegionList("0");
        assertEquals(34,al.size());
        
        ArrayList bl = Regions.getRegionList("11");
        assertEquals(2,bl.size());
        ArrayList<Entry> bl1 = Regions.getRegionList("5422");
        assertEquals("琼结县",bl1.get(4).getRegion());
        
        ArrayList bl2 = Regions.getRegionList("12");
        assertEquals(2,bl2.size());

    }
}
