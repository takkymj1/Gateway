/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

/**
 * 订单
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class OrderDTO extends BaseDTO {

    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 合作商用户ID
     */
    private String partnerUserId;
    
    /**
     * 总保费
     * 
     * 实际保费×投保份数 以元为单位，两位小数
     */
    private double totalPremium;
    
    /**
     * 邮递费
     * 
     * 以元为单位，两位小数
     */
    private double postFee;
    
    /**
     * 保险生效起始时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    private String insBeginDate;
    
    /**
     * 保险生效截止时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    private String insEndDate;
    
    /**
     * 保险期限
     */
    private Integer insPeriod;
    
    /**
     * 保险期限单位 CD1
     */
    private String insPeriodUnit;
    
    /**
     * 总投保份数
     */
    private Integer totalApplyNum;
    
    /**
     * 保单服务机构
     * 
     * CD17 + “00” 
     * 如 深圳中心支公司86740000
     */
    private String serviceOrgCode;
    
    /**
     * 保单密码 AES加密
     */
    private String policyPassword;
    
    /**
     * 首期付款方式 CD2
     */
    private String firstPayMode;
    
    /**
     * 首期付款银行编号 CD3
     */
    private String firstPayBankCode;
    
    /**
     * 首期付款银行账号
     */
    private String firstPayAcctNo;
    
    /**
     * 首期付款账户名
     */
    private String firstPayAcctName;
    
    /**
     * 续期付款方式
     */
    private String partPayMode;
    
    /**
     * 续期付款银行编号
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
     * 是否自动续保
     */
    private String isAutoRenewal;

    
    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public String getPartnerUserId() {
        return partnerUserId;
    }

    public void setPartnerUserId(String partnerUserId) {
        this.partnerUserId = partnerUserId;
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

    public String getInsBeginDate() {
        return insBeginDate;
    }

    public void setInsBeginDate(String insBeginDate) {
        this.insBeginDate = insBeginDate;
    }

    public String getInsEndDate() {
        return insEndDate;
    }

    public void setInsEndDate(String insEndDate) {
        this.insEndDate = insEndDate;
    }

    public Integer getInsPeriod() {
        return insPeriod;
    }

    public void setInsPeriod(Integer insPeriod) {
        this.insPeriod = insPeriod;
    }

    public String getInsPeriodUnit() {
        return insPeriodUnit;
    }

    public void setInsPeriodUnit(String insPeriodUnit) {
        this.insPeriodUnit = insPeriodUnit;
    }

    public Integer getTotalApplyNum() {
        return totalApplyNum;
    }

    public void setTotalApplyNum(Integer totalApplyNum) {
        this.totalApplyNum = totalApplyNum;
    }

    public String getServiceOrgCode() {
        return serviceOrgCode;
    }

    public void setServiceOrgCode(String serviceOrgCode) {
        this.serviceOrgCode = serviceOrgCode;
    }

    public String getPolicyPassword() {
        return policyPassword;
    }

    public void setPolicyPassword(String policyPassword) {
        this.policyPassword = policyPassword;
    }

    public String getFirstPayMode() {
        return firstPayMode;
    }

    public void setFirstPayMode(String firstPayMode) {
        this.firstPayMode = firstPayMode;
    }

    public String getFirstPayBankCode() {
        return firstPayBankCode;
    }

    public void setFirstPayBankCode(String firstPayBankCode) {
        this.firstPayBankCode = firstPayBankCode;
    }

    public String getFirstPayAcctNo() {
        return firstPayAcctNo;
    }

    public void setFirstPayAcctNo(String firstPayAcctNo) {
        this.firstPayAcctNo = firstPayAcctNo;
    }

    public String getFirstPayAcctName() {
        return firstPayAcctName;
    }

    public void setFirstPayAcctName(String firstPayAcctName) {
        this.firstPayAcctName = firstPayAcctName;
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

    public String getIsAutoRenewal() {
        return isAutoRenewal;
    }

    public void setIsAutoRenewal(String isAutoRenewal) {
        this.isAutoRenewal = isAutoRenewal;
    }

    
}
