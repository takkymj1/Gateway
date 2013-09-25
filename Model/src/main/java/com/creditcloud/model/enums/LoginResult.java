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
    SUCCESSFUL_FIRST_LOGIN("短信发送的随机密码首次登录成功,需要修改密码"),
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
