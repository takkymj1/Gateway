/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service.query;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.RemitStatus;
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
public class WithdrawRecord extends BaseObject {
    @NotNull
    private BigDecimal amount;
    
    @NotNull
    private String userNo;
    
    @NotNull
    private Date createTime;
    
    @NotNull
    private Status status; 
    
    private RemitStatus remitStatus;

    public WithdrawRecord() {
    }

    public WithdrawRecord(BigDecimal amount, String userNo, Date createTime, Status status, RemitStatus remitStatus) {
        this.amount = amount;
        this.userNo = userNo;
        this.createTime = createTime;
        this.status = status;
        this.remitStatus = remitStatus;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getUserNo() {
        return userNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Status getStatus() {
        return status;
    }

    public RemitStatus getRemitStatus() {
        return remitStatus;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setRemitStatus(RemitStatus remitStatus) {
        this.remitStatus = remitStatus;
    }    
}
