/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.api;

import com.creditcloud.config.AllWinConfig;
import com.creditcloud.config.CacheConfig;
import com.creditcloud.config.CertificateConfig;
import com.creditcloud.config.ClientConfig;
import com.creditcloud.config.ContractSealConfig;
import com.creditcloud.config.CreditAssignConfig;
import com.creditcloud.config.CreditManagerConfig;
import com.creditcloud.config.DeviceManagerConfig;
import com.creditcloud.config.EmailConfig;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.FengMessageConfig;
import com.creditcloud.config.GuaranteeConfig;
import com.creditcloud.config.LianPayConfig;
import com.creditcloud.config.NewHopeConfig;
import com.creditcloud.config.RedisConfig;
import com.creditcloud.config.RewardConfig;
import com.creditcloud.config.SMSConfig;
import com.creditcloud.config.SentinelConfig;
import com.creditcloud.config.UpYunConfig;
import com.creditcloud.config.fund.FundConfig;
import com.creditcloud.config.fund.RemoteUserFundConfig;
import com.creditcloud.config.insurance.InsuranceConfig;
import com.creditcloud.config.wealthproduct.WealthProductConfig;
import com.creditcloud.model.enums.loan.LoanRequestType;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface ConfigManager extends PaymentConfigManager{

    public ClientConfig getClientConfig();

    public SMSConfig getSMSConfig();

    public EmailConfig getEmailConfig();

    public UpYunConfig getUpYunConfig();

    public DeviceManagerConfig getDeviceManagerConfig();

    public CreditManagerConfig getCreditManagerConfig();

    public CertificateConfig getCertificateConfig();

    /**
     *
     * 获取 redis 配置
     *
     * @return
     */
    public RedisConfig getRedisConfig();

    /**
     * 获取 sentinel 配置
     *
     * @return
     */
    public SentinelConfig getSentinelConfig();

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
     * wealth product config
     *
     * @return
     */
    public WealthProductConfig getWealthProductConfig();

    /**
     * 缓存配置文件
     *
     * @return
     */
    public CacheConfig getCacheConfig();

    /**
     * 合同章配置
     *
     * @return
     */
    public ContractSealConfig getContractSealConfig();

    /**
     * 债权转让相关配置
     */
    public CreditAssignConfig getCreditAssignConfig();
    
    /*
     * 站内信相关配置
     * @return 
     */
    public FengMessageConfig getFengMessageConfig();
    
    /**
     * 基金相关配置
     * 
     * @return 
     */
    public FundConfig getFundConfig();
    
    /**
     * 保险相关配置
     * 
     * @return 
     */
    public InsuranceConfig getInsuranceConfig();
    
    /**
     *  新希望相关配置文件
     * 
     * @return 
     */
    public NewHopeConfig getNewHopeConfig();
    
    /**
     * 远程用户资金账户配置
     * @return 
     */
    public RemoteUserFundConfig getRemoteUserFundConfig();
    
}
