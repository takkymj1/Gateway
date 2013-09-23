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

    /**
     * 实地调查用户信息
     */
    USER("用户相关任务"),
    /**
     * 实地调查贷款请求本身的信息
     */
    LOANREQUEST("贷款请求相关任务"),
    /**
     * 不仅实地调查用户信息,还要同时调查贷款信息,处理流程不同于上两个任务
     */
    USER_AND_LOANREQUEST("用戶及贷款申请任务");

    private final String key;

    private TaskType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
