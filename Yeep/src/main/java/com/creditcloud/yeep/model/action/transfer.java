/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.MemberType;
import com.creditcloud.yeep.enums.UserType;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author tinglany
 */
@XmlType
public class transfer extends BaseObject {
    
    /**
     *  标的号
     * 
     */
    @NotNull
    @XmlTransient
    private BigDecimal amount;  
    

    @NotNull
    @XmlTransient
    private UserType targetUserType;  
    
    @NotNull
    @XmlTransient
    private String targetPlatformUserNo;  

    public transfer() {
    }

    public transfer(BigDecimal amount, UserType targetUserType, String targetPlatformUserNo) {
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public UserType getTargetUserType() {
        return targetUserType;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTargetUserType(UserType targetUserType) {
        this.targetUserType = targetUserType;
    }

    public void setTargetPlatformUserType(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }
    
    
    
}
