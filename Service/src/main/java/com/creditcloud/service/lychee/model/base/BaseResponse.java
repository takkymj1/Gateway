/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.service.lychee.model.base;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 * 快付通响应基类
 * @author whitesky
 */
public abstract class BaseResponse extends BaseObject{
    
    /**
     * 发送给快付通的请求编号
     */
    @FormParam("reqNo")
    @Size(max = 32)
    private String reqNo;
    
    /**
     * 订单编号
     */
    @FormParam("orderNo")
    @NotNull
    @Size(max = 32)
    private String orderNo;
    
    @FormParam("signatureInfo")
    @NotNull
    /**
     * 签名数据
     */
    private String signatureInfo;
    
    @FormParam("merchantId")
    @Size(max = 20)
    /**
     * 商户身份id
     */
    private String merchantId;
    
    @FormParam("status")
    @NotNull
    @Size(max = 1)
    /**
     * 结果
     */
    private String status;
    
    @FormParam("failureDetails")
    /**
     * 处理失败详情,如果有
     */
    private String failureDetails;
    
    @FormParam("errorCode")
    /**
     * 查询错误码
     */
    private String errorCode;

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

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the failureDetails
     */
    public String getFailureDetails() {
        return failureDetails;
    }

    /**
     * @param failureDetails the failureDetails to set
     */
    public void setFailureDetails(String failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BaseResponse() {
    }

    public BaseResponse(String merchantId, String status, String failureDetails, String errorCode) {
        this.merchantId = merchantId;
        this.status = status;
        this.failureDetails = failureDetails;
        this.errorCode = errorCode;
    }

    public BaseResponse(String orderNo, String signatureInfo, String merchantId, String status, String failureDetails, String errorCode) {
        this.orderNo = orderNo;
        this.signatureInfo = signatureInfo;
        this.merchantId = merchantId;
        this.status = status;
        this.failureDetails = failureDetails;
        this.errorCode = errorCode;
    }
    
    /**
     * 是否成功响应
     * @return 
     */
    public boolean success(){
        return false;
    }
    
    private String respDesc;

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
     * @return the respDesc
     */
    public String getRespDesc() {
        return respDesc;
    }

    /**
     * @param respDesc the respDesc to set
     */
    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }
    
}
