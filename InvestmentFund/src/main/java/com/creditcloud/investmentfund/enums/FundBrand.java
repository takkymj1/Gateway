/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 基金品牌
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum FundBrand implements BaseEnum {

    LIONFUND("诺安基金"),
    HUAANFUND("华安基金");

    private final String key;

    private FundBrand(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
