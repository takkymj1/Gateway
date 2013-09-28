/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 将一个借款标拆为多个的方式
 *
 * @author sobranie
 */
public enum SplitMethod implements BaseEnum {

    AMOUNT("按金额"),
    DURATION("按期限");

    private final String key;

    SplitMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
