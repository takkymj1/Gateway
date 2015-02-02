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

public class RechargeRecord extends BaseObject {
    @NotNull
    private String amount;
    
    @NotNull
    private String userNo;
    
    @NotNull
    private String createTime;
    
    @NotNull
    private String status;  

    public RechargeRecord() {
    }

    public RechargeRecord(String amount, String userNo, String createTime, String status) {
        this.amount = amount;
        this.userNo = userNo;
        this.createTime = createTime;
        this.status = status;
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
    
}
