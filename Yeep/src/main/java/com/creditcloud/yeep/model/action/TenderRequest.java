/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "request")
public class TenderRequest extends UserRequest {

    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    /**
     * 标的金额
     */
    @NotNull
    private String transferAmount;

    /**
     * 借款人平台用户编号
     */
    @NotNull
    private String targetPlatformUserNo;

    /**
     * 本次投标金额，至少0.01元
     */
    @NotNull
    private String paymentAmount;

    /**
     * 超过此时间久不容许用户投标，格式为“YYYY-mm-dd”
     */
    private String expired;

    public TenderRequest() {
    }

    
    public TenderRequest(String platformNo,
                         String platformUserNo,
                         String requestNo,
                         String orderNo,
                         String transferAmount,
                         String targetPlatformUserNo,
                         String paymentAmount,
                         String expired,
                         String callbackUrl,
                         String notifyUrl,
                         String sign) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl,sign);
        this.orderNo = orderNo;
        this.transferAmount = transferAmount;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.paymentAmount = paymentAmount;
        this.expired = expired;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getTransferAmount() {
        return transferAmount;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public String getExpired() {
        return expired;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setTargetPlatformUserNo(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo))
                .append(StringUtils.trimToEmpty(transferAmount))
                .append(StringUtils.trimToEmpty(targetPlatformUserNo))
                .append(StringUtils.trimToEmpty(paymentAmount))
                .append(StringUtils.trimToEmpty(expired));
        return sb.toString();
    }
}
