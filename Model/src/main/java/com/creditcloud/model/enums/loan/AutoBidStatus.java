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
public enum AutoBidStatus implements BaseEnum {

    INITIATED("初始"),
    SUCCESSFUL("投标成功，并生成对应的投资记录"),
    CANCELLED("已取消");

    private final String key;

    private AutoBidStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
