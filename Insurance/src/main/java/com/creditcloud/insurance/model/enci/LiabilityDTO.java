/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class LiabilityDTO extends BaseObject {

    /**
     * 责任代码 CD7
     */
    private String code;
    
    /**
     * 投保份数
     */
    private int applyNum;
    
    /**
     * 保额
     */
    private double amount;
    
    /**
     * 保费
     */
    private double premium;
    
    /**
     * 折扣比率
     */
    private double discountRate;
    
    /**
     * 折扣保费
     */
    private double discountPremium;
    
    /**
     * 赔付比例
     */
    private double paymentRate;
    
    /**
     * 免赔额
     */
    private double deductible;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(int applyNum) {
        this.applyNum = applyNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountPremium() {
        return discountPremium;
    }

    public void setDiscountPremium(double discountPremium) {
        this.discountPremium = discountPremium;
    }

    public double getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(double paymentRate) {
        this.paymentRate = paymentRate;
    }

    public double getDeductible() {
        return deductible;
    }

    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }

    
}
