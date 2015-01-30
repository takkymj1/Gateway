/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 合同方
 * 
 * @author sobranie
 */
public enum ContractParty implements BaseEnum {

    FIRST("甲方"),
    SECOND("乙方"),
    THIRD("丙方"),
    FOURTH("丁方"),
    FIFTH("戊方");

    private final String key;

    ContractParty(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
