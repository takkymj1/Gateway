/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "notify")
public class WithdrawAccountNotification extends UserNotification {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 绑定的卡号
     */
    @NotNull
    private String cardNo;

    /**
     * 银行代码
     */
    @NotNull
    private String bank;

    public WithdrawAccountNotification() {
    }

    public WithdrawAccountNotification(String platformNo,
                                       String bizType,
                                       String code,
                                       String message,
                                       String requestNo,
                                       String platformUserNo,
                                       String cardNo,
                                       String bank,
                                       String sign) {
        super(platformUserNo, platformNo, bizType, code, message,sign);
        this.requestNo = requestNo;
        this.cardNo = cardNo;
        this.bank = bank;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getBank() {
        return bank;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(cardNo))
                .append(StringUtils.trimToEmpty(bank));
        return sb.toString();
    }

    @Override
    public boolean success() {
        return super.success();
    }

}
