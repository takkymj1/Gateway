/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 
 * @author sobranie
 */
public enum CouponType implements BaseEnum {
    
    /**
     * 可以直接兑换成可用余额的奖券.
     * 
     */
    CASH("现金券"),
    /**
     * 投资固定收益产品时额外增加收益的奖券.
     */
    INTEREST("加息券");
    
    private final String key;
    
    private CouponType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
