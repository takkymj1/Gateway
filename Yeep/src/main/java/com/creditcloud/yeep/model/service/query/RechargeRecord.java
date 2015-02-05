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
public class RechargeRecord extends BaseObject {
    @NotNull
    private BigDecimal amount;
    
    @NotNull
    private String userNo;
    
    @NotNull
    private String createTime;
    
    @NotNull
    private Status status;  

    public RechargeRecord() {
    }

    public RechargeRecord(BigDecimal amount, String userNo, String createTime, Status status) {
        this.amount = amount;
        this.userNo = userNo;
        this.createTime = createTime;
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getUserNo() {
        return userNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
}
