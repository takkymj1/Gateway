/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tinglany
 */
public class record extends BaseObject {
    
    //业务类型
    @NotNull
    @XmlTransient
    private String bizType;
    
    @NotNull
    @XmlTransient
    private String fee;  
    
    @NotNull
    @XmlTransient
    private String balance;

    @NotNull
    @XmlTransient
    private String amount;
    
    @NotNull
    @XmlTransient
    private String time;
    
    @NotNull
    @XmlTransient
    private String requestNo;
    
    @NotNull
    @XmlTransient
    private String platformNo;

    public record() {
    }

    public record(String bizType, String fee,String balance, String amount, String time, String requestNo, String platformNo) {
        this.bizType = bizType;
        this.fee = fee;
        this.amount = amount;
        this.time = time;
        this.requestNo = requestNo;
        this.platformNo = platformNo;
        this.balance = balance;
    }


    
    @XmlAttribute(name ="bizType")
    public String getBizType() {
        return bizType;
    }

    @XmlAttribute(name ="fee")
    public String getFee() {
        return fee;
    }

    @XmlAttribute(name ="balance")
    public String getBalance() {
        return balance;
    }
    
    @XmlAttribute(name ="amount")
    public String getAmount() {
        return amount;
    }

    @XmlAttribute(name ="time")
    public String getTime() {
        return time;
    }

    @XmlAttribute(name ="requestNo")
    public String getRequestNo() {
        return requestNo;
    }

    @XmlAttribute(name ="platformNo")
    public String getPlatformNo() {
        return platformNo;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
    }
    
    
}
