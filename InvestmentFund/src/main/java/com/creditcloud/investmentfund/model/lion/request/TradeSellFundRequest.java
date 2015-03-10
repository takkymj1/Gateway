/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金赎回
 * 
 * 用于赎回或者快速赎回直销渠道货币基金
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class TradeSellFundRequest extends BaseRequest {

    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型（0为身份证，暂时只支持身份证）
     */
    private String certificatetype;
    
    /**
     * 交易账号
     */
    private String transactionaccountid;
    
    /**
     * 基金代码
     */
    private String fundcode;
    
    /**
     * 卖出份额
     */
    private String sellshare;
    
    public TradeSellFundRequest(
            String merid,
            String idNumber, 
            String transactionaccountid,
            String fundcode,
            String sellshare) {
        super(Attribute.sell, merid);
        this.certificateno = idNumber;
        this.certificatetype = "0";
        this.transactionaccountid = transactionaccountid;
        this.fundcode = fundcode;
        this.sellshare = sellshare;
    }
}
