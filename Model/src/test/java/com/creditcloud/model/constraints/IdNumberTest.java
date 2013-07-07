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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sobranie
 */
public class IdNumberTest extends BaseTest<User> {

    public IdNumberTest() {
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
        object = new User("123", "123", "123", "123", "123", "123");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        object.setIdNumber(null);
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void pattern() {
        /**
         * accepted idnumber
         */
        //18 numbers
        object.setIdNumber("510105198808062022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(0, constraintViolations.size());

        //15 numbers;
        object.setIdNumber("510105880806202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(0, constraintViolations.size());

        //last number is X
        object.setIdNumber("42010619620204815X");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(0, constraintViolations.size());
        object.setIdNumber("42010619620204815x");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(0, constraintViolations.size());



        /**
         * illegal idnumber
         */
        //illegal character        
        object.setIdNumber("510105198808x62022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());
        object.setIdNumber("5101058808x6202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());


        //17 numbers
        object.setIdNumber("51010519880806202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //19 numbers;
        object.setIdNumber("5101051988080620222");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong checkcode;
        object.setIdNumber("510105198808062023");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong province;
        object.setIdNumber("5901051988080620222");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());
        object.setIdNumber("590105880806202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());


        //wrong year;
        object.setIdNumber("510105229908062022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong month;
        object.setIdNumber("510105198813062022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());
        object.setIdNumber("510105881306202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong day
        object.setIdNumber("510105198809312022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());
        object.setIdNumber("510105880832202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

    }
}