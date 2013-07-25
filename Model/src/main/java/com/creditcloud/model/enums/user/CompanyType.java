/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CompanyType implements BaseEnum {

    GOVERNMENT_OFFICES("国家机关"),
    PUBLIC_INSTITUTION("事业单位"),
    STATEOWNED_KEY_ENTERPRISES("央企(包括下级单位)"),
    OVERSEAS_FUNDED_ENTERPRISE("外资企业(包括合资企业)"),
    LOCAL_STATEOWNED_ASSETS_SUPERVISION("地方国资委直属企业"),
    GENERAL_PUBLIC_COMPANY("一般上市公司(包括国外上市)"),
    GENERAL_PRIVATE_ENTERPRISE("一般民营企业"),
    WORLD_TOP500("世界500强(包括合资企业和下级单位)"),
    SELF_EMPLOYED("个体经营者"),
    OTHER("其他");

    private final String key;

    private CompanyType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
