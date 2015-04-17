/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 将在用户账户主页上显示的用户投资借款类事件种类
 *
 * @author rooseek
 */
public enum InvestEventType implements BaseEnum {

    INVEST("投资"),
    INVEST_REPAY("投资回款"),
    LOAN("融资"),
    LOAN_REPAY("融资还款"),
    DEPOSIT("充值"),
    WITHDRAW("提现"),
    //2015.01.09 兼容众筹投资类型，后续最好为众筹单独建立一套投资事件对象
    FUNDINGINVEST("众筹投资"),
    CREDITASSIGN("债权转让"),
    CREDITASSIGNINVEST("债权转让投资"),
    REWARD_COUPON_NEW_REGISTER("注册红包"),
    COUPON_REBATE("红包返现");

    private final String key;

    private InvestEventType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
