/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.corporation;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CorporationType implements BaseEnum {

    GENERAL("一般公司"),
    GUARANTEE("担保公司");

    private final String key;

    private CorporationType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
