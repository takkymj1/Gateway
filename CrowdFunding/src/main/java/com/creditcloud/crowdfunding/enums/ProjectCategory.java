/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProjectCategory implements BaseEnum {

    OTHER("其他", true),
    /**
     * FENG
     */
    FENG_SF("梦想首发", false),
    FENG_CZ("梦想创造", false),
    FENG_XHJ("中网小画家", false);

    private final String key;

    /**
     * 是否通用
     */
    private final boolean general;

    private ProjectCategory(String key, boolean general) {
        this.key = key;
        this.general = general;
    }

    @Override
    public String getKey() {
        return key;
    }

    public boolean isGeneral() {
        return general;
    }
}
