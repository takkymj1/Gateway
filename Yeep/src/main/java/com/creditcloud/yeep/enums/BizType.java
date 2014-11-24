/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 服务名称
 *
 * @author rooseek
 */
public enum BizType implements BaseEnum {

    REGISTER("注册") //TODO more
    ;

    private final String key;

    private BizType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
