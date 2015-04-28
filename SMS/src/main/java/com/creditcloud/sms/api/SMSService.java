/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.sms.api;

import com.creditcloud.model.client.Client;
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
     * 发送语音验证码 for emay
     * 
     * emay语音号码限制：最多不要超过6个字符，最少不要小于4个字符;字符必须为0至9的全英文半角数字字符
     * 
     * @param client
     * @param type
     * @param mobile
     * @param content
     */
    void sendVoice(Client client, SMSType type, String mobile, String... content);

}
