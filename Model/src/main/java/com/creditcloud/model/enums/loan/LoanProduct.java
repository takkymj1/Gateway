/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author xiongyong
 */
public enum LoanProduct implements BaseEnum {

    FENG_CX("凤保宝"),
    FENG_RT("凤锐通");

    private final String key;

    private LoanProduct(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

}
