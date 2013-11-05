/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * life cycle activities for loan request and its loans
 *
 * @author rooseek
 */
public enum RequestActivityType implements BaseEnum {

    /**
     * 贷款申请类活动
     */
    REQUEST_SUMBIT("提交贷款申请"),
    REQUEST_ASSIGN(LoanRequestStatus.ASSIGNED.getKey()),
    REQUEST_ASSIGN_VISIT_TASK("分配外审任务"),
    REQUEST_VISIT_REVIEW("外勤评审"),
    REQUEST_ASSIGN_RISK_TASK("分配风控任务"),
    REQUEST_RISK_REVIEW("风控评审"),
    REQUEST_CANCELL(LoanRequestStatus.CANCELED.getKey()),
    REQUEST_APPROVE(LoanRequestStatus.APPROVED.getKey()),
    REQUEST_PUBLISH(LoanRequestStatus.PUBLISHED.getKey()),
    REQUEST_REJECT(LoanRequestStatus.REJECTED.getKey()),
    /**
     * 贷款类活动
     */
    LOAN_SPLIT("拆标"),
    LOAN_SCHEDULE(LoanStatus.SCHEDULED.getKey()),
    LOAN_OPEN(LoanStatus.OPENED.getKey()),
    LOAN_FAIL(LoanStatus.FAILED.getKey()),
    LOAN_CANCEL(LoanStatus.CANCELED.getKey()),
    LOAN_FINISH(LoanStatus.FINISHED.getKey()),
    LOAN_SETTLE(LoanStatus.SETTLED.getKey()),
    LOAN_CLEAR(LoanStatus.CLEARED.getKey()),
    LOAN_OVERDUE(LoanStatus.OVERDUE.getKey()),
    LOAN_BREACH(LoanStatus.BREACH.getKey());

    private final String key;

    private RequestActivityType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
