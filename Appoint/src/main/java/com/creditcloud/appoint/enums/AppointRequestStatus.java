/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 认购申请状态
 *
 * @author rooseek
 */
public enum AppointRequestStatus implements BaseEnum {

    APPOINTED("已认购"),
    PAYED("已支付"),
    CANCELED("已撤销"),
    SETTLED("已结算");

    private String key;

    private AppointRequestStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
