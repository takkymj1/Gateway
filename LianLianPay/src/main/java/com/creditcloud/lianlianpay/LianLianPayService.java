/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay;

import javax.ejb.Remote;

/**
 *
 * @author tinglany
 */
@Remote
public interface LianLianPayService {
    
    /**
     * 银行卡卡 BIN 查询
     * 
     * @param clientCode
     * @param cardNo
     * @return 
     */
    public CardDetail  queryCard(String clientCode, String cardNo);
    
    /**
     *  连连支付 API 支付结果查询
     * 
     * @param clientCode
     * @param orderId
     * @param reqTime
     * @return 
     */
    public PayResult queryPayResult(String clientCode, String orderId, String reqTime);
}
