/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;

/**
 * 承保
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class PolicyApplyResponse extends BaseDTO {

    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 保单号
     */
    private String policyNo;
    
    /**
     * 投保单号
     */
    private String proposalNo;
    
    /**
     * 电子保单URL
     */
    private String policyUrl;
    
    /**
     * 总保费
     * 
     * 以元为单位，两位小数
     */
    private double totalPremium;
    
    /**
     * 账务日期 yyyy-MM-dd
     */
    private String accountDate;
    
    /**
     * 出单时间 yyyy-MM-dd HH:mm:ss
     */
    private String issuedTime;
    
    /**
     * 出单是否成功 CD4
     */
    private String isSuccess;
    
    /**
     * 出单结果说明
     * 
     * 失败原因
     */
    private String message;

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

    public String getProposalNo() {
        return proposalNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public void setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
    }

    public double getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(double totalPremium) {
        this.totalPremium = totalPremium;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(String issuedTime) {
        this.issuedTime = issuedTime;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
