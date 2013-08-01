/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CreditRank implements BaseEnum {

    AA("160及以上"),
    A("159-145 "),
    B("144-130 "),
    C("129-120 "),
    D("119-110"),
    E("109-100 "),
    HR("99-0 ");

    private final String key;

    private CreditRank(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
