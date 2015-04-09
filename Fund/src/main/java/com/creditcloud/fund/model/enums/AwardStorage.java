/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *奖品库存对应的key
 * @author wenqiang
 */
public enum AwardStorage implements BaseEnum{
    IPHONE("iphone"),
    CAREMA("carema");
    
    private String key;
    
    private AwardStorage(String key){
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
