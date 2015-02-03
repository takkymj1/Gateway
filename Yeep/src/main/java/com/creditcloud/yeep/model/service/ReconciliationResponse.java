/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseResponse;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */

@XmlRootElement (name = "response")
public class ReconciliationResponse extends BaseResponse {
    
    //记录列表
    @NotNull
    private BizType bizType;
    
    //业务类型,枚举值:
    @NotNull
    private List<record> records;
    
    //易宝收取手续费
    @NotNull
    private BigDecimal fee;
    
    //商户平台收取分润
    @NotNull
    private BigDecimal balance;
    
    //业务金额
    @NotNull
    private BigDecimal amount;

    public ReconciliationResponse() {
    }

    public ReconciliationResponse(BizType bizType, List<record> records, BigDecimal fee, BigDecimal balance, BigDecimal amount) {
        this.bizType = bizType;
        this.records = records;
        this.fee = fee;
        this.balance = balance;
        this.amount = amount;
    }

    public BizType getBizType() {
        return bizType;
    }

    @XmlElementWrapper(name="records")
    @XmlElement(name="record") 
    public List<record> getRecords() {
        return records;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }

    public void setRecords(List<record> records) {
        this.records = records;
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

    public BigDecimal getAmount() {
        return amount;
    }
    
       
}
