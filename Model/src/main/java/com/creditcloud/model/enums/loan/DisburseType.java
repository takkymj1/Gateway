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

    Principal("全部剩余本金"),
    PrincipalAndInterest("全部剩余本息"),
    PrincipalAndFirstInterest("当期利息加所有剩余本金");

    private final String key;

    private DisburseType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
