/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kakaci
 */
@XmlRootElement(name = "request")
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

    public TransferClaimsRequest() {
    }

    public TransferClaimsRequest(String platformNo,
                                 String platformUserNo,
                                 String requestNo,
                                 String orderNo,
                                 String paymentRequestNo,
                                 String amount,
                                 String notifyUrl) {
        super(platformUserNo, platformNo, null, requestNo,null,notifyUrl);
        this.orderNo = orderNo;
        this.paymentRequestNo = paymentRequestNo;
        this.amount = amount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getPaymentRequestNo() {
        return paymentRequestNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setPaymentRequestNo(String paymentRequestNo) {
        this.paymentRequestNo = paymentRequestNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }   

}
