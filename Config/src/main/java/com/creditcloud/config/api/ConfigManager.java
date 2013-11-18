/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.api;

import com.creditcloud.config.ClientConfig;
import com.creditcloud.config.CreditManagerConfig;
import com.creditcloud.config.DeviceManagerConfig;
import com.creditcloud.config.EmailConfig;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.PaymentConfig;
import com.creditcloud.config.SMSConfig;
import com.creditcloud.config.UpYunConfig;
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

    public UpYunConfig getUpYunConfig();

    public DeviceManagerConfig getDeviceManagerConfig();

    public FeeConfig getFeeConfig();

    public PaymentConfig getPaymentConfig();

    public CreditManagerConfig getCreditManagerConfig();
}
