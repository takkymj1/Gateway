/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.model.enums.user.info.CareerStatus;
import com.creditcloud.model.enums.user.info.CompanyIndustry;
import com.creditcloud.model.enums.user.info.CompanySize;
import com.creditcloud.model.enums.user.info.CompanyType;
import com.creditcloud.model.enums.user.info.EducationLevel;
import com.creditcloud.model.enums.user.info.MaritalStatus;
import com.creditcloud.model.enums.user.info.MonthlySalary;
import com.creditcloud.model.enums.user.info.YearOfService;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class EnumsTest {

    public EnumsTest() {
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

    @Test
    public void testCompanyIndustry() {
        String key = "其他";
        CompanyIndustry expResult = CompanyIndustry.OTHER;
        CompanyIndustry result = Enums.getEnumByKey(CompanyIndustry.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testCareerStatus() {
        String key = "其他";
        CareerStatus expResult = CareerStatus.OTHER;
        CareerStatus result = Enums.getEnumByKey(CareerStatus.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompanySize() {
        String key = "10人以下";
        CompanySize expResult = CompanySize.SIZE_BELOW_10;
        CompanySize result = Enums.getEnumByKey(CompanySize.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompanyType() {
        String key = "其他";
        CompanyType expResult = CompanyType.OTHER;
        CompanyType result = Enums.getEnumByKey(CompanyType.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testEducationLevel() {
        String key = "高中及以下";
        EducationLevel expResult = EducationLevel.HIGHSCHOOL;
        EducationLevel result = Enums.getEnumByKey(EducationLevel.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaritalStatus() {
        String key = "已婚";
        MaritalStatus expResult = MaritalStatus.MARRIED;
        MaritalStatus result = Enums.getEnumByKey(MaritalStatus.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testMonthlySalary() {
        String key = "2000以下";
        MonthlySalary expResult = MonthlySalary.SALARY_BELOW_2000;
        MonthlySalary result = Enums.getEnumByKey(MonthlySalary.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testYearOfService() {
        String key = "1年以下";
        YearOfService expResult = YearOfService.YEAR_BELOW_1;
        YearOfService result = Enums.getEnumByKey(YearOfService.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testLoanRequestStatus() {
        String key = "未处理";
        LoanRequestStatus expResult = LoanRequestStatus.UNASSIGNED;
        LoanRequestStatus result = Enums.getEnumByKey(LoanRequestStatus.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testLoanRequestMethod() {
        String key = "按月付息到期还本";
        RepaymentMethod expResult = RepaymentMethod.MonthlyInterest;
        RepaymentMethod result = Enums.getEnumByKey(RepaymentMethod.class, key);
        assertEquals(expResult, result);

        //test cache
        key = "按月付息到期还本";
        expResult = RepaymentMethod.MonthlyInterest;
        result = Enums.getEnumByKey(RepaymentMethod.class, key);
        assertEquals(expResult, result);
    }

    @Test
    public void testAllOf() {
        List<InvestStatus> result = Enums.unmodifiableList(InvestStatus.class);
        List<InvestStatus> expected = Arrays.asList(InvestStatus.values());
        assertEquals(result.size(), expected.size());

        boolean getException = false;
        try {
            //this will fail
            result.remove(0);
        } catch (UnsupportedOperationException ex) {
            getException = true;
        }
        assertTrue(getException);

        getException = false;
        try {
            //this will fail
            result.add(InvestStatus.FROZEN);
        } catch (UnsupportedOperationException ex) {
            getException = true;
        }
        assertTrue(getException);
    }
    
    @Test
    public void testBank() {
        Collection<Bank> pnrBanks = Bank.getPnrBanks();
        for(Bank bank : pnrBanks) {
            assertNotNull(bank.getPnrCode());
            assertTrue(bank.isPnrSupport());
        }
        
        Collection<Bank> umpBanks = Bank.getUmpBanks();
        for(Bank bank : umpBanks) {
            assertNotNull(bank.getUmpCode());
            assertTrue(bank.isUmpSupport());
        }
    }
}
