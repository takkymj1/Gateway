/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FundRecordType implements BaseEnum {

    INITIATE("初始"),
    RECHARGE("充值"),
    WITHDRAW("提现"),
    INVEST_FROZEN("投标成功，资金冻结"),
    INVEST_SETTLED("投资成功,资金已结算"),
    INVEST_FAILED("流标,投资金额返还现金账户"),
    INVEST_REPAY("投资回款"),
    LOAN_SETTLED("借款成功，资金已结算"),
    LOAN_REPAY("还款"),
    FROZEN("冻结资金"),
    RELEASE("解冻资金"),
    DISBURSE("垫付,用于逾期或违约后垫付的状态"),
    /**
     * TODO 用下面的type替换上面的type
     */
    SAVE("充值"),
    CASH("取现"),
    FREEZE("冻结"),
    UNFREEZE("解冻"),
    INVEST("投标"),
    LOAN("放款"),
    REPAY("还款"),
    TRANSFER("转账")//主要是商户调用
    ;

    private final String key;

    private FundRecordType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
