/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.util.Enums;

/**
 *
 * @author kdliu
 */
public enum UmpSeqCashFlow implements BaseEnum{
    /**
     * 借款
     */
    INFLOW("01", "借款"),
    /**
     * 贷款
     */
    OUTFLOW("02", "贷款");
    
    private String key;
    private String value;
    
    UmpSeqCashFlow(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }
    
    public String getValue() {
        return value;
    }

    public static UmpSeqCashFlow getEnum(String key) {
        return Enums.getEnumByKey(UmpSeqCashFlow.class, key);
    }
}
