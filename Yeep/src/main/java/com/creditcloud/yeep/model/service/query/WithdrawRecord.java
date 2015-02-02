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
public class WithdrawRecord extends BaseObject {
    @NotNull
    private String amount;
    
    @NotNull
    private String userNo;
    
    @NotNull
    private String createTime;
    
    @NotNull
    private String status; 
    
    private String remitStatus;

    public WithdrawRecord() {
    }

    public WithdrawRecord(String amount, String userNo, String createTime, String status, String remitStatus) {
        this.amount = amount;
        this.userNo = userNo;
        this.createTime = createTime;
        this.status = status;
        this.remitStatus = remitStatus;
    }

    public String getAmount() {
        return amount;
    }

    public String getUserNo() {
        return userNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getStatus() {
        return status;
    }

    public String getRemitStatus() {
        return remitStatus;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRemitStatus(String remitStatus) {
        this.remitStatus = remitStatus;
    }    
}
