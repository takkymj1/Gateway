/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.User;
import static com.creditcloud.model.constraints.BaseTest.validator;
import javax.validation.Validation;
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
public class EmailAddressTest extends BaseTest {

    public EmailAddressTest() {
    }

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
        user.setEmail(null);
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void pattern(){
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
        
        /**
         * accepted email
         */
        user.setEmail("noreply@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(0, constraintViolations.size());
        
        user.setEmail("123noreply@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(0, constraintViolations.size());
        
        user.setEmail("no-replay@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(0, constraintViolations.size());
        
        user.setEmail("no.replay@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(0, constraintViolations.size());
        
        user.setEmail("no_replay@creditcloud.com.cn");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(0, constraintViolations.size());
        
        
        /**
         * illegal email
         */
        user.setEmail("no@replay@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
        
        
        user.setEmail("$noreplay@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
        
        user.setEmail("n$oreplay@creditcloud.com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
        
        user.setEmail("noreplay@creditcloud..com");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
        
        user.setEmail("noreplay@creditcloud.com.");
        constraintViolations = validator.validateProperty(user, "email");
        assertEquals(1, constraintViolations.size());
    }
}
