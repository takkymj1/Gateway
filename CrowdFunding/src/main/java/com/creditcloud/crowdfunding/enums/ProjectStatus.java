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
public enum ProjectStatus implements BaseEnum {

    A("A");

    private final String key;

    private ProjectStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
