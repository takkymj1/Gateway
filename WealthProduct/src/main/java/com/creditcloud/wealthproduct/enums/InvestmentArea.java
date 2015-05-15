/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 投资领域
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum InvestmentArea implements BaseEnum {

    INTERNET("互联网"),
    MOBILE_INTERNET("移动互联网"),
    MEDICAL("医疗健康"),
    NEW_ENERGY("新能源"),
    NEW_MEDIA("新媒体"),
    HARDWARE("硬件"),
    MANUFACTURING("制造业"),
    FINANCIAL("金融"),
    EDUCATION_AND_TRAINING("教育培训"),
    CULTURAL_INNOVATION("文化创意"),
    OTHER("其他");

    private final String key;
    
    InvestmentArea(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
