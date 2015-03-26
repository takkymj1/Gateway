/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.ticket;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author yanwei
 */
public enum CallOperation implements BaseEnum {

    NONE("无"),
    CALL_IN("呼入"),
    CALL_OUT("呼出");
    
    private final String key;
    
    private CallOperation(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
