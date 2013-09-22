/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CompanyType implements BaseEnum {

    GOVERNMENT_OFFICES("国家及地方政府行政机构"),
    PUBLIC_INSTITUTION("事业单位"),
    EDUCATION_RESEARCH_INSTITUTION("学校及科研机构"),
    STATEOWNED_KEY_ENTERPRISES("央企(包括下级单位)"),
    STATEOWNED_ENTERPRISES("一般国企(包括下级单位)"),
    OVERSEAS_FUNDED_ENTERPRISES("外资企业"),
    TAIWAN_HONGKONG_MACAU("台港澳企业"),
    JOINT_VENTURE("合资企业"),
    PRIVATE_ENTERPRISES("民营企业"),
    SELF_EMPLOYED("个体经营"),
    OTHER("其他");

    private final String key;

    private CompanyType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
