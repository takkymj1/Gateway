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
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;

/**
 *
 * @author tinglany
 */
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
    
    public WithdrawRecordResponse(String amount,
                                  String userNo,
                                  LocalDate createTime,
                                  Status status,
                                  RemitStatus remitStatus,
                                  String sign) {
        this.amount = amount;
        this.userNo = userNo;
        this.createTime = createTime;
        this.status = status;
        this.remitStatus = remitStatus;
    } 
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(userNo))
                .append(StringUtils.trimToEmpty(createTime.toString()))
                .append(StringUtils.trimToEmpty(status.name()))
                .append(StringUtils.trimToEmpty(remitStatus.name()));
        return sb.toString();
    }    
}
