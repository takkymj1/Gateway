/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import com.creditcloud.interestbearing.model.CreditCloudTAConfig;
import com.creditcloud.interestbearing.model.HuaAnFundAccountConfig;
import com.creditcloud.interestbearing.model.InterestDistributionPolicy;

/**
 * 生息余额分配策略配置服务
 *
 * @author guohuazhang
 */
public interface InterestDistributionConfigurationService {

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

}
