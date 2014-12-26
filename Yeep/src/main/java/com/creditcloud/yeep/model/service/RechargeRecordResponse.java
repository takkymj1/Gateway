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
 *
 * @author tinglany
 */

@XmlRootElement (name = "response")
public class RechargeRecordResponse extends BaseResponse {
    //充值金额
    @NotNull
    private String amount;
    
    //充值用户
    @NotNull
    private String UserNo;
    
    //充值时间
    @NotNull
    private LocalDate createTime;
    
    //充值状态
    @NotNull
    private String status;

    public RechargeRecordResponse() {
    }
    
    public RechargeRecordResponse(String amount,
                                  String UserNo,
                                  LocalDate createTime,
                                  String status,
                                  String sign) {
        this.amount = amount;
        this.UserNo = UserNo;
        this.createTime = createTime;
        this.status = status;
    }
    


    public String getAmount() {
        return amount;
    }

    public String getUserNo() {
        return UserNo;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUserNo(String UserNo) {
        this.UserNo = UserNo;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(UserNo))
                .append(StringUtils.trimToEmpty(createTime.toString()))
                .append(StringUtils.trimToEmpty(status));
        return sb.toString();
    }    
}
