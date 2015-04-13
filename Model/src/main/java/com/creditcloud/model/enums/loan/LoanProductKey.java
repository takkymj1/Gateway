/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 系统预定义的产品类型key
 *
 * @author rooseek
 */
public enum LoanProductKey implements BaseEnum {

    NEWBEE("新手标"),
    /**
     * 股票配资(融资)业务
     */
    STOCK_FINANCE("股票配资"),
    STOCK_ROLLOVER("股票配资展期"),
    STOCK_COVER("股票配资补仓"),;

    private final String key;

    @Override
    public String getKey() {
        return key;
    }

    private LoanProductKey(final String key) {
        this.key = key;
    }
}
