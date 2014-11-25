/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseResponse;
/**
 * 账户查询
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class AccountInfoResponse extends BaseResponse {
      
    //【见会员类型】
    @NotNull
    private String memberType;
    
    //【见会员激活状态】
    @NotNull
    private String activeStatus;
    
    //账户余额
    @NotNull
    private String balance;
    
    //可用余额
    @NotNull
    private String availableAmount;
    
    //冻结金额
    @NotNull
    private String freezeAmount;
    
    //绑定的卡号
    private String cardNo;
    
    //【见绑卡状态】
    private String cardStatus;
    
    //【见银行代码】
    private String bank;
    
    public AccountInfoResponse(String platfromNo,
                                String code,
                                String description,
                                String memberType,
                                String activeStatus,
                                String balance,
                                String availableAmount,
                                String freezeAmount,
                                String cardNo,
                                String cardStatus,
                                String bank
                                ) {
        super(platfromNo,code,description);
        this.memberType = memberType;
        this.activeStatus = activeStatus;
        this.balance = balance;
        this.availableAmount = availableAmount;
        this.freezeAmount = freezeAmount;
        this.cardNo = cardNo;
        this.cardStatus = cardStatus;
        this.bank = bank;
        
    }
    
    
}
