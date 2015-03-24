/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 保险种类
 * @author chai
 */
public enum ProductCode implements BaseEnum{
    
    I_LICAI("00914000", "i理财两全保险（万能型）"),
    I_CAI("00916000", "i财两全保险（万能型）"),
    I_TIANCAI("00892000", "i添财年金保险（投资连结型）");
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private ProductCode(String key, String name){
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
