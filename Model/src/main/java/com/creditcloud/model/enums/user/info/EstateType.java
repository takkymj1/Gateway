/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 住宅及厂房信息
 *
 * @author suetming (suetming.ma@creditcloud.com)
 *
 * 创建时间：2013-9-20 下午12:49:57
 *
 */
public enum EstateType implements BaseEnum {

    APARTMENT_FLAT("平层户型住宅或商业用房"),
    APARTMENT_DUPLEX("跃层户型住宅或商业用房"),
    APARTMENT_SPLIT_LEVEL("错层户型住宅或商业用房"),
    APARTMENT_MUTI("复式户型住宅或商业用房"),
    FACTORY("厂房"),
    LAND("土地");

    private final String key;

    private EstateType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}