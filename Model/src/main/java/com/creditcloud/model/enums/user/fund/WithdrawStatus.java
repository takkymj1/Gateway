/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 提现申请状态
 * 
 * @author rooseek
 */
public enum WithdrawStatus implements BaseEnum {

    FAILED("失败"),
    PROCESSING("处理中"),
    REJECTED("被拒绝"),
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
