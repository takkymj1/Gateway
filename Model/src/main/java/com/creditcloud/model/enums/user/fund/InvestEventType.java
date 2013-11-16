/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 将在用户账户主页上显示的用户投资事件种类
 *
 * @author rooseek
 */
public enum InvestEventType implements BaseEnum {

    INVEST("投资"),
    INVEST_REPAY("投资回款"),
    DEPOSIT("充值"),
    WITHDRAW("提现");

    private final String key;

    private InvestEventType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
