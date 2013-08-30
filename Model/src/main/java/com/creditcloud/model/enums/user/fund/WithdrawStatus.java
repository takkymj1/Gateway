/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum WithdrawStatus implements BaseEnum {

    FAILED("失败"),
    PROCESSING("处理中"),
    SUCCESSFUL("成功");

    private final String key;

    private WithdrawStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
