/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.sms;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 验证码类型
 * 默认为SMS
 * @author yanwei
 */
public enum CaptchaType implements BaseEnum {
    
    /**
     * 手机短信（默认）
     */
    SMS("短信"),
    /**
     * 语音 for emay
     */
    VOICE("语音");
    
    private final String key;
    
    private CaptchaType(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
