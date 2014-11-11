/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author suetming
 */
public enum ContractSealType implements BaseEnum {

    PERSONAL("个人证书"),
    ENTERPRISE("企业证书");
    
    private final String key;
    
    ContractSealType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
