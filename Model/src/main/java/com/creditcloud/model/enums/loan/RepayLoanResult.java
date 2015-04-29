package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 还款结果
 *
 * @author rooseek
 */
public enum RepayLoanResult implements BaseEnum {

    SUCCESS("成功"),
    FAIL("失败"),
    ILLEGAL_AMOUNT("还款金额不能是负值"),
    INSUFFICIENT("余额不足"),
    GUARANTEE_NOT_FOUND("找不到担保账户"),
    LOAN_NOT_FOUND("找不到标的"),
    GUARANTEE_ACCOUNT_EXCEPTION("担保支付账户异常"),
    GUARANTEE_ACCOUNT_NOTEXIST("担保支付账户不存在"),
    DUEDATE_FORBIDDEN_PRE_REPAY("还款日禁止提前还款"),
    OVERDUE_FORBIDDEN_PRE_REPAY("逾期禁止提前还款"),
    HOLIDAY_FORBIDDEN_PRE_REPAY("节假日禁止提前还款"),
    NEXT_WORKING_DATE_FORBIDDEN_PRE_REAPY("还款日是节假日，下一个工作日禁止提前还款"),
    FORBIDDEN_PRE_REPAY("禁止提前还款"),
    ILLEGAL_PARAM("参数非法");

    private final String key;

    RepayLoanResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
