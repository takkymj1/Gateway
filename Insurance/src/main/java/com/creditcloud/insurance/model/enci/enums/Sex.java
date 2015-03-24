/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 性别
 * @author chai
 */
public enum Sex implements BaseEnum{
    
    MALE("M", "男"),
    FEMALE("F", "女");
    
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private Sex(String key, String name){
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
    
    public static Sex getByIsMale(boolean male){
        if(male){
            return MALE;
        }
        return FEMALE;
    }
}
