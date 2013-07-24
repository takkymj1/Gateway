/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * LoanRequest status
 *
 */
public enum LoanRequestStatus {

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

    public String getKey() {
        return key;
    }
}
