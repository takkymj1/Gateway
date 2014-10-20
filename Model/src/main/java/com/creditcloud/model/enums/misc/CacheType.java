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
public enum CacheType implements BaseEnum {
    
    COMMON("通用組件"),
    LOANRELATE("抢标业务");
    
    private final String key;
    
    CacheType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
