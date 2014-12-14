/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.user.User;
import com.creditcloud.model.constant.MobileConstant;
import static com.creditcloud.model.constraints.BaseTest.validator;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.validation.group.WebSourceCheck;
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
public class LoginNameTest extends BaseTest<User> {

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
        object.setLoginName(null);
        constraintViolations = validator.validateProperty(object, "loginName", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void size() {
        object.setLoginName("1");
        constraintViolations = validator.validateProperty(object, "loginName", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());
        object.setLoginName("test1234test1234test1234test1234");
        constraintViolations = validator.validateProperty(object, "loginName", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void character() {
        object.setLoginName("+-123");
        constraintViolations = validator.validateProperty(object, "loginName", WebSourceCheck.class);
        assertEquals(1, constraintViolations.size());
    }

    @Test
    public void chinese() {
        object.setLoginName("陈忞");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(0, constraintViolations.size());
    }

    @Test
    public void complicate() {
        object.setLoginName("陈忞1983_Test");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(0, constraintViolations.size());
    }

    @Test
    public void notMobile() {
        //mobile number not accepted
        object.setLoginName("13810001000");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());

        object.setLoginName("15410001000");		
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());  
        //accepted non-mobile number
        object.setLoginName("1381000100");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(0, constraintViolations.size());
        

         
        object.setLoginName("117705622243");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(0, constraintViolations.size());        
        
        //accepted default login name for users registerd 
        object.setLoginName(MobileConstant.MOBILE_USER_LOGINNAME_PREFIX + "138100010000");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(0, constraintViolations.size());
        
    }

    @Test
    public void notEmail() {
        //email address not accepted
        object.setLoginName("notreply@creditcloud.com");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(1, constraintViolations.size());

        //accepted 
        object.setLoginName("notreply_creditcloud_com");
        constraintViolations = validator.validateProperty(object, "loginName");
        assertEquals(0, constraintViolations.size());
    }
}