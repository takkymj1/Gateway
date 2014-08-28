/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.ump.base.NotifyRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import javax.ws.rs.QueryParam;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class TradeRechargeNotifyRequest extends NotifyRequest{
    
    @QueryParam("order_id")
    private String order_id;
    
    @QueryParam("mer_date")
    private String mer_date;
    
    @QueryParam("trade_no")
    private String trade_no;
    
    @QueryParam("mer_check_date")
    private String mer_check_date;
    
    @QueryParam("balance")
    private String balance;
    
    @QueryParam("com_amt")
    private String com_amt;
    
    public TradeRechargeNotifyRequest() {
        super(CmdIdType.RECHARGE_NOTIFY);
    }
    
    public TradeRechargeNotifyRequest(String mer_id,
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String mer_check_date, 
                                      String balance, 
                                      String com_amt,
                                      String ret_code,
                                      String ret_msg) {
        super(CmdIdType.RECHARGE_NOTIFY, mer_id, ret_code, ret_msg);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.mer_check_date = mer_check_date;
        this.balance = balance;
        this.com_amt = com_amt;
    }    
}
