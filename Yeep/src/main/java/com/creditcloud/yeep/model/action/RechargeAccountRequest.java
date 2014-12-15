/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

import com.creditcloud.yeep.enums.FeeMode;
import com.creditcloud.yeep.model.UserRequest;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class RechargeAccountRequest extends UserRequest {

    /**
     * 平台用户编号
     */
    @NotNull
    private String platformUserNo;


    /**
     * 充值金额，如果不传则有用户填写充值金额
     */
    private String amount;

    /**
     * 费率模式，固定值PLATFORM
     */
    @NotNull
    private FeeMode feeMode;

    public RechargeAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  String amount,
                                  FeeMode feeMode,
                                  String callbackUrl,
                                  String notifyUrl) {
        super(platformUserNo, platformNo, null,requestNo,callbackUrl, notifyUrl);
        this.amount = amount;
        this.feeMode = feeMode;
    }
}
