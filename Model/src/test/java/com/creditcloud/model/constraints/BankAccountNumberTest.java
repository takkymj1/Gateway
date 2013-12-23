/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import static com.creditcloud.model.constraints.BaseTest.validator;
import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.model.user.fund.BankAccount;
import javax.validation.Validation;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sobranie
 */
public class BankAccountNumberTest extends BaseTest<BankAccount> {
    
    public BankAccountNumberTest() {
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
        object = new BankAccount("陈忞", Bank.ABC, null, null, "6225123456789874");
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }
    
    @Test
    public void testNotNull() {
        constraintViolations = validator.validateProperty(object, "account");
        assertEquals(0, constraintViolations.size());

        object.setAccount(null);
        constraintViolations = validator.validateProperty(object, "account");
        assertEquals(1, constraintViolations.size());
    }
    
    @Test
    public void testPattern() {
        object.setAccount("www.creditcloud.com");
        constraintViolations = validator.validateProperty(object, "account");
        assertEquals(1, constraintViolations.size());
        
        object.setAccount("1234567898745632");
        constraintViolations = validator.validateProperty(object, "account");
        assertEquals(0, constraintViolations.size());
        
        object.setAccount("12345678987456231212");
        constraintViolations = validator.validateProperty(object, "account");
        assertEquals(1, constraintViolations.size());
        
        object.setAccount("1234567898745623121");
        constraintViolations = validator.validateProperty(object, "account");
        assertEquals(0, constraintViolations.size());
    }
}
