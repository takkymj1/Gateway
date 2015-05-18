/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import com.creditcloud.interestbearing.ta.message.asset.QueryPlatformAssetGapRequestMessage;
import com.creditcloud.interestbearing.ta.message.asset.QueryPlatformAssetGapResponseMessage;
import com.creditcloud.interestbearing.ta.message.asset.ReportPlatformRedeemRequestMessage;
import com.creditcloud.interestbearing.ta.message.asset.ReportPlatformRedeemResponseMessage;
import com.creditcloud.interestbearing.ta.message.asset.ReportPlatformSubscribeRequestMessage;
import com.creditcloud.interestbearing.ta.message.asset.ReportPlatformSubscribeResponseMessage;
import com.creditcloud.interestbearing.ta.message.asset.UserQueryLatestAssetRequestMessage;
import com.creditcloud.interestbearing.ta.message.asset.UserQueryLatestAssetResponseMessage;
import com.creditcloud.interestbearing.ta.message.asset.UserRedeemRequestMessage;
import com.creditcloud.interestbearing.ta.message.asset.UserRedeemResponseMessage;
import com.creditcloud.interestbearing.ta.message.asset.UserSubscribeRequestMessage;
import com.creditcloud.interestbearing.ta.message.asset.UserSubscribeResponseMessage;
import com.creditcloud.interestbearing.ta.message.product.ProductPlatformRegisterNewFundRequestMessage;
import com.creditcloud.interestbearing.ta.message.product.ProductPlatformRegisterNewFundResponseMessage;
import javax.ejb.Remote;

/**
 * 余额生息TA服务接口
 *
 * @author guohuazhang
 */
@Remote
public interface InterestingBearingPlatformTAService {

    /**
     * 登记生息资产新品种
     *
     * @param tenantId
     * @param request
     * @return
     */
    ProductPlatformRegisterNewFundResponseMessage registerNewProduct(String tenantId,ProductPlatformRegisterNewFundRequestMessage request);

    /**
     * 登记用户生息余额变动(申购)
     *
     * @param request
     * @return
     */
    UserSubscribeResponseMessage userSubscribe(UserSubscribeRequestMessage request);

    /**
     * 登记用户生息余额变动(赎回)
     *
     * @param request
     * @return
     */
    UserRedeemResponseMessage userRedeem(UserRedeemRequestMessage request);

    /**
     * 查询用户生息状态
     *
     * @param request
     * @return
     */
    UserQueryLatestAssetResponseMessage queryUserAsset(UserQueryLatestAssetRequestMessage request);

    /**
     * 登记平台申购确认的资产
     *
     * @param tenantId
     * @param request
     * @return
     */
    ReportPlatformSubscribeResponseMessage reportPlatformSubscribe(String tenantId,ReportPlatformSubscribeRequestMessage request);

    /**
     * 登记平台赎回确认的资产
     *
     * @param tenantId
     * @param request
     * @return
     */
    ReportPlatformRedeemResponseMessage reportPlatformRedeem(String tenantId,ReportPlatformRedeemRequestMessage request);

    /**
     * 查询平台当日差额列表，用于指导申购或者赎回
     *
     * @param tenantId
     * @param request
     * @return
     */
    QueryPlatformAssetGapResponseMessage queryPlatformAssetGap(String tenantId,QueryPlatformAssetGapRequestMessage request);
}
