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
public class TradeTransferRequest extends BaseRequest{
    
    private String ret_url;
    
    private String notify_url;
    
    private String order_id;
    
    private String mer_date;
    
    private String mer_account_id;
        
    private String partic_acc_type;
    
    private String trans_action;
    
    private String partic_user_id;
    
    private String partic_account_id;

    private String amount;
    
    private String pay_passwd;

    public TradeTransferRequest(String sign_type, 
                                String charset, 
                                String res_format, 
                                String sign, 
                                String mer_id, 
                                String version, 
                                String ret_url, 
                                String notify_url, 
                                String order_id, 
                                String mer_date, 
                                String mer_account_id, 
                                String partic_acc_type,
                                String trans_action,
                                String partic_user_id,
                                String partic_account_id, 
                                String amount,
                                String pay_passwd) {
        super(CmdIdType.TRANSFER, sign_type, charset, res_format, sign, mer_id, version);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.mer_account_id = mer_account_id;
        this.trans_action = trans_action;
        this.partic_user_id = partic_user_id;
        this.partic_account_id = partic_account_id;
        this.partic_acc_type = partic_acc_type;
        this.amount = amount;
        this.pay_passwd = pay_passwd;
    }

    public TradeTransferRequest(String mer_id,
                                String ret_url, 
                                String notify_url, 
                                String order_id, 
                                String mer_date, 
                                String mer_account_id, 
                                String partic_acc_type,
                                String trans_action,
                                String partic_user_id,
                                String partic_account_id, 
                                String amount,
                                String pay_passwd) {
        super(CmdIdType.TRANSFER, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.VERSION_1);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.mer_account_id = mer_account_id;
        this.trans_action = trans_action;
        this.partic_user_id = partic_user_id;
        this.partic_account_id = partic_account_id;
        this.partic_acc_type = partic_acc_type;
        this.amount = amount;
        this.pay_passwd = pay_passwd;
    }
    
}
