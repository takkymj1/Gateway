/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

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
    
    // 平台是否已经在华安基金开户注册：华安基金账号
    // 平台是否已经从华金基金获得交易密钥 : 交易密钥
}
