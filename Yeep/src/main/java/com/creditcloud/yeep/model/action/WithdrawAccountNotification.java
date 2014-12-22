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
import org.apache.commons.lang3.StringUtils;
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
                                       Bank bank,
                                       String sign) {
        super(platformUserNo, platformNo, bizType, code, message,sign);
        this.requestNo = requestNo;
        this.cardNo = cardNo;
        this.bank = bank;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(cardNo))
                .append(StringUtils.trimToEmpty(bank.name()));
        return sb.toString();
    }

    @Override
    public boolean success() {
        return super.success();
    }

}
