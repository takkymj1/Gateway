/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

import java.util.HashMap;

/**
 * 
 * @author rooseek
 */
public enum LoanRequestPurpose implements BaseEnum {

    SHORTTERM("短期周转"),
    PERSONAL("个人消费"),
    INVESTMENT("投资创业"),
    CAR("购车借款"),
    HOUSE("购房借款"),
    OTHER("其它借款");

    private final String key;

    private LoanRequestPurpose(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, LoanRequestPurpose> key2Enum = new HashMap<String, LoanRequestPurpose>();

    static {
        for (LoanRequestPurpose method : LoanRequestPurpose.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static LoanRequestPurpose getEnum(String key) {
        return key2Enum.get(key);
    }
}
