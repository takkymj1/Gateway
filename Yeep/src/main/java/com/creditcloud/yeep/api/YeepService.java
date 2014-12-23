/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.api;

import com.creditcloud.yeep.model.BaseRequest;
import com.creditcloud.yeep.model.BaseResponse;
import com.creditcloud.yeep.model.FreezeResult;
import com.creditcloud.yeep.model.YeepAccount;
import com.creditcloud.yeep.model.service.FreezeResponse;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
    public interface YeepService extends YeepQueryService{
    /**
     * 获取用户在三方支付中的YeepAccount
     *
     * @param clientCode
     * @param userId
     * @return null表示用户没有在三方支付中开户
     */
    public YeepAccount getUserYeepAccount(String clientCode, String userId);

    
    /**
     * 根据在三方支付中的ID获取对应的UserId
     *
     * @param clientCode
     * @param accountId
     * @return null 表示accountId不存在
     */
    public String getUserIdByAccountId(String clientCode, String accountId);
    
    
    /**
     * 冻结指定用户的资金
     *
     * @param clientCode
     * @param userId
     * @param orderId 此次操作的唯一订单号
     * @param amount
     * @param BgRetUrl 后台返回的回调路径
     * @param merPriv
     * @return 如果找不到userId对应的支付账号返回null
     */
    public FreezeResult userFreeze(String clientCode,
                                   String userId,
                                   BigDecimal amount,
                                   String orderId,
                                   String BgRetUrl,
                                   String merPriv);
    
    
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
    public YeepAccount createUserYeepAccount(String clientCode, YeepAccount yeepAccount);

}
