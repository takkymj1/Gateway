/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.model.BaseObject;
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
    private String amount;  
    

    @NotNull
    @XmlTransient
    private String targetUserType;  
    
    @NotNull
    @XmlTransient
    private String targetPlatformUserNo;  

    public transfer() {
    }

    public transfer(String amount, String targetUserType, String targetPlatformUserNo) {
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

    public String getAmount() {
        return amount;
    }

    public String getTargetUserType() {
        return targetUserType;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTargetUserType(String targetUserType) {
        this.targetUserType = targetUserType;
    }

    public void setTargetPlatformUserType(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }
    
    
    
}
