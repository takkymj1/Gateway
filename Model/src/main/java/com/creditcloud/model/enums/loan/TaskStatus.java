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

    INITIATED("任务创建后的初始状态"),
    EMPLOYEE_ASSIGNED("任务已经分配给某个具体员工"),
    EMPLOYEE_ACKNOWLEDGED("员工已接收到任务"),//主要用于DeviceManager中,device已收到某项任务并存储在本地的应答,下次不需要再取
    EMPLOYEE_STARTED("员工开始执行任务"),
    EMPLOYEE_FINISHED("员工汇报任务结束,等待上级审查"),
    OVERDUE("已逾期"),
    ABORTED("已放弃"),
    FINISHED("进过上级审核任务结束");

    private final String key;

    private TaskStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
