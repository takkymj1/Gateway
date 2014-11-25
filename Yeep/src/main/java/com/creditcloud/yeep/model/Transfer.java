/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;
import javax.validation.constraints.NotNull;
import lombok.Data;
/**
 *
 * @author tinglany
 */
//@Data
public class Transfer {
    
    //之前投标的请求流水号
    @NotNull
    private String requestNo;
    
    //投标的金额
    @NotNull
    private String transferAmount;
    
    //投资人会员类型,【见用户类型】
    @NotNull
    private String sourceUserType;
    
    //投资人会员编号
    @NotNull
    private String sourcePlatformUserNo;
    
    //借款人会员类型,【见用户类型】
    @NotNull
    private String targetUserType;
    
    //借款人会员编号
    @NotNull
    private String targetPlatformUserNo;
    
    public Transfer (String requestNo,
                     String transferAmount,
                     String sourceUserType,
                     String sourcePlatformUserNo,
                     String targetUserType,
                     String targetPlatformUserNo) {
        this.requestNo = requestNo;
        this.transferAmount = transferAmount;
        this.sourceUserType = sourceUserType;
        this.sourcePlatformUserNo = sourcePlatformUserNo;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    }   
}
