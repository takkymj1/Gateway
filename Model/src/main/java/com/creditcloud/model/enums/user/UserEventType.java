/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum UserEventType implements BaseEnum {
    
    REGISTER("完成注册"),
    LOGIN("用户PC端登录"),
    LOGIN_FIRST("用户首次PC端登录"),
    LOGIN_MOBILE("用户移动端登录"),
    LOGIN_MOBILE_FIRST("用户首次移动端登录"),
    PAYMENT_ACCOUNT("开通支付账户"),
    PAYMENT_BINDCARD("绑定银行卡"),
    PAYMENT_DEPOSIT("用户充值"),
    PAYMENT_DEPOSIT_FIRST("用户首次充值"),
    TENDER("用户投标"),
    TENDER_FIRST("用户首次投标");
    
    private final String key;

    private UserEventType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
