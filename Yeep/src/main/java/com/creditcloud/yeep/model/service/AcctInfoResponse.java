/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.ActiveStatus;
import com.creditcloud.yeep.enums.CardStatus;
import com.creditcloud.yeep.enums.MemberType;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseResponse;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
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
    private MemberType memberType;
    
    //【见会员激活状态】
    @NotNull
    @XmlTransient
    private ActiveStatus activeStatus;
    
    //账户余额
    @NotNull
    @XmlTransient
    private BigDecimal balance;
    
    //可用余额
    @NotNull
    @XmlTransient
    private BigDecimal availableAmount;
    
    //冻结金额
    @NotNull
    @XmlTransient
    private BigDecimal freezeAmount;
    
    //绑定的卡号
    @XmlTransient
    private String cardNo;
    
    //【见绑卡状态】
    @XmlTransient
    private CardStatus cardStatus;
    
    //【见银行代码】
    @XmlTransient
    private String bank;

    public AcctInfoResponse() {
    }
    
    public AcctInfoResponse(String platfromNo,
                                String code,
                                String description,
                                MemberType memberType,
                                ActiveStatus activeStatus,
                                BigDecimal balance,
                                BigDecimal availableAmount,
                                BigDecimal freezeAmount,
                                String cardNo,
                                CardStatus cardStatus,
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

    public MemberType getMemberType() {
        return memberType;
    }

    public ActiveStatus getActiveStatus() {
        return activeStatus;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public String getCardNo() {
        return cardNo;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public String getBank() {
        return bank;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    public void setActiveStatus(ActiveStatus activeStatus) {
        this.activeStatus = activeStatus;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    
}
