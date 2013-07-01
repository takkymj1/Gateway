/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.Client;
import static com.creditcloud.model.constraints.BaseTest.validator;
import javax.validation.Validation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import java.util.Locale;
import java.util.Set;
import javax.validation.ConstraintViolation;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class ClientCodeTest extends BaseTest {

    private Client client;
    private Set<ConstraintViolation<Client>> violations;

    public ClientCodeTest() {
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
        client = new Client("CreditCloud", "ABCD", "www.creditcloud.com", Locale.CHINESE);
    }

    @After
    public void tearDown() {
        violations.clear();
    }

    @Test
    public void notNull() {
        violations = validator.validateProperty(client, "code");
        assertEquals(0, violations.size());

        client.setCode(null);
        violations = validator.validateProperty(client, "code");
        assertEquals(1, violations.size());
    }

    @Test
    public void pattern() {
        client.setCode("abcd");
        violations = validator.validateProperty(client, "code");
        assertEquals(0, violations.size());
        
        client.setCode("1234");
        violations = validator.validateProperty(client, "code");
        assertEquals(1, violations.size());
    }
}
