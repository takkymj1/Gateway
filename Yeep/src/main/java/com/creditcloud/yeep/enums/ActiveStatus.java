/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 会员激活状态
 *
 * @author rooseek
 */
public enum ActiveStatus implements BaseEnum {

    ACTIVATED("已激活"),
    DEACTIVATED("未激活");

    private final String key;

    private ActiveStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
