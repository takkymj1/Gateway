package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/3/23
 * Time: 15:29
 * Desc: 活动状态
 * To change this template use File | Settings | File Templates.
 */
public enum EventStatus implements BaseEnum {
    VALID("有效"),
    PAUSE("暂停"),
    FAILURE("无效");

    private final String key;

    private EventStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
