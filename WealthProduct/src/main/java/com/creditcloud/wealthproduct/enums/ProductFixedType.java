/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 固定收益类产品类型
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum ProductFixedType implements BaseEnum {
    
    LOAN("贷款"),
    EQUITY("权益"),
    STOCKS("股权"),
    PORTFOLIO("组合"),
    OTHER("其他");
    
    private final String key;
    
    ProductFixedType(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

}
