/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MemberClassType implements BaseEnum {

    ENTERPRISE("企业借款人"),
    GUARANTEE_CORP("担保公司");

    private final String key;

    private MemberClassType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
