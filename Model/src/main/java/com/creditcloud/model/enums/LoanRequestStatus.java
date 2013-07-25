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
public enum LoanRequestStatus implements BaseEnum {

    UNASSIGNED("未处理"),
    ASSIGNED("已处理"),
    APPROVED("已批准"),
    PUBLISHED("已发放"),
    ARCHIVED("已存档"),
    DELETED("已刪除");

    private final String key;

    private LoanRequestStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, LoanRequestStatus> key2Enum = new HashMap<String, LoanRequestStatus>();

    static {
        for (LoanRequestStatus method : LoanRequestStatus.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static LoanRequestStatus getEnum(String key) {
        return key2Enum.get(key);
    }
}
