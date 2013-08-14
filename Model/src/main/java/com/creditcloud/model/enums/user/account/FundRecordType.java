/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.account;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FundRecordType implements BaseEnum {

    ALL("所有"),
    RECHARGE("充值"),
    WITHDRAW("提现"),
    INVEST("投资结算"),
    LOAN("借款结算"),
    INVEST_REPAY("投资回款"),
    LOAN_REPAY("还款");

    private final String key;

    private FundRecordType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
