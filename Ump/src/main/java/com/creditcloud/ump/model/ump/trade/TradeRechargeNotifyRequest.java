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

/**
 *
 * @author kdliu
 */
@Data
public class TradeRechargeNotifyRequest extends BaseRequest{
    
    private String order_id;
    
    private String mer_date;
    
    private String trade_no;
    
    private String mer_check_date;
    
    private String balance;
    
    private String com_amt;

    public TradeRechargeNotifyRequest(String sign_type, 
                                      String charset, 
                                      String res_format, 
                                      String sign, 
                                      String mer_id, 
                                      String version,
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String mer_check_date, 
                                      String balance, 
                                      String com_amt) {
        super(CmdIdType.RECHARGE_NOTIFY, sign_type, charset, res_format, sign, mer_id, version);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.mer_check_date = mer_check_date;
        this.balance = balance;
        this.com_amt = com_amt;
    }
    
    public TradeRechargeNotifyRequest(String mer_id,
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String mer_check_date, 
                                      String balance, 
                                      String com_amt) {
        super(CmdIdType.RECHARGE_NOTIFY, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.mer_check_date = mer_check_date;
        this.balance = balance;
        this.com_amt = com_amt;
    }    
}
