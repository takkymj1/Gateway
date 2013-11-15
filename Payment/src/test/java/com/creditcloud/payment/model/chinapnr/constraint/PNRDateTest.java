/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.constraint;

import static com.creditcloud.payment.model.chinapnr.constraint.BaseTest.validator;
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
public class PNRDateTest extends BaseTest<MockData> {

    public PNRDateTest() {
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
        object = new MockData("demo.creditcloud.com", "20131116");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void testPattern() {
        //accepted
        constraintViolations = validator.validateProperty(object, "date");
        assertEquals(0, constraintViolations.size());

        //invalid
        object.setDate("201311116");
        constraintViolations = validator.validateProperty(object, "date");
        assertEquals(1, constraintViolations.size());

        object.setDate("2013116");
        constraintViolations = validator.validateProperty(object, "date");
        assertEquals(1, constraintViolations.size());
    }
}