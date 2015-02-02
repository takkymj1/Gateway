/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service.query;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author tinglany
 */
@XmlType
public class PaymentRecord extends BaseObject {
    @NotNull
    private String paymentAmount;
    
    @NotNull
    private String sourceUserNo;
    
    @NotNull
    private String createTime;
    
    private String loanTime;
    
    @NotNull
    private String status;

    public PaymentRecord() {
    }

    public PaymentRecord(String paymentAmount, String sourceUserNo, String createTime, String loanTime, String status) {
        this.paymentAmount = paymentAmount;
        this.sourceUserNo = sourceUserNo;
        this.createTime = createTime;
        this.loanTime = loanTime;
        this.status = status;
    }

    public String getPaymentAmount() {
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

    public String getStatus() {
        return status;
    }

    public void setPaymentAmount(String paymentAmount) {
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

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
