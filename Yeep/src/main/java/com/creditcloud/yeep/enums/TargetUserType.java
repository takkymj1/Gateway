/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 用户类型
 *
 * @author rooseek
 */
public enum TargetUserType implements BaseEnum {

    MEMBER("个人会员"),
    MERCHANT("商户");

    private final String key;

    private TargetUserType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
