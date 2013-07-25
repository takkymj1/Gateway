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
public enum LoanRequestMethod implements BaseEnum {

    //按月付息到期还本	MonthlyInterest
    //等额本息			EqualInstallment
    //等额本金			EqualPrincipal	（这个可能不需要）
    //一次性还本付息		BulletRepayment
    MonthlyInterest("按月付息到期还本"),
    EqualInstallment("等额本息"),
    BulletRepayment("一次性还本付息");

    private final String key;

    private LoanRequestMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, LoanRequestMethod> key2Enum = new HashMap<String, LoanRequestMethod>();

    static {
        for (LoanRequestMethod method : LoanRequestMethod.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static LoanRequestMethod getEnum(String key) {
        return key2Enum.get(key);
    }
}
