/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.payment.model.PaymentAccount;
import com.creditcloud.payment.model.UserBalance;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface PaymentService {

    /**
     * 获取用户在三方支付中的PaymentAccount
     * 
     * @param clientCode
     * @param userId
     * @return null表示用户没有在三方支付中开户
     */
    public PaymentAccount getUserPaymentAccount(String clientCode, String userId);
    
    /**
     * 创建用户在第三方支付中的账号
     * 
     * @param clientCode
     * @param paymentAccount 
     */
    public void createUserPaymentAccount(String clientCode, PaymentAccount paymentAccount);
    
    /**
     * 根据在三方支付中的ID获取对应的UserId
     * 
     * @param clientCode
     * @param accountId
     * @return null 表示accountId不存在
     */
    public String getUserIdByAccountId (String clientCode, String accountId);
    
    /**
     * 查询用户在三方支付中的实时账户余额
     * 
     * @param clientCode
     * @param userId
     * @return 
     */
    public UserBalance queryBalance(String clientCode, String userId);
    
    /**
     * 获取请求的CheckValue
     * 
     * @param clientCode
     * @param request
     * @return 
     */
    public String getChkValue (String clientCode, BaseRequest request);
    
    /**
     * 验证从三方支付返回的数据对象是否合法
     * 
     * @param clientCode
     * @param response 返回数据
     * @return 0 表示正常，负值为失败
     */
    public int verifyResponse (String clientCode, BaseResponse response);
}
