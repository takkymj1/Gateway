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
public enum CouponStatus implements BaseEnum {

    ALL("所有"),
    INACTIVE("未使用"),
    WORKING("兑取中"),
    ACTIVATED("已使用"),
    EXPIRED("已过期");
    
    private final String key;

    private CouponStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
