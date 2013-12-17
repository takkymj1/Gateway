/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeepay.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 易宝商户账户下的子账户类型
 *
 * @author sobranie
 */
public enum SubAccountType implements BaseEnum {

    BASE("基本账户"),
    RISK("风险金账户"),
    SERVICE("服务费账户");
    
    private final String key;
    
    SubAccountType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}

