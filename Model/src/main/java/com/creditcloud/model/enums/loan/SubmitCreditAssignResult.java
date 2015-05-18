/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 根据Invest创建债权转让结果
 * 
* @author rooseek
 */
public enum SubmitCreditAssignResult implements BaseEnum {

    CREDIT_ASSIGN_DISABLED("没有开启债权转让功能"),
    REASSIGN_DISABLED("二次转让功能关闭"),
    INVEST_NOT_FOUND("原始投标找不到"),
    SUCCESSFUL("成功"),
    REPEATED_ASSIGN_REQUEST("债权转让已存在,不能重复转让"),
    INSUFFICIENT("没有本金可转让"),
    ILLEGAL_INVEST("投标状态不可转让"),
    ILLEGAL_INVEST_USER("只能转让自己的投标"),
    ILLEGAL_REPAYMENT("投标有逾期违约还款"),
    ILLEGAL_DATE("不在可转让时间范围"),
    NEXT_REPAY_DATE_LIMIT("下次回款到期日前一定天数内不允许转让"),
    INVEST_DATE_LIMIT("投资持有一定天数后才允许转让"),
    DAILY_LIMIT("超过每日债权转让次数上限"),
    DISCOUNT_LIMIT("超过债权转让折让率允许范围"),
    ASSIGN_AMOUNT_LIMIT("低于最低转让金额限制");

    private final String key;

    private SubmitCreditAssignResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
