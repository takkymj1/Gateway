/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CreditRank implements BaseEnum {

    HR("99-0"),
    E("109-100"),
    D("119-110"),
    C("129-120"),
    B("144-130"),
    A("159-145"),
    AA("160及以上");

    private final String key;

    private CreditRank(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * lowest credit rank
     *
     * @return
     */
    public static CreditRank lowest() {
        return HR;
    }

    /**
     * highest credit rank
     *
     * @return
     */
    public static CreditRank highest() {
        return AA;
    }
}
