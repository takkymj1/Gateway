/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;



/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "request")
public class WithdrawAccountRequest extends UserRequest {

    
    /**
     * 费率模式
     */
    @NotNull
    private String feeMode;
    
    /**
     * 提现金额，如果不传则由用户输入金额
     */
    private String amount;

    public WithdrawAccountRequest() {
    }
    
    public WithdrawAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  String feeMode,                                
                                  String callbackUrl,
                                  String notifyUrl,
                                  String amount,
                                  String sign) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl,sign);
        this.feeMode = feeMode;
        this.amount = amount;
    }

    public String getFeeMode() {
        return feeMode;
    }

    public String getAmount() {
        return amount;
    }

    public void setFeeMode(String feeMode) {
        this.feeMode = feeMode;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(feeMode))
                .append(StringUtils.trimToEmpty(amount));
        return sb.toString();
    }
}
