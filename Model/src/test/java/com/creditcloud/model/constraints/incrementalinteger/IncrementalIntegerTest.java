/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.incrementalinteger;

import com.creditcloud.model.constraints.BaseTest;
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
public class IncrementalIntegerTest extends BaseTest<MockInteger> {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new MockInteger(10000);
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void pattern() {
        constraintViolations = validator.validateProperty(object, "value");
        assertEquals(0, constraintViolations.size());

        object.setValue(9999);
        constraintViolations = validator.validateProperty(object, "value");
        assertEquals(1, constraintViolations.size());

        object.setValue(19999);
        constraintViolations = validator.validateProperty(object, "value");
        assertEquals(1, constraintViolations.size());

        object.setValue(19000);
        constraintViolations = validator.validateProperty(object, "value");
        assertEquals(0, constraintViolations.size());

        object.setValue(1900000);
        constraintViolations = validator.validateProperty(object, "value");
        assertEquals(1, constraintViolations.size());
    }
}
