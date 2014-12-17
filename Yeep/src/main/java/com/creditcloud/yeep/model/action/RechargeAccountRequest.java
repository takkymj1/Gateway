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
public class RechargeAccountRequest extends UserRequest {

    /**
     * 充值金额，如果不传则有用户填写充值金额
     */
    private String amount;

    /**
     * 费率模式，固定值PLATFORM
     */
    @NotNull
    private String feeMode;

    public RechargeAccountRequest() {
    }

    public RechargeAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  String amount,
                                  String feeMode,
                                  String callbackUrl,
                                  String notifyUrl,
                                  String sign) {
        super(platformUserNo, platformNo, null,requestNo,callbackUrl, notifyUrl,sign);
        this.amount = amount;
        this.feeMode = feeMode;
    }

    public String getAmount() {
        return amount;
    }

    public String getFeeMode() {
        return feeMode;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setFeeMode(String feeMode) {
        this.feeMode = feeMode;
    }
    
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(feeMode));
        return sb.toString();
    }    
}
