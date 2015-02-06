/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "notify")
public class WithdrawAccountNotify extends UserNotification {

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

    public WithdrawAccountNotify() {
    }

    public WithdrawAccountNotify(String platformNo,
                                 BizType bizType,
                                 String code,
                                 String message,
                                 String requestNo,
                                 String platformUserNo,
                                 String cardNo,
                                 String bank) {
        super(platformUserNo, platformNo, bizType, code, message);
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

}
