/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 股票配资方式
 *
 * @author zhaobs
 */
public enum StockfinanceType implements BaseEnum {

    DAY("按日配资"),
    MONTH("按月配资");

    private final String key;

    private StockfinanceType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
