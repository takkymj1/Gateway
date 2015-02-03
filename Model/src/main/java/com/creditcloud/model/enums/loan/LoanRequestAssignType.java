/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 标的可转让类别
 * @author jiaguangfu
 */
public enum LoanRequestAssignType implements BaseEnum {

    NORMALASSIGNABLE("正常可转让", true),
    ONCEASSIGNABLE("一对一转让", true), 
    NONEASSIGNABLE("不可转让", true);

    private final String key;

    /**
     * 是否通用
     */
    private final boolean general;

    private LoanRequestAssignType(String key, boolean general) {
        this.key = key;
        this.general = general;
    }

    @Override
    public String getKey() {
        return key;
    }

    public boolean isGeneral() {
        return general;
    }
}
