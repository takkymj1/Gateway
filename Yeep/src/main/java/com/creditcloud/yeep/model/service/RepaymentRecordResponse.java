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
 * 还款记录
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class RepaymentRecordResponse extends BaseResponse {
    
    //还款金额
    @NotNull
    private String repaymentAmount;
    
    //原投资人的标识
    @NotNull
    private String targetUserNo;
    
    //还款时间
    private LocalDate loanTime;
    
    //还款状态
    @NotNull
    private Status status;
    
    public RepaymentRecordResponse(String repaymentAmount,
                                   String targetUserNo,
                                   LocalDate loanTime,
                                   Status status,
                                   String sign) {
        this.repaymentAmount = repaymentAmount;
        this.targetUserNo = targetUserNo;
        this.loanTime = loanTime;
        this.status = status;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(repaymentAmount))
                .append(StringUtils.trimToEmpty(targetUserNo))
                .append(StringUtils.trimToEmpty(loanTime.toString()))
                .append(StringUtils.trimToEmpty(status.name()));
        return sb.toString();
    }
}
