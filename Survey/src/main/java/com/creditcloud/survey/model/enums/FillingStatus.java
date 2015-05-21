/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 问卷填写状态
 *
 * @author rooseek
 */
public enum FillingStatus implements BaseEnum {

    FILLING("填写中"),
    FINISHED("已完成");

    private final String key;

    private FillingStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
