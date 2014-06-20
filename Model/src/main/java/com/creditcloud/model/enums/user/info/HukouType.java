/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum HukouType implements BaseEnum {

    AGRICULTURE("农业户口"),
    //TODO 暂不区分集体、非集体、空挂户口类型
    URBAN("城镇户口");

    private final String key;

    private HukouType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
