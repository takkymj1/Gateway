/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 还款资金类型
 *
 * @author rooseek
 */
public enum RepayType implements BaseEnum {

    /**
     * 只还本金
     */
    Principal("本金"),
    /**
     * 本息都还
     */
    PrincipalAndInterest("本息");

    private final String key;

    private RepayType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
