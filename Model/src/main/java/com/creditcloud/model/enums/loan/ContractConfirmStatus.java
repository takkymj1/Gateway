/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 合同确认状态
 * 
 * @author peili
 */
public enum ContractConfirmStatus implements BaseEnum {

    CONFIRMED("已确认"),
    UNCONFIRMED("未确认");

    private final String key;

    ContractConfirmStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
