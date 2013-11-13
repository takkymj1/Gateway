/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FundRecordStatus implements BaseEnum {

    SUCCESSFUL("已成功"),
    PROCESSING("处理中"),
    FAILED("已失败"),
    CANCELED("已取消");

    private final String key;

    private FundRecordStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
