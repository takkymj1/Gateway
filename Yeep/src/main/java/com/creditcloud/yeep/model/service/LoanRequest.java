/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.Transfer;
import org.apache.commons.lang3.StringUtils;
/**
 * 放款
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class LoanRequest extends BaseRequest {
    
    //标的号
    @NotNull
    private String orderNo;
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //平台方收取分润
    private String fee;
    
    //transfer
    @NotNull
    private Transfer transfer;
    
    //服务器通知 URL
    @NotNull
    private String notifyUrl;
    
    public LoanRequest(String platformNo,
                       String orderNo,
                       String requestNo,
                       String fee,
                       Transfer transfer,
                       String notifyUrl,
                       String sign) {
        super(platformNo,null,notifyUrl,null,sign);
        this.orderNo = orderNo;
        this.requestNo = requestNo;
        this.fee = fee;
        this.transfer = transfer;
        this.notifyUrl = notifyUrl;
    } 
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo))
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(fee))
                .append(StringUtils.trimToEmpty(transfer.toString()))
                .append(StringUtils.trimToEmpty(notifyUrl));
        return sb.toString();
    }    
}
