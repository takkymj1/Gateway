/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import com.creditcloud.interestbearing.model.CreditCloudTAConfig;
import com.creditcloud.interestbearing.model.HuaAnFundAccountConfig;
import com.creditcloud.interestbearing.model.InterestDistributionPolicy;
import javax.ejb.Remote;

/**
 * 余额生息运行时配置服务
 *
 * @author guohuazhang
 */
@Remote
public interface InterestBearingRuntimeConfigurationService {

    /**
     * 设置余额生息收益分配策略
     *
     * @param policy
     */
    void setDistributionPolicy(InterestDistributionPolicy policy);

    /**
     * 读取余额生息分配策略
     *
     * @return
     */
    InterestDistributionPolicy loadDistributionPolicy();

    /**
     * 平台在华安的动态配置信息
     *
     * @param config
     */
    void setHuaAnFundAccountConfig(HuaAnFundAccountConfig config);

    /**
     * 平台在华安的动态配置信息
     *
     * @return
     */
    HuaAnFundAccountConfig loadHuaAnFundAccountConfig();

    /**
     * 获取保存的平台在云信TA动态参数，比如租户ID
     *
     * @return
     */
    CreditCloudTAConfig loadCreditCloudTAConfig();

    /**
     * 保存的平台在云信TA动态参数，比如租户ID
     *
     * @param config
     */
    void setCreditCloudTAConfig(CreditCloudTAConfig config);

    /**
     * 是否已经注册开户 ？
     *
     * @return
     */
    boolean isPlatformHuaAnFundAccountReady();

    /**
     * 是否已经获得交易密钥 ?
     *
     * @return
     */
    boolean isPlatformHuaAnFundTradingKeyReady();

    /**
     * 获取交易密钥保存到本地
     *
     * @return
     */
    String downloadAndKeepPlatformHuaAnFundTradingKey();

    /**
     * 获取正在使用的交易密钥
     *
     * @return
     */
    String platformHuaAnFundTradingKey();

}
