/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum RequestActivityType implements BaseEnum {

    SUMBIT("提交贷款申请"),
    ASSIGN_MANAGER("分配主管经理"),
    ASSIGN_VISIT_TASK("分配外审任务"),
    VISIT_REVIEW("外勤评审"),
    ASSIGN_RISK_TASK("分配风控任务"),
    RISK_REVIEW("风控评审"),
    CANCELL("取消贷款申请"),
    APPROVE("批准贷款申请"),
    PUBLISH("发放贷款"),
    REJECT("驳回贷款申请");

    private final String key;

    private RequestActivityType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
