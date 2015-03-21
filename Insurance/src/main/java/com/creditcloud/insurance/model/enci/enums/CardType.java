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
public enum CardType implements BaseEnum{
    
    ID_CARD("1", "身份证"),
    MILITARY_CARD("2", "军人证"),
    PASSPORT("3","护照"),
    BIRTH_CERTIFICATE("4", "出身证明"),
    ACCOUNT_CARD("7", "户口本"),
    OTHER("9", "其他"),
    DRIVING_LICENCE("13", "驾照"),
    DATA_TRANSPORT_CARD("19", "数据转换证件"),
    HONGKONG_MOCAO_TAIWAN_TO_MAINLAND_PASSPORT("20", "港澳台居民内地通行证");
    
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 名称
     */
    private final String name;

    private CardType(String key, String name){
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
