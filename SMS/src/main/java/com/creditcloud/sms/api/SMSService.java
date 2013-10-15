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
     *
     * @param client
     * @param type
     * @param mobile
     * @param content
     */
    void sendMessage(Client client, SMSType type, String mobile, String... content);
}
