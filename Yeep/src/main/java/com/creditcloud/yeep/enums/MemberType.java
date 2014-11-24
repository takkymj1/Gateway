/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 会员类型
 *
 * @author rooseek
 */
public enum MemberType implements BaseEnum {

    PERSONAL("个人会员"),
    ENTERPRISE("企业会员");

    private final String key;

    private MemberType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
