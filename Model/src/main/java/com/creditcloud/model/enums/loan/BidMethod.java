/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 投标方式
 *
 * @author rooseek
 */
public enum BidMethod implements BaseEnum {

    AUTO("自动投标"),
    MANUAL("手动投标"),
    WEALTH_PRODUCT("理财产品");

    private final String key;

    private BidMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
