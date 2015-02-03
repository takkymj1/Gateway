/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 还款期限间隔
 *
 * @author rooseek
 */
public enum RepaymentPeriod implements BaseEnum {

    Monthly("按月还款"),
    BiMonthly("按双月还款"),
    Quarterly("按季还款"),
    HalfYearly("按半年还款"),
    Yearly("按年还款");

    private final String key;

    private RepaymentPeriod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * 默认按月
     *
     * @return
     */
    public static RepaymentPeriod getDefaultPeriod() {
        return Monthly;
    }
}
