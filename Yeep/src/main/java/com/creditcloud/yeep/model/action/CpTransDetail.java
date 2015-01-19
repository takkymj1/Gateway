/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlType;

/**
 * 通用转账授权子类
 * 
 * @author tinglany
 */
@XmlType
public class CpTransDetail extends BaseObject {
    //转入金额
    @NotNull
    private String amount;
    
    //用户类型
    @NotNull
    private String targetUserType;
    
    //平台用户标号
    @NotNull
    private String targetPlatformUserNo;
    
    //固定值TRANSFER
    @NotNull
    private String bizType;

    public CpTransDetail() {
    }

    public CpTransDetail(String amount, String targetUserType, String targetPlatformUserNo, String bizType) {
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.bizType = bizType;
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

    public String getBizType() {
        return bizType;
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

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }
    
}
