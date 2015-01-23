/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.RemitStatus;
import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;


/**
 *
 * @author tinglany
 */
@XmlRootElement (name = "response")
public class WithdrawRecordResponse extends BaseResponse {
    
    //提现金额
    @NotNull
    private String amount;
    
    //提现用户
    @NotNull
    private String userNo;
    
    //提现时间
    @NotNull
    private LocalDate createTime;
    
    //充值状态
    @NotNull
    private Status status;
    
    //REMIT_SUCCESS打款成功 REMIT_FAILURE打款失败 REMITING打款中
    private RemitStatus remitStatus;
    

    public WithdrawRecordResponse() {
    }
    
    public WithdrawRecordResponse(String platformNo,
                                  String code,
                                  String description,
                                  String amount,
                                  String userNo,
                                  LocalDate createTime,
                                  Status status,
                                  RemitStatus remitStatus) {
        super(platformNo,code,description);
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

    public LocalDate getCreateTime() {
        return createTime;
    }

    public Status getStatus() {
        return status;
    }

    public RemitStatus getRemitStatus() {
        return remitStatus;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setRemitStatus(RemitStatus remitStatus) {
        this.remitStatus = remitStatus;
    }
      
}
