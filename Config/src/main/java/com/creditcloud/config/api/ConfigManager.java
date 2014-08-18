/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.api;

import com.creditcloud.config.AllWinConfig;
import com.creditcloud.config.CertificateTypeWeightConfig;
import com.creditcloud.config.ClientConfig;
import com.creditcloud.config.CreditManagerConfig;
import com.creditcloud.config.DeviceManagerConfig;
import com.creditcloud.config.EmailConfig;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.FormaxConfig;
import com.creditcloud.config.FuiouConfig;
import com.creditcloud.config.GuaranteeConfig;
import com.creditcloud.config.PaymentConfig;
import com.creditcloud.config.RewardConfig;
import com.creditcloud.config.SMSConfig;
import com.creditcloud.config.UmpConfig;
import com.creditcloud.config.UpYunConfig;
import com.creditcloud.model.enums.loan.LoanRequestType;
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

    public PaymentConfig getPaymentConfig();

    public CreditManagerConfig getCreditManagerConfig();

    public CertificateTypeWeightConfig getCertificateTypeWeightConfig();

    /**
     * 
     * 获取formax接口配置
     * 
     * @return 
     */
    public FormaxConfig getFormaxConfig();
    /**
     * 获取安融惠众接口配置
     *
     * @return
     */
    public AllWinConfig getAllWinConfig();

    /**
     * 担保借款配置
     *
     * @return
     */
    public GuaranteeConfig getGuaranteeConfig();

    /**
     * 获取系统默认费率配置
     *
     * @return
     */
    public FeeConfig getFeeConfig();

    /**
     * 根据借款申请类型获取費率配置,如果沒有找到相应配置则返回系统默认配置
     *
     * @param type
     * @return
     */
    public FeeConfig getFeeConfig(LoanRequestType type);

    public RewardConfig getRewardConfig();
    
    /**
     * 获取Fuiou代收付配置
     * 
     * @return
     */
    public FuiouConfig getFuiouConfig();
    
    /**
     * 获取联动优势(UMP)的配置
     * 
     * @return 
     */
    public UmpConfig getUmpConfig();
}
