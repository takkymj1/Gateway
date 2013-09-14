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
public enum TaskStatus implements BaseEnum {

    //TODO add more
    INITIATED("任务创建后的初始状态"),
    ASSIGNED("任务已经分配给某个具体员工"),
    STARTED("任务执行开始时间"),
    FINISHED("任务执行结束时间");
    private final String key;

    private TaskStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
