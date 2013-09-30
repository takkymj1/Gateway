/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 * 发送短信验证码需要的一些常量
 *
 * @author rooseek
 */
public interface SMSConfirmConstant {

    /**
     * The interval time for sending another sms to one mobile, in ms
     */
    long INTERVAL_SMS = 30 * 1000;

    /**
     * Default TTL (time to live) in ms for sms confirmation
     */
    long TTL_DEFAULT = 10 * 60 * 1000;

    /**
     * Default random captcha length
     */
    int CAPTCHA_LENGTH = 6;
}
