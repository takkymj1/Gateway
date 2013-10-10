/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import static com.creditcloud.model.constraints.BaseTest.validator;
import com.creditcloud.model.mock.MockCar;
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
public class PlateNumberTest extends BaseTest<MockCar> {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new MockCar("12345");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void testNotNull() {
        object.setPlateNumber(null);
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(2, constraintViolations.size());
    }

    @Test
    public void testPattern() {
        //accepted
        object.setPlateNumber("京A2009");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(0, constraintViolations.size());

        //not accepted
        object.setPlateNumber("京V2009");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());

        object.setPlateNumber("军V2009");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());

        object.setPlateNumber("WJ2009");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());

        object.setPlateNumber("京22009");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());

        object.setPlateNumber("京A2a09");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());

        object.setPlateNumber("京A2京09");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());

        object.setPlateNumber("美A2009");
        constraintViolations = validator.validateProperty(object, "plateNumber");
        assertEquals(1, constraintViolations.size());
    }
}
