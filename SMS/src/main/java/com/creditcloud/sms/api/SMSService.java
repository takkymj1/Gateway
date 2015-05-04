/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.sms.api;

import com.creditcloud.model.client.Client;
import com.creditcloud.sms.CaptchaType;
import com.creditcloud.sms.SMSType;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface SMSService {

    /**
     * 原则上只发送验证码和随机密码
     * 
     * @param client
     * @param type
     * @param mobile
     * @param content
     */
    void sendMessage(Client client, SMSType type, String mobile, String... content);
    
    /**
     * 发送多种类型验证码 for emay
     * 
     * @param client
     * @param type
     * @param captchaType
     * @param mobile
     * @param content
     */
    void sendMessage(Client client, CaptchaType captchaType, SMSType type, String mobile, String... content);

}
