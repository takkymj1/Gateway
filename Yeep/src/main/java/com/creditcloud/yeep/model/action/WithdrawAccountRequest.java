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
    private FeeMode feeMode;
    
    /**
     * 提现金额，如果不传则由用户输入金额
     */
    private BigDecimal amount;

    public WithdrawAccountRequest() {
    }
    
    public WithdrawAccountRequest(String platformNo,
                                  String platformUserNo,
                                  String requestNo,
                                  FeeMode feeMode,                                
                                  String callbackUrl,
                                  String notifyUrl,
                                  BigDecimal amount) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl);
        this.feeMode = feeMode;
        this.amount = amount;
    }

    public FeeMode getFeeMode() {
        return feeMode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setFeeMode(FeeMode feeMode) {
        this.feeMode = feeMode;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    
}
