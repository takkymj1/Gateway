/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 产品募集设立的方式
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum PlacementType implements BaseEnum {

    PRIVATE_PLACEMENT("私募"),
    PUBLIC_PLACEMENT("公募");
    
    private final String key;
    
    PlacementType(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

    
}
