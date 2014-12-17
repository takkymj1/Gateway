/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.enums.FeeMode;
import com.creditcloud.yeep.model.UserRequest;
import org.apache.commons.lang3.StringUtils;



/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class WithdrawAccountRequest extends UserRequest {

    
    /**
     * 费率模式
     */
    @NotNull
    private FeeMode feeMode;
    
    /**
     * 提现金额，如果不传则由用户输入金额
     */
    private String amount;

    public WithdrawAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  FeeMode feeMode,
                                  String amount,
                                  String callbackUrl,
                                  String notifyUrl,
                                  String sign) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl,sign);
        this.feeMode = feeMode;
        this.amount = amount;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(feeMode.name()))
                .append(StringUtils.trimToEmpty(amount));
        return sb.toString();
    }
}
