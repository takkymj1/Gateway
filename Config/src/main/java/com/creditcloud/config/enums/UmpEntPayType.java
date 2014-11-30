/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * UMP企业账户支付方式
 *
 * @author kdliu
 */
public enum UmpEntPayType implements BaseEnum {

    /**
     * 企业网银
     */
    B2BBANK("企业网银"),
    /**
     * 个人借记卡网银
     */
    B2CDEBITBANK("个人借记卡网银");
    
    private final String key;
    
    private UmpEntPayType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
