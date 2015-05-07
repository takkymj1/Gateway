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
    DISBURSE("垫付还款"),
    INVEST_REPAY("投资还款"),
    CREDIT_ASSIGN("债权转让"),
    TRANSFER("转账扣款"),//商户用
    OFFLINE_DEPOSIT("线下充值"),//线下充值补录数据用
    /**
     * 奖励
     */
    REWARD_REGISTER("注册奖励"),
    REWARD_REFERRAL("推荐奖励"),
    REWARD_INVEST("投标奖励"),
    REWARD_DEPOSIT("充值奖励"),
    COUPON_CASH("现金券"),
    COUPON_INTEREST("加息券"),
    COUPON_PRINCIPAL("增值券"),
    COUPON_REBATE("返现券"),
    
    /**
     * 余额生息
     */
    INTEREST_BEARING_INCOME("余额生息收益"),
    /**
     * 服务管理手续费
     */
    FEE_WITHDRAW("提现手续费"),
    FEE_AUTHENTICATE("身份验证手续费"),
    FEE_INVEST_INTEREST("投资管理费"),
    FEE_LOAN_SERVICE("借款服务费"),
    FEE_LOAN_MANAGE("借款管理费"),
    FEE_LOAN_INTEREST("还款管理费"),
    FEE_LOAN_VISIT("实地考察费"),
    FEE_LOAN_GUARANTEE("担保费"),//一般对应担保类贷款
    FEE_LOAN_RISK("风险管理费"),//一般对应信用类贷款
    FEE_LOAN_OVERDUE("逾期管理费"),
    FEE_LOAN_PENALTY("逾期罚息(给商户)"),//商户收取
    FEE_LOAN_PENALTY_INVEST("逾期罚息(给投资人)"),//投资人收取
    FEE_DEPOSIT("充值手续费"),
    FEE_ADVANCE_REPAY("提前还款违约金(给商户)"),//商户收取
    FEE_ADVANCE_REPAY_INVEST("提前还款违约金(给投资人)"),//投资人收取
    FEE_CREDIT_ASSIGN("债权转让手续费"),
    FEE_BIND_CARD("用户绑卡手续费"), //联动在用户绑卡时需要从商户中扣除1分钱

    /**
     * 生利宝
     */
    FSS("生利宝"),

    /**
     * 基金
     */
    INVESTMENT_FUND("基金"),
    
    /**
     * 保险
     */
    INSURANCE_PREMIUM("保费"),
    INSURANCE_APPEND_PREMIUM("保费追加"),
    INSURANCE_REFUND("退保");
    
    private final String key;

    private FundRecordType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
