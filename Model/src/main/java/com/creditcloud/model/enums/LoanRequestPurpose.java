/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * loan request purpose
 *
 */
public enum LoanRequestPurpose {

    // 短期周转,个人消费,投资创业,购车借款,购房借款,其它借款
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

    public String getKey() {
        return key;
    }
}
