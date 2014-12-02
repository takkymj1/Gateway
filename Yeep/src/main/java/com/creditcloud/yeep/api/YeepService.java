/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.api;

import com.creditcloud.yeep.model.BaseRequest;
import com.creditcloud.yeep.model.BaseResponse;
import com.creditcloud.yeep.model.YeepAccount;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
//public interface YeepService extends YeepQueryService{
    public interface YeepService {
    
    /**
     * 获取用户在三方支付中的YeepAccount
     *
     * @param clientCode
     * @param userId
     * @return null表示用户没有在三方支付中开户
     */
    public YeepAccount getYeepAccount(String clientCode, String userId);
    
    /**
     * 获取请求的CheckValue
     *
     * @param clientCode
     * @param request
     * @return
     */
    public String getChkValue(String clientCode, BaseRequest request);
   
    /**
     * 验证从三方支付返回的数据对象是否合法
     *
     * @param clientCode
     * @param response   返回数据
     * @return 0 表示正常，负值为失败
     */
    public int verifyResponse(String clientCode, BaseResponse response);
    
    /**
     * 创建用户在第三方支付中的账号
     *
     * @param clientCode
     * @param yeepAccount
     * @return
     */
    public YeepAccount createYeepAccount(String clientCode, YeepAccount yeepAccount);

}
