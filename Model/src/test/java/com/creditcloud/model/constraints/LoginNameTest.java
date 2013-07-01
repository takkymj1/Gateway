/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.User;
import javax.validation.Validation;
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
public class LoginNameTest extends BaseTest {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        user = new User("123", "123", "123", "123", "123", "123");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        user.setLoginName(null);
        constraintViolations = validator.validateProperty(user, "loginName");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void size() {
        user.setLoginName("1");
        constraintViolations = validator.validateProperty(user, "loginName");
        assertEquals(1, constraintViolations.size());
        user.setLoginName("test1234test1234test1234test1234");
        constraintViolations = validator.validateProperty(user, "loginName");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void character() {
        user.setLoginName("+-123");
        constraintViolations = validator.validateProperty(user, "loginName");
        assertEquals(1, constraintViolations.size());
    }
}