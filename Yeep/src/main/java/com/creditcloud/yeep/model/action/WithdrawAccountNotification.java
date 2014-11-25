/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.model.enums.misc.Bank;
/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
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
    private Bank bank;

    public WithdrawAccountNotification(String platformNo,
                                       BizType bizType,
                                       String code,
                                       String message,
                                       String requestNo,
                                       String platformUserNo,
                                       String cardNo,
                                       Bank bank) {
        super(platformUserNo, platformNo, bizType, code, message);
        this.requestNo = requestNo;
        this.cardNo = cardNo;
        this.bank = bank;
    }

}
