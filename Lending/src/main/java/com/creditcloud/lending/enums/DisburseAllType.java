/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 平台垫付所有还款，或称债权接管类型
 *
 * @author rooseek
 */
public enum DisburseAllType implements BaseEnum {

    AllPrincipalAndCurrentInterest("剩余全额本金及当期利息"),
    AllPrincipal("剩余全额本金"),
    AllPrincipalAndAllInterest("剩余全额本息"),
    CurrentPrincipalAndCurrentInterest("当期本息"),
    CurrentPrincipal("当期本金");

    private final String key;

    private DisburseAllType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
