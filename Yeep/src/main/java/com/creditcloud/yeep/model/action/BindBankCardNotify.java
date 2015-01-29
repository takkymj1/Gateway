/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserNotification;
import com.creditcloud.yeep.enums.CardStatus;
import javax.validation.constraints.NotNull;
import com.creditcloud.model.enums.misc.Bank;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tinglany
 */
@XmlRootElement (name = "notify")
public class BindBankCardNotify extends UserNotification {

    /**
     * 请求流水号
     */
    @NotNull
    @XmlTransient
    private String requestNo;

    /**
     * 绑定的卡号
     */
    @NotNull
    @XmlTransient
    private String bankCardNo;

    /**
     * 绑卡状态
     */
    @NotNull
    @XmlTransient
    private CardStatus cardStatus;

    /**
     * 银行代码
     */
    @NotNull
    @XmlTransient
    private Bank bank;

    public BindBankCardNotify() {
    }

    public BindBankCardNotify(String platformNo,
                                    String bizType,
                                    String code,
                                    String message,
                                    String requestNo,
                                    String platformUserNo,
                                    String bankCardNo,
                                    CardStatus cardStatus,
                                    Bank bank,
                                    String sign) {
        super(platformUserNo, platformNo, bizType, code, message, sign);
        this.requestNo = requestNo;
        this.bankCardNo = bankCardNo;
        this.cardStatus = cardStatus;
        this.bank = bank;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public Bank getBank() {
        return bank;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    

}
