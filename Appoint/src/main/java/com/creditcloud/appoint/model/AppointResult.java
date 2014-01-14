/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum AppointResult implements BaseEnum {

    SUCCESSFUL("认购成功"),
    PARTLY_SUCCESSFUL("认购部分成功"),
    APPOINT_NOT_FOUND("找不到认购产品"),
    APPOIN_NOT_OPEN("认购没有开始"),
    APPOINT_ALREADY_FINISHED("认购已经结束"),
    APPOIN_NO_BALANCE("认购已满"),
    INVALID_AMOUNT("认购金额不合规，请查看产品说明"),
    EXCEED_LIMIT("超过认购次数上线"),
    EXCEED_AMOUNT("超过认购总金额上线"),
    FAILED("其他原因失败");

    private final String key;

    private AppointResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
