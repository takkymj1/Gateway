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
     * 原则上只发送验证码和随机密码, 同步接口
     * 
     * @param client
     * @param type
     * @param mobile
     * @param content
     */
    void sendMessageToNewUser(Client client, SMSType type, String mobile, String... content);
}
