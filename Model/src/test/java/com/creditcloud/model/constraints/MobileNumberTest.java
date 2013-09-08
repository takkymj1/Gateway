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
public class MobileNumberTest extends BaseTest<User> {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new User("123", "123", "123", "123", "123", "123", "123");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        object.setMobile(null);
        constraintViolations = validator.validateProperty(object, "mobile");
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void pattern() {
        constraintViolations = validator.validateProperty(object, "mobile");
        assertEquals(1, constraintViolations.size());

        //11 numbers
        object.setMobile("13912345678");
        constraintViolations = validator.validateProperty(object, "mobile");
        assertEquals(0, constraintViolations.size());

        //10 numbers
        object.setMobile("1391234567");
        constraintViolations = validator.validateProperty(object, "mobile");
        assertEquals(1, constraintViolations.size());

        //12 numbers
        object.setMobile("139123456789");
        constraintViolations = validator.validateProperty(object, "mobile");
        assertEquals(1, constraintViolations.size());

        //wrong head
        object.setMobile("23112345678");
        constraintViolations = validator.validateProperty(object, "mobile");
        assertEquals(1, constraintViolations.size());

    }
}
