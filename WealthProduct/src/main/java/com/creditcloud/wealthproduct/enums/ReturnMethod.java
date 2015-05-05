/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 收益返还方式
 * 
 * @author rooseek
 */
public enum ReturnMethod implements BaseEnum {

    RE("收益复投"),
    BACK("收益返还");

    private final String key;

    private ReturnMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
