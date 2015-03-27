/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 交易码
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TransCode implements BaseEnum {

    /**
     * 核保
     */
    ProposalApply("100001", "/insurance/proposal/apply.rest"),
    
    /**
     * 承保
     */
    PolicyApply("100003", "/insurance/policy/apply.rest"),
    
    /**
     * 保单价值查询
     */
    PolicyValueQuery("100005", "/insurance/policy/valueQuery.rest"),
    
    /**
     * 退保核算
     */
    PolicyRefundCalc("100006", "/insurance/policy/refundCalc.rest"),
    
    /**
     * 退保
     */
    PolicyRefundApply("100007", "/insurance/policy/refundApply.rest"),
    
    /**
     * 保单确认通知
     */
    PolicyConfirmNotify("100009", "/insurance/policy/confirmNotify.rest"),
    
    /**
     * 保单详细查询
     */
    PolicyDetailQuery("100012", "/insurance/policy/detailQuery.rest"),
    
    /**
     * 保费追加
     */
    PolicyAppendPremium("100013", "/insurance/policy/appendPremium.rest"),
    
    /**
     * 保险产品收益查询
     */
    ProductProfitQuery("100017", "/insurance/product/profitQuery.rest"),
    
    /**
     * 保单收益查询
     */
    PolicyProfitQuery("100018", "/insurance/policy/profitQuery.rest");
    
    /**
     * 交易码
     */
    private final String key;
    
    /**
     * 接口
     */
    private final String api;
    
    private TransCode(String key, String api) {
        this.key = key;
        this.api = api;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getApi() {
        return api;
    }
    
}
