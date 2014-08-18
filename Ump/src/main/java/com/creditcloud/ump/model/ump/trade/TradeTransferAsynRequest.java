/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;

/**
 *
 * @author kdliu
 */
public class TradeTransferAsynRequest extends BaseRequest{
    
    private String order_id;
    
    private String mer_date;
    
    private String mer_account_id;
    
    private String partic_user_id;
    
    private String partic_account_id;
    
    private String partic_acc_type;
    
    private String amount;

    public TradeTransferAsynRequest(String sign_type, 
                                    String charset, 
                                    String res_format, 
                                    String sign, 
                                    String mer_id, 
                                    String version, 
                                    String order_id, 
                                    String mer_date, 
                                    String mer_account_id, 
                                    String partic_user_id, 
                                    String partic_account_id, 
                                    String partic_acc_type, 
                                    String amount) {
        super(CmdIdType.TRANSFER_ASYN, sign_type, charset, res_format, sign, mer_id, version);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.mer_account_id = mer_account_id;
        this.partic_user_id = partic_user_id;
        this.partic_account_id = partic_account_id;
        this.partic_acc_type = partic_acc_type;
        this.amount = amount;
    }
    
    public TradeTransferAsynRequest(String mer_id,
                                    String order_id, 
                                    String mer_date, 
                                    String mer_account_id, 
                                    String partic_user_id, 
                                    String partic_account_id, 
                                    String partic_acc_type, 
                                    String amount) {
        super(CmdIdType.TRANSFER_ASYN, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.mer_account_id = mer_account_id;
        this.partic_user_id = partic_user_id;
        this.partic_account_id = partic_account_id;
        this.partic_acc_type = partic_acc_type;
        this.amount = amount;
    }
    
}
