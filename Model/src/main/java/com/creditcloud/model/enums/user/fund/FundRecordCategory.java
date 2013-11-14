/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 资金记录类型<p>
 * TODO 讲FundRecordType换成此类
 *
 * @author rooseek
 *
 */
public enum FundRecordCategory implements BaseEnum {

    INVEST("投标"),
    WITHDRAW("取现"),
    DEPOSIT("充值"),
    LOAN("放款"),
    REPAYMENT("还款"),
    REWARD("奖励"),
    CREDIT_ASSIGNMENT("债券转让"),
    TRANSFER("转账扣款"),//商户用
    /**
     * 处罚费用
     */
    PENALTY_OVERDUE("逾期罚息"),
    /**
     * 服务管理手续费
     */
    FEE_WITHDRAW("提现手续费"),
    FEE_INTEREST("利息管理费"),
    FEE_AUTHENTICATE("身份验证手续费"),
    FEE_LOAN("借款服务费"),
    FEE_VISIT("实地考察费"),
    FEE_WARRANTY("担保费");

    private final String key;

    private FundRecordCategory(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
