/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import com.creditcloud.model.user.User;
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
        user.setName("陈小东");
        user.setMobile("13901210504");
        user.setIdNumber("110105198304288330");
        user.setEmail("sobranie9@126.com");
        //call dim
        user = PrivacyDimmer.dim(user);
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
        assertEquals(null, "139****0504", user.getMobile());
    }
    
    @Test
    public void testDimIdNumber() {
        System.out.println("dim IdNumber");
        assertEquals(null, "11010519*********0", user.getIdNumber());
    }
    
    @Test
    public void testDimEmail() {
        System.out.println("dim email");
        assertEquals(null, "so*******@126.com", user.getEmail());
    }
    
    @Test
    public void testDimName() {
        System.out.println("dim name");
        assertEquals(null, "陈小*", user.getName());
    }
}