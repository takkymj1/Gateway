/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class TransferRequest extends UserRequest {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    /**
     * 标的金额
     */
    @NotNull
    private String transferAmount;

    /**
     * 借款人平台用户编号
     */
    @NotNull
    private String targetPlatformUserNo;

    /**
     * 本次投标金额，至少0.01元
     */
    @NotNull
    private String paymentAmount;

    /**
     * 超过此时间久不容许用户投标，格式为“YYYYmmdd”
     */
    private String expired;

    public TransferRequest(String platformUserNo,
                           String platformNo,
                           String callbackUrl,
                           String notifyUrl,
                           String sign,
                           String requestNo,
                           String orderNo,
                           String transferAmount,
                           String targetPlatformUserNo,
                           String paymentAmount,
                           String expired) {
        super(platformUserNo, platformNo, callbackUrl, notifyUrl, sign);
        this.requestNo = requestNo;
        this.orderNo = orderNo;
        this.transferAmount = transferAmount;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.paymentAmount = paymentAmount;
        this.expired = expired;
    }
}
