/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 债权转让状态
 *
 * @author rooseek
 */
public enum CreditAssignStatus implements BaseEnum {

    /**
     * TODO 暂时没用上,直接OPEN
     */
    SCHEDULED("已安排"),
    OPEN("正在转让"),
    FINISHED("转让已满"),
    PARTFINISHED("部分转让成功"),
    FAILED("转让失败"),
//    SETTLED("转让成功"),
    CANCELED("已取消"), 
    TIMEOUTFAILED("不在转让时间内导致的不可转让");

    private final String key;

    private CreditAssignStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
