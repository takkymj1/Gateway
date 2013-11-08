/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.enums.Realm;

/**
 * 员工活动类型
 *
 * @author rooseek
 */
public enum ActivityType implements BaseEnum {

    LOANREQUEST_ASSIGN_MANAGER("分配主管经理", Realm.LOAN_REQUEST),
    LOANREQUEST_ASSIGN_VISIT_TASK("分配外审任务", Realm.LOAN_REQUEST),
    LOANREQUEST_REVIEW_VISIT("实地征信/回访/催款", Realm.LOAN_REQUEST),
    LOANREQUEST_ASSIGN_RISK_TASK("分配风控任务",Realm.LOAN_REQUEST),
    LOANREQUEST_REVIEW_RISK("风控评审", Realm.LOAN_REQUEST),
    LOANREQUEST_CANCELL("取消贷款申请", Realm.LOAN_REQUEST),
    LOANREQUEST_APPROVE("批准贷款申请", Realm.LOAN_REQUEST),
    LOANREQUEST_PUBLISH("发放贷款",Realm.LOAN_REQUEST),
    LOANREQUEST_REJECT("驳回贷款申请", Realm.LOAN_REQUEST);

    private final String key;

    /**
     * 活动关联的实体域
     */
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