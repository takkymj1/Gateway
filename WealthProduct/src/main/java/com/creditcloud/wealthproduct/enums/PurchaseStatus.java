/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum PurchaseStatus implements BaseEnum {

    INITIALIZED("初始"),
    APPOINTED("已预约"),
    PAYED("已支付"),
    SETTLED("已锁定"),
    DUE("已到期"),
    REDEEMED("已赎回");

    private final String key;

    private PurchaseStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
