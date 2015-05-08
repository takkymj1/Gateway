/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author zaishu.ye@fengjr.com
 */
public enum EventType implements BaseEnum {
    REGISTER("注册账户"),
    LOTTERY("抽奖"),
    INCLUSIVE("普惠计划");//即每人一份

    private final String key;

    private EventType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
