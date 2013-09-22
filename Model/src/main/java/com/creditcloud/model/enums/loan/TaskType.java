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
public enum TaskType implements BaseEnum {

    USER_TASK("用户相关任务"),
    LOANREQUEST_TASK("贷款请求相关任务");

    private final String key;

    private TaskType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
