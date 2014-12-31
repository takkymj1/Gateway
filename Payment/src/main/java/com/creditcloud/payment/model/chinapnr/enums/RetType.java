/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum RetType implements BaseEnum {

    EqualInstallment("01", "等额本息"),
    EqualPrincipal("02", "等额本金"),
    MonthlyInterest("03", "按期付息,到期还本"),
    BulletRepayment("04", "一次性还款"),
    OTHER("99", "其他");

    private final String code;

    private final String key;

    private RetType(String code, String key) {
        this.code = code;
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getCode() {
        return code;
    }
}
