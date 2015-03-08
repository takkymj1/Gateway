/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.request;

import com.creditcloud.insurance.model.enci.BaseDTO;
import javax.validation.constraints.NotNull;

/**
 * 承保 100002
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class PolicyApplyRequest extends BaseDTO {

    /**
     * 合作商订单号
     */
    @NotNull
    private String partnerOrderId;
    
    /**
     * 支付交易编号
     */
    private String payTransNo;
    
    /**
     * 第三方支付对账用单号
     */
    private String checkPayNo;
    
    /**
     * 支付时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    @NotNull
    private String payTime;
    
    /**
     * 支付金额
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double payAmount;
    
    /**
     * 账务日期
     * 
     * yyyy-MM-dd
     */
    @NotNull
    private String accountDate;
    
    /**
     * 付款人账号 如：支付宝账号
     */
    private String payerAccount;
    
    /**
     * 付款人ID 如：支付宝ID
     */
    private String payerId;
    
    /**
     * 支付平台 CD21
     */
    private String payPlatform;
    
    /**
     * 银行编号 CD3
     */
    private String bankCode;
    
    /**
     * 开户行名称
     */
    private String bankName;
    
    /**
     * 银行卡号
     */
    private String bankCardNo;
    
    /**
     * 持卡人姓名
     */
    private String holderName;
    
    /**
     * 续期付款方式 CD2
     */
    private String partPayMode;
    
    /**
     * 续期付款银行编号 CD3
     */
    private String partPayBankCode;
    
    /**
     * 续期付款银行账号
     */
    private String partPayAcctNo;
    
    /**
     * 续期付款账户名
     */
    private String partPayAcctName;
    
    /**
     * 投保单号
     */
    @NotNull
    private String proposalNo;
    
    /**
     * 总保费
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double totalPremium;
    
    /**
     * 邮递费
     * 
     * 以元为单位，两位小数
     */
    private double postFee;

    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public String getPayTransNo() {
        return payTransNo;
    }

    public void setPayTransNo(String payTransNo) {
        this.payTransNo = payTransNo;
    }

    public String getCheckPayNo() {
        return checkPayNo;
    }

    public void setCheckPayNo(String checkPayNo) {
        this.checkPayNo = checkPayNo;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(String payPlatform) {
        this.payPlatform = payPlatform;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getPartPayMode() {
        return partPayMode;
    }

    public void setPartPayMode(String partPayMode) {
        this.partPayMode = partPayMode;
    }

    public String getPartPayBankCode() {
        return partPayBankCode;
    }

    public void setPartPayBankCode(String partPayBankCode) {
        this.partPayBankCode = partPayBankCode;
    }

    public String getPartPayAcctNo() {
        return partPayAcctNo;
    }

    public void setPartPayAcctNo(String partPayAcctNo) {
        this.partPayAcctNo = partPayAcctNo;
    }

    public String getPartPayAcctName() {
        return partPayAcctName;
    }

    public void setPartPayAcctName(String partPayAcctName) {
        this.partPayAcctName = partPayAcctName;
    }

    public String getProposalNo() {
        return proposalNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }

    public double getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(double totalPremium) {
        this.totalPremium = totalPremium;
    }

    public double getPostFee() {
        return postFee;
    }

    public void setPostFee(double postFee) {
        this.postFee = postFee;
    }
    
}
