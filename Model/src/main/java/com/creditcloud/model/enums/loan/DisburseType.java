/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 平台垫付资金类型
 *
 * @author rooseek
 */
public enum DisburseType implements BaseEnum {

    Principal("本金"),
    PrincipalAndInterest("本息"),
    Interest("利息");

    private final String key;

    private DisburseType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
