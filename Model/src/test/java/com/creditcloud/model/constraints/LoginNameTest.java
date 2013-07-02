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
public class LoginNameTest extends BaseTest<User> {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new User("123", "123", "123", "123", "123", "123");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        object.setLoginName(null);
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void size() {
        object.setLoginName("1");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());
        object.setLoginName("test1234test1234test1234test1234");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void character() {
        object.setLoginName("+-123");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());
    }
}