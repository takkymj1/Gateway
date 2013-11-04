/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;

/**
 * 用户在第三方支付上的账号
 *
 * @author sobranie
 */
public class PaymentAccount extends BaseObject {

    /**
     * 用户的唯一ID，与UserService中的一致
     */
    private String userId;

    /**
     * 由三方支付生成的用户唯一ID
     */
    private String accountId;

    /**
     * 用户在三方支付中的用户名，可以与loginName不同
     */
    private String accountName;

    public PaymentAccount() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
