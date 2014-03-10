/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 投标奖励返还方式
 *
 * @author rooseek
 */
public enum LoanRewardMethod implements BaseEnum {

    BID("投标后返还"),
    SETTLE("结算后返还"),
    REPAY("还清后返还");

    private final String key;

    private LoanRewardMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
