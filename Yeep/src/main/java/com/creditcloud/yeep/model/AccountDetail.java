/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分账账户
 *
 * @author tinglany
 */

@XmlRootElement
public class AccountDetail extends YeepResult {

    private static final long serialVersionUID = 20131115L;
    
    @NotNull
    protected String platfromNo;

    @NotNull
    protected String memberType;

    @NotNull
    protected String activeStatus;
    
    @NotNull
    protected String balance;
 
    @NotNull
    protected String availableAmount;
 
    @NotNull
    protected String freezeAmount;
    
    protected String cardNo;
    
    protected String cardStatus;   
    
    protected String bank; 

    public AccountDetail() {
    }
    
   public AccountDetail(String platfromNo,
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
        super(code, description);
        this.memberType = memberType;
        this.activeStatus = activeStatus;
        this.balance = balance;
        this.availableAmount = availableAmount;
        this.freezeAmount = freezeAmount;
        this.cardNo = cardNo;
        this.cardStatus = cardStatus;
        this.bank = bank;
        
    }

    public String getPlatfromNo() {
        return platfromNo;
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

    public void setPlatfromNo(String platfromNo) {
        this.platfromNo = platfromNo;
    }


}
