/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

/**
 * 云信余额生息网关接口。<br>
 * 云信余额生息网关是云信余额生息系统的云服务，提供一些针对平台余额生息的必要的中转服务
 *
 * @author guohuazhang
 */
public interface InterestBearingGatewayService {

    /**
     * 获取新的华安基金交易密钥
     *
     * @param merchantId
     * @param merchantDate
     * @return
     */
    String newHuaAnFundTradingKey(String merchantId,String merchantDate);

    /**
     * 使用平台的营业执照号获取注册开户页面的自动提交页面(HTML,会帮用户自动跳转到注册开户界面)
     *
     * @param merchantBusinessLicenceNo
     * @return
     */
    String buildHTMLNewAccountAutoSubmitForm(String merchantBusinessLicenceNo);
}
