/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.FeeMode;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author kakaci
 */

@XmlRootElement (name = "request")
public class RechargeAccountRequest extends UserRequest {

    /**
     * 充值金额，如果不传则有用户填写充值金额
     */
    private BigDecimal amount;

    /**
     * 费率模式，固定值PLATFORM
     */
    @NotNull
    private FeeMode feeMode;

    public RechargeAccountRequest() {
    }

    public RechargeAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  BigDecimal amount,
                                  FeeMode feeMode,
                                  String callbackUrl,
                                  String notifyUrl) {
        super(platformUserNo, platformNo, null,requestNo,callbackUrl, notifyUrl);
        this.amount = amount;
        this.feeMode = feeMode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public FeeMode getFeeMode() {
        return feeMode;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setFeeMode(FeeMode feeMode) {
        this.feeMode = feeMode;
    }
   
}
