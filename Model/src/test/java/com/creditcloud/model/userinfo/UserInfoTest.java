/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.User;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.CareerStatus;
import com.creditcloud.model.enums.user.CompanyIndustry;
import com.creditcloud.model.enums.user.CompanySize;
import com.creditcloud.model.enums.user.CompanyType;
import com.creditcloud.model.enums.user.EducationLevel;
import com.creditcloud.model.enums.user.MaritalStatus;
import com.creditcloud.model.enums.user.MonthlySalary;
import com.creditcloud.model.enums.user.YearOfService;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author rooseek
 */
public class UserInfoTest {
    
    public UserInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void test() {
        User user = new User(null,
                             "CRCD",
                             "王二",
                             "wanger",
                             "42010619620204815X",
                             "15810101010",
                             "wang.er@gmail.com",
                             Source.BACK);
        
        PersonalInfo personal = new PersonalInfo(true,
                                                 new Date(),
                                                 MaritalStatus.DIVORCED,
                                                 true,
                                                 new EducationInfo(EducationLevel.HIGHSCHOOL,
                                                                   "2007",
                                                                   "山东蓝翔技校"),
                                                 new PlaceInfo("安徽",
                                                               "合肥",
                                                               "北京",
                                                               "海淀",
                                                               "西直门",
                                                               "01062223333"),
                                                 null);
        FinanceInfo finance = new FinanceInfo(true,
                                              1,
                                              true,
                                              true,
                                              1,
                                              true);
        CareerInfo career = new CareerInfo(CareerStatus.EMPLOYEE,
                                           new CompanyInfo("云中信",
                                                           CompanyType.PRIVATE_ENTERPRISES,
                                                           CompanyIndustry.AGRICULTURE,
                                                           CompanySize.SIZE_10001_100000,
                                                           "01062222222",
                                                           "西直门"),
                                           "北京",
                                           "海淀",
                                           "经理",
                                           MonthlySalary.SALARY_10001_20000,
                                           YearOfService.YEAR_10_20,
                                           "wang.er@gmail.com");
        ContactInfo contact = new ContactInfo(new Contact("張三",
                                                          "父亲",
                                                          "13919840329"),
                                              new Contact("李四",
                                                          "同事",
                                                          "13512345678"),
                                              new Contact("李四",
                                                          "同事",
                                                          "13512345678"));
        
        
        UserInfo userInfo = new UserInfo(user,
                                         personal,
                                         finance,
                                         career,
                                         contact);
        Assert.assertNotNull(userInfo);
    }
}