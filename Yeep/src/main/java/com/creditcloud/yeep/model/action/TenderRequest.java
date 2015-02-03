/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import java.math.BigDecimal;
import java.util.Date;
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
    private BigDecimal transferAmount;

    /**
     * 借款人平台用户编号
     */
    @NotNull
    private String targetPlatformUserNo;

    /**
     * 本次投标金额，至少0.01元
     */
    @NotNull
    private BigDecimal paymentAmount;

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
                         BigDecimal transferAmount,
                         String targetPlatformUserNo,
                         BigDecimal paymentAmount,
                         String expired,
                         String callbackUrl,
                         String notifyUrl) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl);
        this.orderNo = orderNo;
        this.transferAmount = transferAmount;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.paymentAmount = paymentAmount;
        this.expired = expired;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public String getExpired() {
        return expired;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setTargetPlatformUserNo(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

}
