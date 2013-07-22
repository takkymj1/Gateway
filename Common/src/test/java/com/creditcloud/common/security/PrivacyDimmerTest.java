/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import com.creditcloud.model.User;
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
public class PrivacyDimmerTest {
    
    public PrivacyDimmerTest() {
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
     * Test of dim method, of class PrivacyDimmer.
     */
    @Test
    public void testDim() {
        System.out.println("dim");
        User user = new User();
        user.setMobile("13901210504");
        user.setIdNumber("110105198304288330");
        user = PrivacyDimmer.dim(user);
        assertEquals(null, user.getMobile(), "139****0504");
        assertEquals(null, user.getIdNumber(), "11010519*********0");
    }
}