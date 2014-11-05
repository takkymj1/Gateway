/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class TradeUserWithdrawalRequest extends BaseRequest{
    
    private String ret_url;
    
    private String notify_url;
    
    private String sourceV;
    
    private String order_id;
    
    private String mer_date;
    
    private String user_id;
    
    private String account_id;
    
    private String amount;

    public TradeUserWithdrawalRequest(String sign_type, 
                                      String charset, 
                                      String res_format, 
                                      String sign, 
                                      String mer_id, 
                                      String version, 
                                      String ret_url, 
                                      String notify_url, 
                                      String sourceV, 
                                      String order_id, 
                                      String mer_date, 
                                      String user_id, 
                                      String account_id, 
                                      String amount) {
        super(CmdIdType.CUST_WITHDRAWALS, sign_type, charset, res_format, sign, mer_id, version);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.sourceV = sourceV;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.user_id = user_id;
        this.account_id = account_id;
        this.amount = amount;
    }
    
    public TradeUserWithdrawalRequest(String mer_id, 
                                      String ret_url, 
                                      String notify_url, 
                                      String sourceV, 
                                      String order_id, 
                                      String mer_date, 
                                      String user_id, 
                                      String account_id, 
                                      String amount) {
        super(CmdIdType.CUST_WITHDRAWALS, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.VERSION_1);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.sourceV = sourceV;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.user_id = user_id;
        this.account_id = account_id;
        this.amount = amount;
    }
    
}
