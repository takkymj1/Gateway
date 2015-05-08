/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import com.creditcloud.interestbearing.ta.message.product.ProductRegisterNewFundRequestMessage;
import com.creditcloud.interestbearing.ta.message.product.ProductRegisterNewFundResponseMessage;

/**
 * 余额生息TA服务接口
 *
 * @author guohuazhang
 */
public interface InterestingBearingPlatformTAService {

    /**
     * 登记生息资产新品种
     *
     * @param request
     * @return
     */
    ProductRegisterNewFundResponseMessage registerNewProduct(ProductRegisterNewFundRequestMessage request);
    //登记用户生息余额变动(申购、赎回)

    //查询用户生息状态
    // 登记平台申购确认的资产
    // 登记平台赎回确认的资产
    // 查询平台当日差额列表，用于指导申购或者赎回
}
