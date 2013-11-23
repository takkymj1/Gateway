/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 合同类型
 *
 * @author sobranie
 */
public enum ContractType implements BaseEnum {

    LOAN("借款合同");

    private final String key;

    ContractType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
