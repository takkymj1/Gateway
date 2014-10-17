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
public class TradeUserRechargeNoPwdRequest extends BaseRequest{
    
    private String notify_url;
    
    private String order_id;
    
    private String mer_date;
    
    private String pay_type;
    
    private String user_id;
    
    private String account_id;
    
    private String amount;
    
    public TradeUserRechargeNoPwdRequest(String mer_id,
                                         String notify_url, 
                                         String order_id, 
                                         String mer_date, 
                                         String pay_type, 
                                         String user_id, 
                                         String account_id, 
                                         String amount) {
        super(CmdIdType.MER_RECHARGE_PERSON_NOPWD, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.pay_type = pay_type;
        this.user_id = user_id;
        this.account_id = account_id;
        this.amount = amount;
    }
}
