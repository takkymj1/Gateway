/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.activity;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;

/**
 * 活动类型，按照realm分类
 *
 * @author rooseek
 */
public enum ActivityType implements BaseEnum {

    /**
     * 贷款申请类活动
     */
    REQUEST_SUMBIT("提交贷款申请", Realm.LOANREQUEST),
    REQUEST_ASSIGN(LoanRequestStatus.ASSIGNED.getKey(), Realm.LOANREQUEST),
    REQUEST_ASSIGN_VISIT_TASK("分配外审任务", Realm.LOANREQUEST),
    REQUEST_VISIT_REVIEW("外勤评审", Realm.LOANREQUEST),
    REQUEST_ASSIGN_RISK_TASK("分配风控任务", Realm.LOANREQUEST),
    REQUEST_RISK_REVIEW("风控评审", Realm.LOANREQUEST),
    REQUEST_CANCELL(LoanRequestStatus.CANCELED.getKey(), Realm.LOANREQUEST),
    REQUEST_APPROVE(LoanRequestStatus.APPROVED.getKey(), Realm.LOANREQUEST),
    REQUEST_PUBLISH(LoanRequestStatus.PUBLISHED.getKey(), Realm.LOANREQUEST),
    REQUEST_REJECT(LoanRequestStatus.REJECTED.getKey(), Realm.LOANREQUEST),
    /**
     * 贷款类活动
     */
    LOAN_SPLIT("拆标", Realm.LOAN),
    LOAN_SCHEDULE(LoanStatus.SCHEDULED.getKey(), Realm.LOAN),
    LOAN_OPEN(LoanStatus.OPENED.getKey(), Realm.LOAN),
    LOAN_FAIL(LoanStatus.FAILED.getKey(), Realm.LOAN),
    LOAN_CANCEL(LoanStatus.CANCELED.getKey(), Realm.LOAN),
    LOAN_FINISH(LoanStatus.FINISHED.getKey(), Realm.LOAN),
    LOAN_SETTLE(LoanStatus.SETTLED.getKey(), Realm.LOAN),
    LOAN_REPAY("还款", Realm.LOAN),
    LOAN_CLEAR(LoanStatus.CLEARED.getKey(), Realm.LOAN),
    LOAN_OVERDUE(LoanStatus.OVERDUE.getKey(), Realm.LOAN),
    LOAN_BREACH(LoanStatus.BREACH.getKey(), Realm.LOAN);

    private final String key;

    private final Realm realm;

    private ActivityType(String key, Realm realm) {
        this.key = key;
        this.realm = realm;
    }

    @Override
    public String getKey() {
        return key;
    }

    public Realm getRealm() {
        return realm;
    }
}
