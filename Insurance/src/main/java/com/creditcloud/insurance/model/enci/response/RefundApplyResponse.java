/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import javax.validation.constraints.NotNull;

/**
 * 退保 100007
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class RefundApplyResponse extends BaseDTO {

    /**
     * 合作商订单号
     */
    @NotNull
    private String partnerOrderId;
    
    /**
     * 合作商退保订单号
     */
    private String partnerRefundId;
    
    /**
     * 保单号
     */
    @NotNull
    private String policyNo;
    
    /**
     * 保单账户现金价值
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double policyValue;
    
    /**
     * 退保金额
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double withdrawAmount;
    
    /**
     * 实际可领取金额
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double availableAmount;
 
    /**
     * 是否全部领取
     */
    @NotNull
    private int isWithdrawAll;
    
    /**
     * 是否退保
     */
    @NotNull
    private int isCancelPolicy;
    
    /**
     * 保单密码
     */
    private String policyPassword;

    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public String getPartnerRefundId() {
        return partnerRefundId;
    }

    public void setPartnerRefundId(String partnerRefundId) {
        this.partnerRefundId = partnerRefundId;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public double getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(double policyValue) {
        this.policyValue = policyValue;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public int getIsWithdrawAll() {
        return isWithdrawAll;
    }

    public void setIsWithdrawAll(int isWithdrawAll) {
        this.isWithdrawAll = isWithdrawAll;
    }

    public int getIsCancelPolicy() {
        return isCancelPolicy;
    }

    public void setIsCancelPolicy(int isCancelPolicy) {
        this.isCancelPolicy = isCancelPolicy;
    }

    public String getPolicyPassword() {
        return policyPassword;
    }

    public void setPolicyPassword(String policyPassword) {
        this.policyPassword = policyPassword;
    }
    
}
