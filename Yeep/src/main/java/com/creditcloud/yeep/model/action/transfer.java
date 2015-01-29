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
    private String targetPlatformUserType;  

    public transfer() {
    }

    public transfer(String amount, String targetUserType, String targetPlatformUserType) {
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserType = targetPlatformUserType;
    }

    public String getAmount() {
        return amount;
    }

    public String getTargetUserType() {
        return targetUserType;
    }

    public String getTargetPlatformUserType() {
        return targetPlatformUserType;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTargetUserType(String targetUserType) {
        this.targetUserType = targetUserType;
    }

    public void setTargetPlatformUserType(String targetPlatformUserType) {
        this.targetPlatformUserType = targetPlatformUserType;
    }
    
    
    
}
