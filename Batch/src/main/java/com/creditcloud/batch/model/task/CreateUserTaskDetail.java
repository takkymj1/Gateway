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
import com.creditcloud.model.enums.user.info.MaritalStatus;
import com.creditcloud.model.enums.user.info.EducationLevel;
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
}
