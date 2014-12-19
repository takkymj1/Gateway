/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 取现渠道
 *
 * @author rooseek
 */
public enum CashChl implements BaseEnum {

    FAST("快速取现"),
    GENERAL("一般取现"),
    IMMEDIATE("即时取现");

    private final String key;

    private CashChl(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
