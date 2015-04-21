package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/4/10
 * Time: 12:00
 * Desc: 充值类型
 * To change this template use File | Settings | File Templates.
 */
public enum RechargeType implements BaseEnum{

    ENTERPRISE("企业"),
    PERSONAL("个人");

    private final String key;

    private RechargeType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
