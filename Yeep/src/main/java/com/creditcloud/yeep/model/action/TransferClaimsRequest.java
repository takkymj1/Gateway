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
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class TransferClaimsRequest extends UserRequest {

    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    /**
     * 投标时使用的请求流水号
     */
    @NotNull
    private String paymentRequestNo;

    /**
     * 债权购买人出资的金额
     */
    @NotNull
    private String amount;

    public TransferClaimsRequest(String platformUserNo,
                                 String platformNo,
                                 String notifyUrl,
                                 String sign,
                                 String requestNo,
                                 String orderNo,
                                 String paymentRequestNo,
                                 String amount) {
        super(platformUserNo, platformNo, null, requestNo,null,notifyUrl,sign);
        this.orderNo = orderNo;
        this.paymentRequestNo = paymentRequestNo;
        this.amount = amount;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo))
                .append(StringUtils.trimToEmpty(paymentRequestNo))
                .append(StringUtils.trimToEmpty(amount));
        return sb.toString();
    }
}
