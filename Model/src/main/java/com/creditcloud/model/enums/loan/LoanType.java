/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 标的类型,分普通还是收益权转让
 *
 * @author admin
 */
public enum LoanType implements BaseEnum {

    //默认普通标
    NORMAL("无"),
    BENEFITEASSIGN("收益权转让"),
    EXCHANGETRADEDPRODUCT("交易所产品");

    private final String key;

    private LoanType(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
