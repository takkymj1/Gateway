/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.client.Client;
import static com.creditcloud.model.constraints.BaseTest.validator;
import javax.validation.Validation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class ClientCodeTest extends BaseTest<Client> {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new Client("CreditCloud", "CC", "ABCD", "www.creditcloud.com", Locale.CHINESE);
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        constraintViolations = validator.validateProperty(object, "code");
        assertEquals(0, constraintViolations.size());

        object.setCode(null);
        constraintViolations = validator.validateProperty(object, "code");
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void pattern() {
        object.setCode("abcd");
        constraintViolations = validator.validateProperty(object, "code");
        assertEquals(1, constraintViolations.size());

        object.setCode("1234");
        constraintViolations = validator.validateProperty(object, "code");
        assertEquals(0, constraintViolations.size());

        object.setCode("DAFY");
        constraintViolations = validator.validateProperty(object, "code");
        assertEquals(0, constraintViolations.size());
    }
}
