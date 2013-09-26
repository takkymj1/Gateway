/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 登录行为的返回结果
 *
 * @author rooseek
 */
public enum LoginResult implements BaseEnum {

    SUCCESSFUL("登录名密码验证正确,登录成功"),
    NEED_CHANGE_PASSWORD("登录成功,需要修改密码"),
    FAILED("账号不存在或密码错误");

    private final String key;

    private LoginResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
