/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.request;

import com.creditcloud.insurance.model.enci.BaseDTO;

/**
 * 退保核算 100006
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class RefundCalcRequest extends BaseDTO {

    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 保单号
     */
    private String policyNo;
    
    /**
     * 领取金额
     * 
     * 以元为单位，两位小数
     */
    private double withdrawAmount;
    
    /**
     * 是否全部领取
     */
    private int isWithdrawAll;
    
    /**
     * 是否退保
     */
    private int isCancelPolicy;
    
    /**
     * 保单密码 AES
     */
    private String policyPassword;

    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
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
