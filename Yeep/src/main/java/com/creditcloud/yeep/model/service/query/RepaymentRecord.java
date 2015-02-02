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
public class RepaymentRecord extends BaseObject {
    @NotNull
    private String repaymentAmount;
    
    @NotNull
    private String targetUserNo;
    
    @NotNull
    private String createTime;
    
    @NotNull
    private String status; 

    public RepaymentRecord() {
    }

    public RepaymentRecord(String repaymentAmount, String targetUserNo, String createTime, String status) {
        this.repaymentAmount = repaymentAmount;
        this.targetUserNo = targetUserNo;
        this.createTime = createTime;
        this.status = status;
    }

    public String getRepaymentAmount() {
        return repaymentAmount;
    }

    public String getTargetUserNo() {
        return targetUserNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setRepaymentAmount(String repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public void setTargetUserNo(String targetUserNo) {
        this.targetUserNo = targetUserNo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
