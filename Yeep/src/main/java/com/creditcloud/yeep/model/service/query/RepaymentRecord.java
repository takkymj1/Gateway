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
public class RepaymentRecord extends BaseObject {
    @NotNull
    private BigDecimal repaymentAmount;
    
    @NotNull
    private String targetUserNo;
    
    @NotNull
    private Date createTime;
    
    @NotNull
    private Status status; 

    public RepaymentRecord() {
    }

    public RepaymentRecord(BigDecimal repaymentAmount, String targetUserNo, Date createTime, Status status) {
        this.repaymentAmount = repaymentAmount;
        this.targetUserNo = targetUserNo;
        this.createTime = createTime;
        this.status = status;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public String getTargetUserNo() {
        return targetUserNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public void setTargetUserNo(String targetUserNo) {
        this.targetUserNo = targetUserNo;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
}
