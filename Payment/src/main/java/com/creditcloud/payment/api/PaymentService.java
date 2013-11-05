/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.payment.model.PaymentAccount;
import com.creditcloud.payment.model.chinapnr.BaseRequest;
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
     * @param msgData 签名前的数据体
     * @param chkValue 返回的签名值
     * @return 0 表示正常，负值为失败
     */
    public int verifyResponse (String clientCode, String msgData, String chkValue);
}
