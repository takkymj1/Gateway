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

/**
 * 通用转账记录
 * 
 * @author tinglany
 */
@XmlRootElement (name = "response")
public class CpTransactionResponse extends BaseResponse {
    
    //流水号
    @NotNull
    private String requestNo;
    
    //业务类型
    @NotNull
    private String bizType;
    
    //转账总金额
    @NotNull
    private String amount;
    
    //充值状态
    @NotNull
    private String status;
    
    //处理状态: PROCESSING:处理中。SUCCESS:成功。ERROR:异常。FAIL:失败
    @NotNull
    private String subStatus;

    public CpTransactionResponse() {
    }
    
    public CpTransactionResponse(String requestNo,
                                 String bizType,
                                 String amount,
                                 String status,
                                 String subStatus,
                                 String sign) {
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
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(bizType))
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(status))
                .append(StringUtils.trimToEmpty(subStatus));
        return sb.toString();
    }    
}
