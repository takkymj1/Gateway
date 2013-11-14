/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import static com.creditcloud.model.constraints.BaseTest.validator;
import com.creditcloud.model.mock.MockURL;
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
public class PNRReturnURLTest extends BaseTest<MockURL> {

    private static final String[] reserved = new String[]{"recv",
                                                          "rbsmag",
                                                          "cashmag",
                                                          "cash",
                                                          "ubs",
                                                          "acctmag",
                                                          "buser",
                                                          "busermag",
                                                          "mtp",
                                                          "mtpmag",
                                                          "muser",
                                                          "musermag",
                                                          "ubsmag",
                                                          "mag"};

    public PNRReturnURLTest() {
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
        object = new MockURL("demo.creditcloud.com");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void pattern() {
        //accepted
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(0, constraintViolations.size());

        //invalid
        object.setUrl("recv.creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        object.setUrl("demo.credit中文cloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        object.setUrl("demo.cash.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        object.setUrl("demo.creditcloudcash.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        object.setUrl("demo.creditcloud.com/recv");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        //complete validation
        for (String str : reserved) {
            object.setUrl("demo.".concat(str).concat(".com"));
            constraintViolations = validator.validateProperty(object, "url");
            assertEquals(1, constraintViolations.size());
        }
    }
}