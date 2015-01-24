/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;

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
                               String notifyUrl) {
        super(platformUserNo,platformNo,null,requestNo,notifyUrl,null);
        this.orderNo = orderNo;
        this.transferAmount = transferAmount;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.paymentAmount = paymentAmount;     
    }
 
}
