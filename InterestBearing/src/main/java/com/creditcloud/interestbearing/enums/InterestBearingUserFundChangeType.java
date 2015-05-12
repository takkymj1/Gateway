/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author guohuazhang
 */
public enum InterestBearingUserFundChangeType implements BaseEnum {

    // 其实用户余额生息金额没有变化，只是刚刚签约后需要读取一下用户余额生息金额
    USER_ONBOARD("用户签约余额生息:读取初始值"),
    // 以下分别代表会导致用于余额生息金额会发生变化的事件
    CALIBRATE("平台矫正:可用余额增减,冻结金额增减"),
    CHARGE("收取费用:可用余额减少"),
    DEPOSIT("用户充值:可用余额增加"),
    DISBURSE_INVEST("平台垫付:可用余额增加"),
    INCOME_FEE("费用收入:可用余额增加"),
    REPAY_INVEST("投资还款:可用余额增加"),
    TRANSFER("平台转账:可用余额增减"),
    WITHDRAW("用户提现:可用余额减少"),
    SETTLE_INVEST("投资结标:冻结金额减少");

    private final String key;

    private InterestBearingUserFundChangeType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
