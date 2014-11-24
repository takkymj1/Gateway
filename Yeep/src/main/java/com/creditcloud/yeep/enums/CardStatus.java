/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 绑卡状态
 *
 * @author rooseek
 */
public enum CardStatus implements BaseEnum {

    VERIFYING("认证中"),
    VERIFIED("已认证");

    private final String key;

    private CardStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
