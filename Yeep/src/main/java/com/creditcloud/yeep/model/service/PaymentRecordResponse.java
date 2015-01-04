/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;

/**
 * 投标记录
 * 
 * @author tinglany
 */
@XmlRootElement (name = "response")
public class PaymentRecordResponse extends BaseResponse {
    
    @NotNull
    private String paymentAmount;
    
    @NotNull
    private String sourceUserNo;
    
    @NotNull
    private LocalDate createTime;
    
    private LocalDate loanTime;
    
    @NotNull
    private String status;

    public PaymentRecordResponse() {
    }
    
    public PaymentRecordResponse(String paymentAmount,
                                 String sourceUserNo,
                                 LocalDate createTime,
                                 LocalDate loanTime,
                                 String status,
                                 String sign) {
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

    public LocalDate getCreateTime() {
        return createTime;
    }

    public LocalDate getLoanTime() {
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

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public void setLoanTime(LocalDate loanTime) {
        this.loanTime = loanTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(paymentAmount))
                .append(StringUtils.trimToEmpty(sourceUserNo))
                .append(StringUtils.trimToEmpty(createTime.toString()))
                .append(StringUtils.trimToEmpty(loanTime.toString()))
                .append(StringUtils.trimToEmpty(status));
        return sb.toString();
    }    
}
