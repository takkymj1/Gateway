/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author xiongyong
 */
public enum FundingDreamTag implements BaseEnum {

    SCIENCE("科技"),//如-1,0 
    COMMUNITY("公益"),
    PUBLISH("出版"),
    ENTERTAINMENT("娱乐"),
    ART("艺术"),
    AGRICULTURE("农业"),
    OTHER("其他");

    private final String key;

    private FundingDreamTag(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
