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
public enum WealthProductStatus implements BaseEnum {

    INITIATED("初始"),
    OPENED("开放申请"),
    FINISHED("申请结束"),
    SETTLED("已结算"),
    CLEARED("已还清");

    private final String key;

    private WealthProductStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
