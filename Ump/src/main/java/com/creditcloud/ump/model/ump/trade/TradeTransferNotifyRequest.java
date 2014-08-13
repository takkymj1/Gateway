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
public class TradeTransferNotifyRequest extends BaseRequest {
    
    private String order_id;
    
    private String mer_date;
    
    private String trade_no;
    
    private String mer_check_date;

    public TradeTransferNotifyRequest(String sign_type, 
                                      String charset, 
                                      String res_format, 
                                      String sign, 
                                      String mer_id, 
                                      String version,
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String mer_check_date) {
        super(CmdIdType.TRANSFER_NOTIFY, sign_type, charset, res_format, sign, mer_id, version);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.mer_check_date = mer_check_date;
    }
    
    public TradeTransferNotifyRequest(String mer_id, 
                                      String version,
                                      String order_id, 
                                      String mer_date, 
                                      String trade_no, 
                                      String mer_check_date) {
        super(CmdIdType.TRANSFER_NOTIFY, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.mer_check_date = mer_check_date;
    }    
}
