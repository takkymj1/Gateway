/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author caojiadong
 */
public enum CouponType implements BaseEnum {
    
    REGISTER_COUPON("新人红包");
    
    private final String key;

    private CouponType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
