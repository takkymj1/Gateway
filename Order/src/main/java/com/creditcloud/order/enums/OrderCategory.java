/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.order.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum OrderCategory implements BaseEnum {

    Register("注册开户"),
    Withdraw("提现"),
    Deposit("充值"),
    Transfer("转账"),
    Tender("投标");

    private final String key;

    private OrderCategory(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
