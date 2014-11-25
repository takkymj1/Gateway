/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserNotification;
import com.creditcloud.yeep.enums.CardStatus;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.model.enums.misc.Bank;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class BindBankCardNotification extends UserNotification {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 绑定的卡号
     */
    @NotNull
    private String bankCardNo;

    /**
     * 绑卡状态
     */
    @NotNull
    private CardStatus cardStatus;

    /**
     * 银行代码
     */
    @NotNull
    private Bank bank;

    public BindBankCardNotification(String platformNo,
                                    BizType bizType,
                                    String code,
                                    String message,
                                    String requestNo,
                                    String platformUserNo,
                                    String bankCardNo,
                                    CardStatus cardStatus,
                                    Bank bank) {
        super(platformUserNo, platformNo, bizType, code, message);
        this.requestNo = requestNo;
        this.bankCardNo = bankCardNo;
        this.cardStatus = cardStatus;
        this.bank = bank;
    }
}
