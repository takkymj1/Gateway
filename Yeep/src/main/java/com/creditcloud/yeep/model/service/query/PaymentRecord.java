/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service.query;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.Status;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author tinglany
 */
@XmlType
public class PaymentRecord extends BaseObject {
    @NotNull
    private BigDecimal paymentAmount;
    
    @NotNull
    private String sourceUserNo;
    
    @NotNull
    private String createTime;
    
    private String loanTime;
    
    @NotNull
    private Status status;

    public PaymentRecord() {
    }

    public PaymentRecord(BigDecimal paymentAmount, String sourceUserNo, String createTime, String loanTime, Status status) {
        this.paymentAmount = paymentAmount;
        this.sourceUserNo = sourceUserNo;
        this.createTime = createTime;
        this.loanTime = loanTime;
        this.status = status;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public String getSourceUserNo() {
        return sourceUserNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setSourceUserNo(String sourceUserNo) {
        this.sourceUserNo = sourceUserNo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
