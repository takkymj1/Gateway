/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FundRecordType implements BaseEnum {

    INVEST("投标"),
    WITHDRAW("取现"),
    DEPOSIT("充值"),
    LOAN("放款"),
    LOAN_REPAY("贷款还款"),
    INVEST_REPAY("投资还款"),
    CREDIT_ASSIGN("债权转让"),
    TRANSFER("转账扣款"),//商户用
    /**
     * 奖励
     */
    REWARD_REGISTER("注册奖励"),
    REWARD_INVEST("投标奖励"),
    REWARD_DEPOSIT("充值奖励"),
    /**
     * 服务管理手续费
     */
    FEE_WITHDRAW("提现手续费"),
    FEE_AUTHENTICATE("身份验证手续费"),
    FEE_INVEST_INTEREST("回款利息管理费"),
    FEE_LOAN_SERVICE("借款服务费"),
    FEE_LOAN_INTEREST("还款利息管理费"),
    FEE_LOAN_VISIT("实地考察费"),
    FEE_LOAN_GUARANTEE("担保费"),
    FEE_LOAN_PENALTY("逾期罚息"),
    FEE_DEPOSIT("充值手续费");

    private final String key;

    private FundRecordType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
