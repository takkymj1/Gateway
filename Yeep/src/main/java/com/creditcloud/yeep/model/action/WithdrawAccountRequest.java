/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.enums.FeeModel;
import com.creditcloud.yeep.model.UserRequest;



/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class WithdrawAccountRequest extends UserRequest {
    /**
     * 请求序列号
     */
    @NotNull
    private String requestNo;
    
    /**
     * 费率模式
     */
    @NotNull
    private FeeModel feeMode;
    
    /**
     * 提现金额，如果不传则由用户输入金额
     */
    private String amount;

    public WithdrawAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  FeeModel feeMode,
                                  String amount,
                                  String callbackUrl,
                                  String notifyUrl,
                                  String sign) {
        super(platformUserNo, platformNo, callbackUrl, notifyUrl, sign);
        this.feeMode = feeMode;
        this.amount = amount;
        this.requestNo = requestNo;
    }
}
