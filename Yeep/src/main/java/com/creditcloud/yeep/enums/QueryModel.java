/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 单笔业务查询模式
 *
 * @author rooseek
 */
public enum QueryModel implements BaseEnum {

    PAYMENT_RECORD("投标记录"),
    REPAYMENT_RECORD("还款记录"),
    CP_TRANSACTION("通用转账记录"),
    RECHARGE_RECORD("充值记录"),
    WITHDRAW_RECORD("提现记录");

    private final String key;

    private QueryModel(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
