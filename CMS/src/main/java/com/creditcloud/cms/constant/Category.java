/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.constant;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum Category implements BaseEnum {

    INDEX("首页大图");

    private final String key;

    private Category(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
