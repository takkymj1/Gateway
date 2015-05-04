/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 推荐使用FundingProduct
 *
 * @author rooseek
 */
@Deprecated
public enum ProjectCategory implements BaseEnum {

    OTHER("其他", true);

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
