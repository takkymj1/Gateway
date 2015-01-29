/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseRequest;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 平台划款
 * 
 * @author tinglany
 */

@XmlRootElement(name = "request")
public class PlatformTransferRequest extends BaseRequest {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    
    //出款人类型,【见用户类型】,现在只支持 MERCHANT
    @NotNull
    private String sourceUserType;
    
    //出款人编号,如果是 MERCHANT 类型,请填写商户编号
    @NotNull
    private String sourcePlatformUserNo;
    
    //划款金额
    @NotNull
    private String amount;
    
    //【见用户类型】
    @NotNull
    private String targetUserType;
    
    //收款人编号
    @NotNull
    private String targetPlatformUserNo;

    public PlatformTransferRequest() {
    }
    
    public PlatformTransferRequest(String platformNo,
                                   String requestNo,
                                   String sourceUserType,
                                   String sourcePlatformUserNo,
                                   String amount,
                                   String targetUserType,
                                   String targetPlatformUserNo) {
        super(platformNo,null,null,null);
        this.requestNo = requestNo;
        this.sourceUserType = sourceUserType;
        this.sourcePlatformUserNo = sourcePlatformUserNo;
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    } 

    public String getRequestNo() {
        return requestNo;
    }

    public String getSourceUserType() {
        return sourceUserType;
    }

    public String getSourcePlatformUserNo() {
        return sourcePlatformUserNo;
    }

    public String getAmount() {
        return amount;
    }

    public String getTargetUserType() {
        return targetUserType;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setSourceUserType(String sourceUserType) {
        this.sourceUserType = sourceUserType;
    }

    public void setSourcePlatformUserNo(String sourcePlatformUserNo) {
        this.sourcePlatformUserNo = sourcePlatformUserNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTargetUserType(String targetUserType) {
        this.targetUserType = targetUserType;
    }

    public void setTargetPlatformUserNo(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

}
