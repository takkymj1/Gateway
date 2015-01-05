/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model.task;

import com.creditcloud.model.constraints.BankAccountNumber;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.model.enums.user.credit.CertificateStatus;
import com.creditcloud.model.enums.user.info.MaritalStatus;
import com.creditcloud.model.enums.user.info.EducationLevel;
import com.creditcloud.model.enums.user.info.CareerStatus;
import com.creditcloud.model.enums.user.info.CompanyIndustry;
import com.creditcloud.model.enums.user.info.CompanySize;
import com.creditcloud.model.enums.user.info.CompanyType;
import com.creditcloud.model.enums.user.info.MonthlySalary;
import com.creditcloud.model.enums.user.info.YearOfService;
import javax.validation.constraints.NotNull;
import lombok.Value;

/**
 * 批量开户文件格式
 * 
 * @author sobranie
 */
@Value
public class CreateUserTaskDetail {
    
    /**
     * 真实姓名
     */
    @NotNull
    @RealName
    private String name;
    
    @NotNull
    @IdNumber
    private String idNumber;
    
    @NotNull
    @MobileNumber
    private String mobile;
    
    @NotNull
    @BankAccountNumber
    private String bankAccountNumber;
    
    /**
     * 网站密码(明文)
     */
    private String password;
    
    /**
     * 年龄，其实可以通过idNumber计算
     */
    private int age;
    
    private MaritalStatus marriage; 
    
    /**
     * 是否有小孩
     */
    private boolean children;
    
    private EducationLevel educationLevel;
    
    /**
     * 公司类别
     */
    private CompanyType companyType;
    
    /**
     * 所属行业
     */
    private CompanyIndustry companyIndustry;
    
    /**
     * 公司规模
     */
    private CompanySize companySize;
    
    /**
     * 职业状态
     */
    private CareerStatus careerStatus;
    
    /**
     * 具体职位
     */
    private String position;
    
    /**
     * 月薪
     */
    private MonthlySalary monthlySalary;
    
    /**
     * 工作年限
     */
    private YearOfService yearOfService;
    
    /**
     * 工作省份
     */
    private String workProvince;
    
    /**
     * 工作城市
     */
    private String workCity;
    
    /**
     * 房产认证状态
     */
    private CertificateStatus realestateCertificate;
    
    /**
     * 购车认证状态
     */
    private CertificateStatus vehicleCertificate;
}
