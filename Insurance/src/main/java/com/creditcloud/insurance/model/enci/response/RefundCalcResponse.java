/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;

/**
 * 退保核算 100006
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class RefundCalcResponse extends BaseDTO {

    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 保单号
     */
    private String policyNo;
    
    /**
     * 退保金额
     * 
     * 以元为单位，两位小数
     */
    private double withdrawAmount;
    
    /**
     * 实际可领取金额
     * 
     * 以元为单位，两位小数
     */
    private double availableAmount;
    
    /**
     * 手续费
     * 
     * 所有费用汇总，包含工本费、退保费用、账户管理费等
     * 
     * 以元为单位，两位小数
     */
    private double fee;
    
    /**
     * 保单账户现金价值
     * 
     * 以元为单位，两位小数
     */
    private double policyValue;
    
    /**
     * 是否全部领取 CD4
     */
    private int isWithdrawAll;
    
    /**
     * 是否退保 CD4
     */
    private int isCancelPolicy;
    
    /**
     * 退保是否成功 CD4
     */
    private int isSuccess;
    
    /**
     * 确认告知信息或失败的信息
     */
    private String message;
    
    /**
     * 工本费 
     * 以元为单位，两位小数
     */
    private double troubleFee;
    
    /**
     * 初始扣费 
     * 以元为单位，两位小数
     */
    private double riskFee;
    
    /**
     * 退保费用
     */
    private double refundFee;
    
    /**
     * 本次结算账户管理费
     */
    private double acctManageFee;
    
    /**
     * 本次结算利息
     */
    private double interestAmount;

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

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(double policyValue) {
        this.policyValue = policyValue;
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

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getTroubleFee() {
        return troubleFee;
    }

    public void setTroubleFee(double troubleFee) {
        this.troubleFee = troubleFee;
    }

    public double getRiskFee() {
        return riskFee;
    }

    public void setRiskFee(double riskFee) {
        this.riskFee = riskFee;
    }

    public double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(double refundFee) {
        this.refundFee = refundFee;
    }

    public double getAcctManageFee() {
        return acctManageFee;
    }

    public void setAcctManageFee(double acctManageFee) {
        this.acctManageFee = acctManageFee;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }
}
