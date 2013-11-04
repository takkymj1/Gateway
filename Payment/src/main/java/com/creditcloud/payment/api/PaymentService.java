/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.payment.model.PaymentAccount;
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
}
