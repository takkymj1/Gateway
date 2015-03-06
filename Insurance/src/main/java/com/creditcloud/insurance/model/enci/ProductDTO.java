/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;

/**
 * 险种信息
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class ProductDTO extends BaseObject {

    /**
     * 险种SKU代码
     */
    private String productSkuCode;
    
    /**
     * 合作商产品ID
     */
    @NotNull
    private String partnerProductId;
    
    /**
     * 险种代码
     */
    @NotNull
    private String productCode;
    
    /**
     * 险种名称
     */
    private String productName;
    
    /**
     * 每份的保额
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double amount;
    
    /**
     * 每份的保费
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double premium;
    
    /**
     * 折扣比率
     * 
     * 取值范围0到1
     * 不打折扣时填1
     */
    @NotNull
    private double discountRate;
    
    /**
     * 折扣保费/实际保费
     * 
     * =保费×折扣率
     * 以元为单位，两位小数
     */
    @NotNull
    private double discountPremium;
    
    /**
     * 投保份数
     */
    @NotNull
    private int applyNum;
    
    /**
     * 交费期限
     * 
     * 交费期限单位为趸交时不填
     */
    @NotNull
    private int payPeriod;
    
    /**
     * 交费期限单位 CD6
     */
    @NotNull
    private String payPeriodUnit;
    
    /**
     * 交费方式 CD19
     */
    private String payMode;
    
    /**
     * 出境事由 
     */
    private String abroadReason;
    
    /**
     * 出境国家列表
     * 
     * 数组每个元素长度char30
     */
    private String[] abroadNationList;
    
    /**
     * 险种责任列表
     */
    private LiabilityDTO[] liabilityDTOList;
    
    /**
     * 附加险列表
     */
    private ProductDTO[] extraneousProductDTOList;

    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPartnerProductId() {
        return this.partnerProductId;
    }

    public void setPartnerProductId(String partnerProductId) {
        this.partnerProductId = partnerProductId;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDiscountPremium() {
        return this.discountPremium;
    }

    public void setDiscountPremium(Double discountPremium) {
        this.discountPremium = discountPremium;
    }

    public Double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Double getPremium() {
        return this.premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Integer getApplyNum() {
        return this.applyNum;
    }

    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    public Integer getPayPeriod() {
        return this.payPeriod;
    }

    public void setPayPeriod(Integer payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getPayPeriodUnit() {
        return this.payPeriodUnit;
    }

    public void setPayPeriodUnit(String payPeriodUnit) {
        this.payPeriodUnit = payPeriodUnit;
    }

    public String getPayMode() {
        return this.payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getAbroadReason() {
        return this.abroadReason;
    }

    public void setAbroadReason(String abroadReason) {
        this.abroadReason = abroadReason;
    }

    public String[] getAbroadNationList() {
        return this.abroadNationList;
    }

    public void setAbroadNationList(String[] abroadNationList) {
        this.abroadNationList = abroadNationList;
    }

    public LiabilityDTO[] getLiabilityDTOList() {
        return this.liabilityDTOList;
    }

    public void setLiabilityDTOList(LiabilityDTO[] liabilityDTOList) {
        this.liabilityDTOList = liabilityDTOList;
    }

    public ProductDTO[] getExtraneousProductDTOList() {
        return this.extraneousProductDTOList;
    }

    public void setExtraneousProductDTOList(ProductDTO[] extraneousProductDTOList) {
        this.extraneousProductDTOList = extraneousProductDTOList;
    }
}
