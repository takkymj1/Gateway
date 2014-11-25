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
public class RepaymentRequest extends UserRequest {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 标的号
     */
    @NotNull
    private String OrderNo;

    @NotNull
    private String repayment;

    /**
     * 投标时用的请求流水号
     */
    @NotNull
    private String paymentRequestNo;

    /**
     * 投资人平台用户编号
     */
    @NotNull
    private String targetUserNo;

    /**
     * 还款金额。投资人到账金额=还款金额-平台分润，至少0.01元
     */
    @NotNull
    private String amount;

    /**
     * 平台分润
     */
    @NotNull
    private String fee;

    public RepaymentRequest(String platformUserNo,
                            String platformNo,
                            String callbackUrl,
                            String notifyUrl,
                            String sign,
                            String requestNo,
                            String OrderNo,
                            String repayment,
                            String paymentRequestNo,
                            String targetUserNo,
                            String amount,
                            String fee) {
        super(platformUserNo, platformNo, callbackUrl, notifyUrl, sign);
        this.requestNo = requestNo;
        this.OrderNo = OrderNo;
        this.repayment = repayment;
        this.paymentRequestNo = paymentRequestNo;
        this.targetUserNo = targetUserNo;
        this.amount = amount;
        this.fee = fee;
    }

}
