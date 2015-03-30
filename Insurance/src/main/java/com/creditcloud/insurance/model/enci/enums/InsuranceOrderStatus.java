/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 保险订单状态
 * @author chai
 */
public enum InsuranceOrderStatus implements BaseEnum{
    
    /**
     * 新建后的初始化状态
     */
    INIT("初始化"),
    /**
     * 待支付
     */
    WAIT_PAYING("待支付"),
    /**
     * 支付失败
     */
    PAY_FAILED("支付失败"),
    /**
     * 支付成功
     */
    PAY_SUCCESS("支付成功"),
    /**
     * 已承保
     */
    POLICY("已承保"),
    /**
     * 已退保
     */
    REFUND("已退保"),;
    
    private final String key;

    private InsuranceOrderStatus(String key){
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
