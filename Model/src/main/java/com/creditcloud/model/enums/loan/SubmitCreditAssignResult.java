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
    INVEST_REPAYMENT_NOT_FOUND("原始投标回款计划找不到"),
    LOAN_NOT_FOUND("原始标的找不到"),
    SUCCESSFUL("成功"),
    EXCEED_DISCOUNT_LIMIT("超过债权转让折让率允许范围"),
    REPEATED_ASSIGN_REQUEST("债权转让已存在,不能重复转让"),
    INSUFFICIENT("没有本金可转让"),
    ILLEGAL_ASSIGN_TIME_ONE("起息一个月(含)的项目债权不能转让"),
    ILLEGAL_ASSIGN_TIME_TWO("距离到期日的剩余期限在15天以内的不可申请转让"),
    ILLEGAL_ASSIGN_TIME_THREE("还款日和还款日前一天不可以进行债权转让"),
    ILLEGAL_ASSIGN_TIME_FOUR("当前时间不可以申请转让"),
    ILLEGAL_ASSIGN_TIME_FIVE("周末及公共节假日不可以转"),
    ILLEGAL_ASSIGN_TIME_SIX("还款日遇到节假日,下一个工作日也不可以转让"),
    ILLEGAL_REASSIGN_TIME("二次转让：持有不到一个月(含)的项目债权不能转让"),
    ILLEGAL_INVEST("投标状态不可转让"),
    ILLEGAL_INVEST_USER("只能转让自己的投标"),
    ILLEGAL_REPAYMENT("投标有逾期违约还款"),
    ILLEGAL_MOBILE_CAPTCHA("手机验证码错误"),
    ILLEGAL_BUY_TIME("当前时间不可以再申请购买"),
    NEED_CREDIT_ASSIGN_AGREEMENT("需要同意债权转让协议");

    private final String key;

    private SubmitCreditAssignResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
