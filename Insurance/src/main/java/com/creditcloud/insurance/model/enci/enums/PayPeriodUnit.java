/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 交费期限单位
 * @author chai
 */
public enum PayPeriodUnit implements BaseEnum{
    
    NONE("0","无关"),
    SINGLE_PREMIUM("1","趸交"),//一次性交清保费, 此项无需设定交费期限PayPeriod
    YREALY_PREMIUM("2","按年限交"),
    CERTAINAGE_PREMIUM("3","交至某确定年龄"),
    WHOLELIFE_PREMIUM("4","终身交费");
    
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private PayPeriodUnit(String key, String name){
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
