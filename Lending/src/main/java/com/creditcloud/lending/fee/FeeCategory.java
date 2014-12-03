/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.fee;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FeeCategory implements BaseEnum {

    Withdraw("提现费");

    private final String key;

    private FeeCategory(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
