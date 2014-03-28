/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 贷款类型
 *
 * @author rooseek
 */
public enum LoanRequestType implements BaseEnum {

    //GENERAL("普通标"),
    //默认信用标
    CREDIT("信用标"),
    GUARANTEE("担保标");

    private final String key;

    private LoanRequestType(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
