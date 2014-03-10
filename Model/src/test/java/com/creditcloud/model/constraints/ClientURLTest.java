/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.client.Client;
import static com.creditcloud.model.constraints.BaseTest.validator;
import java.util.Locale;
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
public class ClientURLTest extends BaseTest<Client> {

    public ClientURLTest() {
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
        object = new Client("CreditCloud", "CC", "creditcloud.com", "13800138000", "support@creditcloud.com", "creditcloud", "ABCD", "www.creditcloud.com", false, Locale.CHINESE);
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void testNotNull() {
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(0, constraintViolations.size());

        object.setUrl(null);
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void testPattern() {
        //accepted url
        object.setUrl("www.creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(0, constraintViolations.size());

        object.setUrl("www.creditcloud.com.cn");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(0, constraintViolations.size());

        object.setUrl("www.creditcloud.com.");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(0, constraintViolations.size());
        
        

        //illegal url
        object.setUrl("12");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl("www.creditcloud.com/hello");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl("http://www.creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl("http://creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        object.setUrl("https://www.creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

//        object.setUrl("www.creditcloud..com");
//        constraintViolations = validator.validateProperty(object, "url");
//        assertEquals(1, constraintViolations.size());

        object.setUrl("w@w.creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());

        object.setUrl("ftp://creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl(".creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl("https:://creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl("https:/creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
        object.setUrl("https:///creditcloud.com");
        constraintViolations = validator.validateProperty(object, "url");
        assertEquals(1, constraintViolations.size());
        
    }
}
