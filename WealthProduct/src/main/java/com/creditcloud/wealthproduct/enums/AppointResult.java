/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum AppointResult implements BaseEnum {

    SUCCESSFUL("预约成功"),
    EXCEED_TIMES_LIMIT("预约次数超过上限"),
    NO_BALANCE("预约已满"),
    FAIL("预约失败");

    private final String key;

    private AppointResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
