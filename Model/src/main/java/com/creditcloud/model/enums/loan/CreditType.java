/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author keven
 */
public enum CreditType implements BaseEnum {
    
    CREDIT("纯信用"),
    GUARANTEE("担保"),
    BAIL("保证金"),
    MORTGAGE("抵押"),
    PLEDGE("质押");
    
    private final String key;
    
    private CreditType(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
