/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * 七家支持快捷的银行每日充值限额和单笔充值限额
 * 
 * @author xiongyong
 */
public enum BankQuota implements BaseEnum {
    
    
    ICBC("中国工商银行", 50000, 50000),
    ABC("中国农业银行", 20000, 20000),
    CCB("建设银行", 5000, 10000),
    BOC("中国银行", 10000, 10000),
    CEB("光大银行", 500000, 500000),
    CIB("兴业银行", 500000, 500000),
    SDB("深圳发展银行", 500000, 500000);
    
    private final String key;
    private final Integer singleQuota;
    private final Integer dailyQuota;
    
    BankQuota(String key, Integer singleQuota, Integer dailyQuota) {
        this.key = key;
        this.singleQuota = singleQuota;
        this.dailyQuota = dailyQuota;
    }

    @Override
    public String getKey() {
        return key;
    }
    
    public Integer getSingleQuota() {
        return singleQuota;
    }
    
    public Integer getDailyQuota() {
        return dailyQuota;
    }
    
}
