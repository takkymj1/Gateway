/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseResponse;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.StringUtils;
/**
 * 账户查询
 * 
 * @author tinglany
 */

@XmlRootElement (name = "response")
public class AcctInfoResponse extends BaseResponse {
      
    //【见会员类型】
    @NotNull
    @XmlTransient
    private String memberType;
    
    //【见会员激活状态】
    @NotNull
    @XmlTransient
    private String activeStatus;
    
    //账户余额
    @NotNull
    @XmlTransient
    private String balance;
    
    //可用余额
    @NotNull
    @XmlTransient
    private String availableAmount;
    
    //冻结金额
    @NotNull
    @XmlTransient
    private String freezeAmount;
    
    //绑定的卡号
    @XmlTransient
    private String cardNo;
    
    //【见绑卡状态】
    @XmlTransient
    private String cardStatus;
    
    //【见银行代码】
    @XmlTransient
    private String bank;

    public AcctInfoResponse() {
    }
    
    public AcctInfoResponse(String platfromNo,
                                String code,
                                String description,
                                String memberType,
                                String activeStatus,
                                String balance,
                                String availableAmount,
                                String freezeAmount,
                                String cardNo,
                                String cardStatus,
                                String bank) {
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

    public String getMemberType() {
        return memberType;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public String getBalance() {
        return balance;
    }

    public String getAvailableAmount() {
        return availableAmount;
    }

    public String getFreezeAmount() {
        return freezeAmount;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public String getBank() {
        return bank;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    
}
