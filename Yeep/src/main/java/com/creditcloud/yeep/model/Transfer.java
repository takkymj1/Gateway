/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;
import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.UserType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author tinglany
 */
@XmlType
public class Transfer extends BaseObject {
    
    //之前投标的请求流水号
    @NotNull
    private String requestNo;
    
    //投标的金额
    @NotNull
    private String transferAmount;
    
    //投资人会员类型,【见用户类型】
    @NotNull
    private UserType sourceUserType;
    
    //投资人会员编号
    @NotNull
    private String sourcePlatformUserNo;
    
    //借款人会员类型,【见用户类型】
    @NotNull
    private UserType targetUserType;
    
    //借款人会员编号
    @NotNull
    private String targetPlatformUserNo;

    public Transfer() {
    }
    
    public Transfer (String requestNo,
                     String transferAmount,
                     UserType sourceUserType,
                     String sourcePlatformUserNo,
                     UserType targetUserType,
                     String targetPlatformUserNo) {
        this.requestNo = requestNo;
        this.transferAmount = transferAmount;
        this.sourceUserType = sourceUserType;
        this.sourcePlatformUserNo = sourcePlatformUserNo;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    }   

    public String getRequestNo() {
        return requestNo;
    }

    public String getTransferAmount() {
        return transferAmount;
    }

    public UserType getSourceUserType() {
        return sourceUserType;
    }

    public String getSourcePlatformUserNo() {
        return sourcePlatformUserNo;
    }

    public UserType getTargetUserType() {
        return targetUserType;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setSourceUserType(UserType sourceUserType) {
        this.sourceUserType = sourceUserType;
    }

    public void setSourcePlatformUserNo(String sourcePlatformUserNo) {
        this.sourcePlatformUserNo = sourcePlatformUserNo;
    }

    public void setTargetUserType(UserType targetUserType) {
        this.targetUserType = targetUserType;
    }

    public void setTargetPlatformUserNo(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

}
