/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.social;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 支持的社交账户类型
 * 
 * @author sobranie
 */
public enum SocialType implements BaseEnum {

    WEIBO("新浪微博"),
    IFENG("凤凰网"),
    QQ("QQ");

    private final String key;

    private SocialType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
