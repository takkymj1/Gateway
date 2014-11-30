/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author kdliu
 */
public enum PayType implements BaseEnum {
    /**
     * 借记卡网银
     */
    B2CDEBITBANK("借记卡网银"),
    /**
     * 企业网银
     */
    B2BBANK("企业网银"),
    /**
     * 借记卡快捷
     */
    DEBITCARD("借记卡快捷");
    
    private final String key;
    
    private PayType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
