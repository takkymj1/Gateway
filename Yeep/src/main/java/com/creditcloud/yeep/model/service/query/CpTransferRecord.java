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
public class CpTransferRecord extends BaseObject {

    @NotNull
    private String requestNo;
    
    @NotNull
    private String bizType;
    
    @NotNull
    private String amount;
    
    @NotNull
    private String status;
    
    @NotNull
    private String subStatus;

    public CpTransferRecord() {
    }

    public CpTransferRecord(String requestNo, String bizType, String amount, String status, String subStatus) {
        this.requestNo = requestNo;
        this.bizType = bizType;
        this.amount = amount;
        this.status = status;
        this.subStatus = subStatus;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getBizType() {
        return bizType;
    }

    public String getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }
    
    
}
