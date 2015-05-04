/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.activity;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;

/**
 * 活动类型，按照realm分类
 *
 * @author rooseek
 */
public enum ActivityType implements BaseEnum {

    /**
     * 用户类活动
     */
    USER_ENABLE("开启用户", Realm.USER),
    USER_DISABLE("关闭用户", Realm.USER),
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
    REQUEST_ARCHIVE(LoanRequestStatus.ARCHIVED.getKey(), Realm.LOANREQUEST),
    /**
     * 贷款类活动
     */
    LOAN_SPLIT("拆标", Realm.LOAN),
    LOAN_SCHEDULE(LoanStatus.SCHEDULED.getKey(), Realm.LOAN),
    LOAN_RESCHEDULE("重新安排", Realm.LOAN),
    LOAN_OPEN(LoanStatus.OPENED.getKey(), Realm.LOAN),
    LOAN_FAIL(LoanStatus.FAILED.getKey(), Realm.LOAN),
    LOAN_CANCEL(LoanStatus.CANCELED.getKey(), Realm.LOAN),
    LOAN_FINISH(LoanStatus.FINISHED.getKey(), Realm.LOAN),
    LOAN_SETTLE(LoanStatus.SETTLED.getKey(), Realm.LOAN),
    LOAN_REPAY("还款", Realm.LOAN),
    LOAN_DISBURSE("垫付", Realm.LOAN),
    LOAN_CLEAR(LoanStatus.CLEARED.getKey(), Realm.LOAN),
    LOAN_OVERDUE(LoanStatus.OVERDUE.getKey(), Realm.LOAN),
    LOAN_BREACH(LoanStatus.BREACH.getKey(), Realm.LOAN),
    LOAN_REWARD("奖励", Realm.LOAN),
    LOAN_ARCHIVE(LoanStatus.ARCHIVED.getKey(), Realm.LOAN),
    /**
     * 合同类活动
     */
    CONTRACT_REGENERATE("重新生成合同", Realm.CONTRACT),
    /**
     * 投标类活动
     */
    INVEST_CANCEL(InvestStatus.CANCELED.getKey(), Realm.INVEST),
    /**
     * 工单类活动
     */
    TICKET_REVIEW("审核工单", Realm.TICKET),
    /**
     * 资金类活动
     */
    FUND_TRANSER_DIRECT("直接转账", Realm.FUND),
    CASH_RECON_RECORD("现金对账记录", Realm.FUND),
    CASH_RECON_APPROVE("现金对账审批", Realm.FUND),
    /**
     * 众筹类
     */
    FUNDING_PROJECT_OPEN("众筹开放",Realm.FUNDINGPROJECT),
    FUNDING_PROJECT_LOAN("众筹放款",Realm.PROJECTLOAN);

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
