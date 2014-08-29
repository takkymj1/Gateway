/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class QueryTradeResponse extends BaseResponse {
    
    private String order_id;
    
    private String mer_check_date;
    
    private String mer_date;
    
    private String trade_no;
    
    private String busi_type;
    
    private String amount;
    
    private String tran_state;
    
    private String sms_num;

    public QueryTradeResponse() {
        super(CmdIdRspType.TRANSFER_SEARCH_RSP);
    }
    
    public QueryTradeResponse(String sign_type, 
                                 String sign, 
                                 String mer_id, 
                                 String version, 
                                 String ret_code, 
                                 String ret_msg,
                                 String order_id, 
                                 String mer_check_date, 
                                 String mer_date, 
                                 String trade_no, 
                                 String busi_type, 
                                 String amount, 
                                 String tran_state, 
                                 String sms_num) {
        super(CmdIdRspType.TRANSFER_SEARCH_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.order_id = order_id;
        this.mer_check_date = mer_check_date;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.busi_type = busi_type;
        this.amount = amount;
        this.tran_state = tran_state;
        this.sms_num = sms_num;
    }
}