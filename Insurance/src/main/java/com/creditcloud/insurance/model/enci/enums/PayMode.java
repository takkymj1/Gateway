/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 交费方式
 * @author chai
 */
public enum PayMode implements BaseEnum{
    
    NONE("0", "无关或不确定"),
    YEARLY("1", "年交"),
    HALF_YEARLY("2", "半年交"),
    QUARTERLY("3", "季交"),
    MONTHLY("4", "月交"),
    SINGLELY("5", "趸交"),
    UN_SCHEDULED("6", "不定期");
    
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private PayMode(String key, String name){
        this.key = key;
        this.name = name;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }
}
