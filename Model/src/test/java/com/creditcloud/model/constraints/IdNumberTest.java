/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.User;
import static com.creditcloud.model.constraints.BaseTest.validator;
import java.util.Set;
import javax.validation.ConstraintViolation;
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
public class IdNumberTest extends BaseTest {

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
        user = new User("123", "123", "123", "123", "123", "123");
    }
    
    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        user.setIdNumber(null);
        constraintViolations = validator.validateProperty(user, "idNumber");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void pattern() {
        user.setIdNumber("110105198304289999");
        constraintViolations = validator.validateProperty(user, "idNumber");
        assertEquals(0, constraintViolations.size());
        //ending with x/X
        user.setIdNumber("11010519830428999X");
        constraintViolations = validator.validateProperty(user, "idNumber");
        assertEquals(0, constraintViolations.size());
        //length
        user.setIdNumber("1101051983042899X");
        constraintViolations = validator.validateProperty(user, "idNumber");
        assertEquals(1, constraintViolations.size());
    }
}