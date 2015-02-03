/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.MemberType;
import com.creditcloud.yeep.enums.UserType;
import java.math.BigDecimal;
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
    private BigDecimal amount;
    
    //用户类型
    @NotNull
    private UserType targetUserType;
    
    //平台用户标号
    @NotNull
    private String targetPlatformUserNo;
    
    //固定值TRANSFER
    @NotNull
    private BizType bizType;

    public CpTransDetail() {
    }

    public CpTransDetail(BigDecimal amount, UserType targetUserType, String targetPlatformUserNo, BizType bizType) {
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.bizType = bizType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public UserType getTargetUserType() {
        return targetUserType;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public BizType getBizType() {
        return bizType;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTargetUserType(UserType targetUserType) {
        this.targetUserType = targetUserType;
    }

    public void setTargetPlatformUserNo(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }
    
}
