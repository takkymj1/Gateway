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
    INVEST_NOT_FOUND("原始投标找不到"),
    SUCCESSFUL("成功"),
    EXCEED_DISCOUNT_LIMIT("超过债权转让折让率允许范围"),
    REPEATED_ASSIGN_REQUEST("债权转让已存在,不能重复转让"),
    INSUFFICIENT("没有本金可转让"),
    ILLEGAL_INVEST("投标状态不可转让"),
    ILLEGAL_REPAYMENT("投标有逾期违约还款");

    private final String key;

    private SubmitCreditAssignResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
