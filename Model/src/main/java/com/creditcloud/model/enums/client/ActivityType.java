/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 员工活动类型
 *
 * @author rooseek
 */
public enum ActivityType implements BaseEnum {

    LOANREQUEST_SUBMIT("提交贷款申请"),
    LOANREQUEST_APPROVE("批准贷款申请"),
    LOANREQUEST_REJECT("驳回贷款申请");

    private final String key;

    private ActivityType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
