/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum BatchJobType implements BaseEnum {
    
    CREATE_USERS("批量开户"),
    CREATE_LOANS("批量建标"),
    /**
     * 平台将自有资金批量转给用户账户
     */
    TRANSFER("批量转账");
    
    private final String key;

    private BatchJobType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
