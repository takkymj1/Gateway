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
public class TradeWithdrawNotifyRequest extends BaseRequest {
    
    private String order_id;
    
    private String mer_date;
    
    private String trade_no;
    
    private String amount;
    
    private String trade_state;
    
    private String transfer_date;
    
    private String transfer_settle_date;

    public TradeWithdrawNotifyRequest(CmdIdType service, 
                                      String sign_type, 
                                      String charset, 
                                      String res_format, 
                                      String sign, 
                                      String mer_id, 
                                      String version, 
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String amount, 
                                      String trade_state, 
                                      String transfer_date, 
                                      String transfer_settle_date) {
        super(CmdIdType.NOTIFY_WITHDRAW, sign_type, charset, res_format, sign, mer_id, version);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.amount = amount;
        this.trade_state = trade_state;
        this.transfer_date = transfer_date;
        this.transfer_settle_date = transfer_settle_date;
    }
    
    public TradeWithdrawNotifyRequest(String mer_id,
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String amount, 
                                      String trade_state, 
                                      String transfer_date, 
                                      String transfer_settle_date) {
        super(CmdIdType.NOTIFY_WITHDRAW, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.amount = amount;
        this.trade_state = trade_state;
        this.transfer_date = transfer_date;
        this.transfer_settle_date = transfer_settle_date;
    }    
}
