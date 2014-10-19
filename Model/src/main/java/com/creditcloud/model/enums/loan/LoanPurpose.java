/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum LoanPurpose implements BaseEnum {

    SHORTTERM("短期周转", true),
    PERSONAL("个人信贷", true), //原'个人消费'
    INVESTMENT("投资创业", true),
    CAR("车辆融资", true),
    HOUSE("房产融资", true),
    CORPORATION("企业融资", true),
    OTHER("其它借款", true),
    /**
     * FENG
     */
    FENG_CX("凤呈祥", false),
    FENG_RT("凤锐通", false);

    private final String key;

    /**
     * 是否通用
     */
    private final boolean general;

    private LoanPurpose(String key, boolean general) {
        this.key = key;
        this.general = general;
    }

    @Override
    public String getKey() {
        return key;
    }

    public boolean isGeneral() {
        return general;
    }
}
