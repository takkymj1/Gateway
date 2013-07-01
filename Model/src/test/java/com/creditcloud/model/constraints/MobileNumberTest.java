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
public class MobileNumberTest extends BaseTest {

    public MobileNumberTest() {
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
        user.setMobile(null);
        constraintViolations = validator.validateProperty(user, "mobile");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void pattern(){
        constraintViolations = validator.validateProperty(user, "mobile");
        assertEquals(1, constraintViolations.size());
        
        //11 numbers
        user.setMobile("13912345678");
        constraintViolations = validator.validateProperty(user, "mobile");
        assertEquals(0, constraintViolations.size());
        
        //10 numbers
        user.setMobile("1391234567");
        constraintViolations = validator.validateProperty(user, "mobile");
        assertEquals(1, constraintViolations.size());
        
        //12 numbers
        user.setMobile("139123456789");
        constraintViolations = validator.validateProperty(user, "mobile");
        assertEquals(1, constraintViolations.size());
        
        //wrong head
        user.setMobile("23112345678");
        constraintViolations = validator.validateProperty(user, "mobile");
        assertEquals(1, constraintViolations.size());
        
    }
}
