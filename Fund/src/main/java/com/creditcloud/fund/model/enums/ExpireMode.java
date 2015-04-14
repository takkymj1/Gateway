/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 过期方式
 * 根据过期方式不同计算过期时间
 * @author zaishu.ye@fengjr.com
 */
public enum ExpireMode implements BaseEnum {
    DAYS_AFTER("X天后"),
    FIXED_DATE("固定日期");
    
    private final String key;

    private ExpireMode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
