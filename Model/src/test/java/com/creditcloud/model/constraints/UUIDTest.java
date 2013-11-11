/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import static com.creditcloud.model.constraints.BaseTest.validator;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.user.User;
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
public class UUIDTest extends BaseTest<User> {

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new User("123", "123", "123", "123", "123", "123", "123", Source.WEB, null, null);
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void testPattern() {
        //accepted
        object.setId("9C490879-D40B-434F-B05C-D20F6990CF41");
        constraintViolations = validator.validateProperty(object, "id");
        assertEquals(0, constraintViolations.size());
        
        //not accepted
        object.setId("123");
        constraintViolations = validator.validateProperty(object, "id");
        assertEquals(1, constraintViolations.size());

        object.setId(null);
        constraintViolations = validator.validateProperty(object, "id");
        assertEquals(1, constraintViolations.size());

        object.setId("9C490879+D40B-434F-B05C-D20F6990CF41");
        constraintViolations = validator.validateProperty(object, "id");
        assertEquals(1, constraintViolations.size());

        object.setId("9c490879-D40B-434F-B05C-D20F6990CF41");
        constraintViolations = validator.validateProperty(object, "id");
        assertEquals(1, constraintViolations.size());


        object.setId("9C49087911-D40B-434F-B05C-D20F6990CF");
        constraintViolations = validator.validateProperty(object, "id");
        assertEquals(1, constraintViolations.size());
    }
}
