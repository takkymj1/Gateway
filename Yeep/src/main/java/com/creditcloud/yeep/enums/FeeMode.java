/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 费率模式
 *
 * @author rooseek
 */
public enum FeeMode implements BaseEnum {

    PLATFORM("收取商户手续费"),
    USER("收取用户手续费");

    private final String key;

    private FeeMode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
