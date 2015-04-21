/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum BankQuota implements BaseEnum {
    
    
    ICBC("中国工商银行", 50000),
    ABC("中国农业银行", 50000),
    CCB("建设银行", 50000),
    BOC("中国银行", 50000),
    CEB("光大银行", 50000),
    CIB("兴业银行", 50000),
    SDB("深发银行", 50000);
    
    private final String key;
    private final Integer quota;
    
    BankQuota(String key, Integer quota) {
        this.key = key;
        this.quota = quota;
    }

    @Override
    public String getKey() {
        return key;
    }
    
    public Integer getQuota() {
        return quota;
    }
    
}
