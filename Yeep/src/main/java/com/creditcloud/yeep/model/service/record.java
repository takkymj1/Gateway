/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import java.math.BigDecimal;
import java.util.Date;
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
    private BizType bizType;
    
    @NotNull
    @XmlTransient
    private BigDecimal fee;  
    
    @NotNull
    @XmlTransient
    private BigDecimal balance;

    @NotNull
    @XmlTransient
    private BigDecimal amount;
    
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

    public record(BizType bizType, BigDecimal fee,BigDecimal balance, BigDecimal amount, String time, String requestNo, String platformNo) {
        this.bizType = bizType;
        this.fee = fee;
        this.amount = amount;
        this.time = time;
        this.requestNo = requestNo;
        this.platformNo = platformNo;
        this.balance = balance;
    }


    
    @XmlAttribute(name ="bizType")
    public BizType getBizType() {
        return bizType;
    }

    @XmlAttribute(name ="fee")
    public BigDecimal getFee() {
        return fee;
    }

    @XmlAttribute(name ="balance")
    public BigDecimal getBalance() {
        return balance;
    }
    
    @XmlAttribute(name ="amount")
    public BigDecimal getAmount() {
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

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAmount(BigDecimal amount) {
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
