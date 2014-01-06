/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 认购的产品状态
 *
 * @author rooseek
 */
public enum AppointmentStatus implements BaseEnum {

    /**
     * 初始状态
     */
    INITIATED("初始"),
    /**
     * 已经确定了发布时间
     */
    SCHEDULED("已安排"),
    /**
     * 达到发布时间，可以认购
     */
    OPENED("开放认购"),
    /**
     * 募集期结束或者提前结束认购
     */
    FINISHED("结束认购"),
    /**
     * 被后台取消
     */
    CANCELED("已取消"),
    /**
     * 认购后完成资金结算
     */
    SETTLED("已结算");

    private String key;

    private AppointmentStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
