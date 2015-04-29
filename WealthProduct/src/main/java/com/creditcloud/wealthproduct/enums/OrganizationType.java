/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 产品的组织形式
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum OrganizationType implements BaseEnum {

    CONTRACT("契约型"),
    COMPANY("公司型");

    private final String key;
    
    OrganizationType(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
