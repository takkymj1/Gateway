/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.service.lychee.model.base;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 请求参数基类
 * @author whitesky
 */
public abstract class BaseRequest extends BaseObject{
    
    @NotNull
    /**
     * 签名数据
     */
    private String signatureInfo;
    
    @Size(max = 20)
    /**
     * 商户身份id
     */
    private String merchantId;
    
    @NotNull
    @Size(max = 20)
    /**
     * 商户注册订单号
     */
    private String reqNo;
    
        
    @NotNull
    @Size(max = 20)
    /**
     * 商户注册订单号
     */
    private String orderNo;
    
    @NotNull
    @Size(max = 200)
    /**
     * 回调url
     */
    private String returnUrl;

    /**
     * @return the signatureInfo
     */
    public String getSignatureInfo() {
        return signatureInfo;
    }

    /**
     * @param signatureInfo the signatureInfo to set
     */
    public void setSignatureInfo(String signatureInfo) {
        this.signatureInfo = signatureInfo;
    }

    /**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public BaseRequest() {
    }

    public BaseRequest(String merchantId) {
        this.merchantId = merchantId;
    }
    
        /**
     * @return the returnUrl
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * @param returnUrl the returnUrl to set
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
    
        /**
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return the reqNo
     */
    public String getReqNo() {
        return reqNo;
    }

    /**
     * @param reqNo the reqNo to set
     */
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }
    

}
