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
public enum UmpSeqTransStatus implements BaseEnum{
    /**
     * 成功
     */
    SUCCESS("01", "成功"),
    /**
     * 冲正
     */
    PROCESSING("02", "冲正"),
    /**
     * 退货
     */
    FAIL("03", "退货");
    
    private String key;
    private String value;
    
    UmpSeqTransStatus(String key, String value) {
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

    public static UmpSeqTransStatus getEnum(String key) {
        return Enums.getEnumByKey(UmpSeqTransStatus.class, key);
    }
}
