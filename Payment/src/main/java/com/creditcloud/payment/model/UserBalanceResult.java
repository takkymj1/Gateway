/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import java.math.BigDecimal;

/**
 * 用户账户余额信息
 *
 * @author sobranie
 */
public class UserBalanceResult extends PaymentResult {

    /**
     * 账户余额
     */
    private BigDecimal accountBalance;

    /**
     * 冻结余额
     */
    private BigDecimal freezeBalance;

    /**
     * 账户可以支取的余额
     */
    private BigDecimal availableBalance;

    public UserBalanceResult() {
    }

    public UserBalanceResult(String RespCode,
                             String RespDesc,
                             BigDecimal accountBalance,
                             BigDecimal freezeBalance,
                             BigDecimal availableBalance) {
        super(RespCode, RespDesc);
        this.accountBalance = accountBalance;
        this.freezeBalance = freezeBalance;
        this.availableBalance = availableBalance;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal getFreezeBalance() {
        return freezeBalance;
    }

    public void setFreezeBalance(BigDecimal freezeBalance) {
        this.freezeBalance = freezeBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }
}
