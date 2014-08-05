/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model;

/**
 *
 * @author kdliu
 */
public enum CmdIdType {
    /**
     * Fuiou代收请求
     */
    SINCOMEFORREQ,
    /**
     * Fuiou付款请求
     */
    PAYFORREQ,
    /**
     * Fuiou账户验证请求
     */
    VERIFYREQ,
    /**
     * Fuiou付款结果通知请求
     */
    PAYFORNTF,
    /**
     * Fuiou代收结果通知请求
     */
    INCOMEFORNTF,
    /**
     * 账户验证结果通知请求
     */
    VERIFYNTF,
    /**
     * 退票结果通知请求
     */
    RETURNTICKETNTF,
    /**
     * 查询交易请求
     */
    QRYTRANSREQ;
    
}
