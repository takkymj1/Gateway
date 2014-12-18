/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 * 通用转账记录
 * 
 * @author tinglany
 */
public class CpTransactionResponse extends BaseResponse {
    
    //流水号
    @NotNull
    private String requestNo;
    
    //业务类型
    @NotNull
    private BizType bizType;
    
    //转账总金额
    @NotNull
    private String amount;
    
    //充值状态
    @NotNull
    private Status status;
    
    //处理状态: PROCESSING:处理中。SUCCESS:成功。ERROR:异常。FAIL:失败
    @NotNull
    private Status subStatus;
    
    public CpTransactionResponse(String requestNo,
                                 BizType bizType,
                                 String amount,
                                 Status status,
                                 Status subStatus,
                                 String sign) {
        this.requestNo = requestNo;
        this.bizType = bizType;
        this.amount = amount;
        this.status = status;
        this.subStatus = subStatus;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(bizType.name()))
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(status.name()))
                .append(StringUtils.trimToEmpty(subStatus.name()));
        return sb.toString();
    }    
}
