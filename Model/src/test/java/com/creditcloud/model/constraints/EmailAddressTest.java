/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.user.User;
import static com.creditcloud.model.constraints.BaseTest.validator;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.validation.group.WebSourceCheck;
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
public class EmailAddressTest extends BaseTest<User> {

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
        object = new User("123", "123", "123", "123", "123", "123", "123", Source.WEB, null, null);
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        object.setEmail(null);
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void pattern() {
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());

        /**
         * accepted email
         */
        object.setEmail("noreply@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(0, constraintViolations.size());

        object.setEmail("123noreply@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(0, constraintViolations.size());

        object.setEmail("no-replay@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(0, constraintViolations.size());

        object.setEmail("no.replay@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(0, constraintViolations.size());

        object.setEmail("no_replay@creditcloud.com.cn");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(0, constraintViolations.size());


        /**
         * illegal email
         */
        object.setEmail("no@replay@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());


        object.setEmail("$noreplay@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());

        object.setEmail("n$oreplay@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());

        object.setEmail("noreplay@creditcloud..com");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());

        object.setEmail("noreplay@creditcloud.com.");
        constraintViolations = validator.validateProperty(object, "email", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());
    }
}
