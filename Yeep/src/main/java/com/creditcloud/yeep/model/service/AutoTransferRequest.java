/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动投标
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class AutoTransferRequest extends UserRequest {
    
    
    //标的号
    @NotNull
    private String orderNo;
    
    //标的金额
    @NotNull
    private String transferAmount;
    
    //借款人平台会员编号
    @NotNull
    private String targetPlatformUserNo;
    
    //冻结金额
    @NotNull
    private String paymentAmount;
    
    public AutoTransferRequest(String platformNo,
                               String platformUserNo,
                               String requestNo,
                               String orderNo,
                               String transferAmount,
                               String targetPlatformUserNo,
                               String paymentAmount,
                               String notifyUrl,
                               String sign) {
        super(platformUserNo,platformNo,null,requestNo,notifyUrl,null,sign);
        this.orderNo = orderNo;
        this.transferAmount = transferAmount;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.paymentAmount = paymentAmount;     
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo))
                .append(StringUtils.trimToEmpty(transferAmount))
                .append(StringUtils.trimToEmpty(targetPlatformUserNo))
                .append(StringUtils.trimToEmpty(paymentAmount));
        return sb.toString();
    }    
}
