/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.api;

import com.creditcloud.config.ClientConfig;
import com.creditcloud.config.EmailConfig;
import com.creditcloud.config.SMSConfig;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface ConfigManager {

    public ClientConfig getClientConfig();
    
    public SMSConfig getSMSConfig();
    
    public EmailConfig getEmailConfig();
}
