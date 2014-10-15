/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.model;

import com.creditcloud.model.enums.BaseEnum;


/**
 * 虚拟账户交易类型
 * 
 * @author sobranie
 */
public enum VirtualBookingRecordType implements BaseEnum {

    ;
        
    private String key;

    private VirtualBookingRecordType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
