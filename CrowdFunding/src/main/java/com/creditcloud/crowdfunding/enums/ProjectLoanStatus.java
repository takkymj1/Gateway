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
public enum ProjectLoanStatus implements BaseEnum {

    PROCESSING("处理中"),
    SUCCESSFUL("成功"),
    FAILED("失败");

    private final String key;

    private ProjectLoanStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
