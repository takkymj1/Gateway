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
    
    private static User user;
    
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
        user = new User();
        user.setMobile("13901210504");
        user.setIdNumber("110105198304288330");
        user.setEmail("sobranie9@126.com");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dim method, of class PrivacyDimmer.
     */
    @Test
    public void testDimMobile() {
        System.out.println("dim mobile");
        user = PrivacyDimmer.dim(user);
        assertEquals(null, "139****0504", user.getMobile());
    }
    
    @Test
    public void testDimIdNumber() {
        System.out.println("dim IdNumber");
        user = PrivacyDimmer.dim(user);
        assertEquals(null, "11010519*********0", user.getIdNumber());
    }
    
    @Test
    public void testDimEmail() {
        System.out.println("dim email");
        user = PrivacyDimmer.dim(user);
        assertEquals(null, "so*******@126.com", user.getEmail());
    }
}