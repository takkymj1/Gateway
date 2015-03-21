/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author chai
 */
public enum InsPeriodUnit implements BaseEnum{
    
    WHOLELIFE("1", "保终身"),
    YEAR("2", "按年限保"),
    AGE("3", "保至某确定年龄"),
    MONTH("4", "按月保"),
    DAY("5", "按天保");
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private InsPeriodUnit(String key, String name){
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
