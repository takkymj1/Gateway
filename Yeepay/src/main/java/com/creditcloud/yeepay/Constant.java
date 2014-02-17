/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.yeepay;

/**
 *
 * @author sobranie
 */
public interface Constant {

    /**
     * 商户编号
     */
    String p1_MerId = "10012220629";
    
    /**
     * 商户秘钥
     */
    String keyValue = "5u9xpy33jt961v66Ys8nq7W954H140xonfUG6Gpa7fV98oDqc9JF44DDKe79";
    
    /**
     * 交易请求地址
     */
    String yeepayCommonReqURL = "https://www.yeepay.com/app-merchant-proxy/node";
    
    /**
     * 显示的商品名称
     */
    String p5_Pid = "P2P Deposit";
    
    /**
     * 支付回调Url
     */
    String p8_Url = "https://www.yeepbank.com/payment/depositReturn";
}
