/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;

/**
 * 投标记录
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class PaymentRecordResponse extends BaseResponse {
    
    @NotNull
    private String paymentAmount;
    
    @NotNull
    private String sourceUserNo;
    
    @NotNull
    private LocalDate createTime;
    
    private LocalDate loanTime;
    
    @NotNull
    private Status status;
    
    public PaymentRecordResponse(String paymentAmount,
                                 String sourceUserNo,
                                 LocalDate createTime,
                                 LocalDate loanTime,
                                 Status status,
                                 String sign) {
        this.paymentAmount = paymentAmount;
        this.sourceUserNo = sourceUserNo;
        this.createTime = createTime;
        this.loanTime = loanTime;
        this.status = status;
    } 
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(paymentAmount))
                .append(StringUtils.trimToEmpty(sourceUserNo))
                .append(StringUtils.trimToEmpty(createTime.toString()))
                .append(StringUtils.trimToEmpty(loanTime.toString()))
                .append(StringUtils.trimToEmpty(status.name()));
        return sb.toString();
    }    
}
