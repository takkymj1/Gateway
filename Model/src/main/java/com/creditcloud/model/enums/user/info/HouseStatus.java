/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 住房状况
 *
 * @author rooseek
 */
public enum HouseStatus implements BaseEnum {

    COMMERCIAL_LOAN("商业贷款"),
    HAF_LOAN("公积金贷款"),
    COMPOSITE_LOAN("组合贷款"),
    SELF_OWNED("自有住房"),
    RENT("租房"),
    OTHER("其他");

    private final String key;

    private HouseStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
