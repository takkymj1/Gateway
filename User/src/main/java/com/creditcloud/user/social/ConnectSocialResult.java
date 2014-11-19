/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.social;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ConnectSocialResult implements BaseEnum {

    SUCCEED("成功"),
    USER_NOT_FOUND("注册用户不存在"),
    CONNECTED("已绑定"),
    FAILED("失败");

    private final String key;

    private ConnectSocialResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
