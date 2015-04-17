/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 系统预定义的用户组code
 *
 * @author rooseek
 */
public enum UserGroupCode implements BaseEnum {

    LOAN_AGENT("借款居间人");

    private final String key;
    
    private UserGroupCode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
