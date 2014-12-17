/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author kdliu
 */
public enum ParticAccountType implements BaseEnum {

    PERSONAL("01", "个人用户"),
    CORPORATE("02", "企业用户");

    private final String code;

    private final String key;

    ParticAccountType(final String code, final String key) {
        this.code = code;
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getKey() {
        return key;
    }
}
