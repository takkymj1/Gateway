/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.tender;

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
public class TenderTransferRequest extends BaseRequest{
    
    private String ret_url;
    
    private String notify_url;
    
    private String sourceV;
    
    private String order_id;
    
    private String mer_date;
    
    private String project_id;
    
    private String project_account_id;
    
    private String serv_type;
    
    private String trans_action;
    
    private String partic_type;
    
    private String partic_acc_type;
    
    private String partic_user_id;
    
    private String partic_account_id;
    
    private String amount;
    
    private String pay_passwd;

    public TenderTransferRequest(String sign_type, 
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
                                 String project_id, 
                                 String project_account_id, 
                                 String serv_type, 
                                 String trans_action, 
                                 String partic_type, 
                                 String partic_acc_type, 
                                 String partic_user_id, 
                                 String partic_account_id, 
                                 String amount, 
                                 String pay_passwd) {
        super(CmdIdType.PROJECT_TRANSFER, sign_type, charset, res_format, sign, mer_id, version);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.sourceV = sourceV;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.project_id = project_id;
        this.project_account_id = project_account_id;
        this.serv_type = serv_type;
        this.trans_action = trans_action;
        this.partic_type = partic_type;
        this.partic_acc_type = partic_acc_type;
        this.partic_user_id = partic_user_id;
        this.partic_account_id = partic_account_id;
        this.amount = amount;
        this.pay_passwd = pay_passwd;
    }
    
    public TenderTransferRequest(String mer_id, 
                                 String ret_url, 
                                 String notify_url, 
                                 String sourceV, 
                                 String order_id, 
                                 String mer_date, 
                                 String project_id, 
                                 String project_account_id, 
                                 String serv_type, 
                                 String trans_action, 
                                 String partic_type, 
                                 String partic_acc_type, 
                                 String partic_user_id, 
                                 String partic_account_id, 
                                 String amount, 
                                 String pay_passwd) {
        super(CmdIdType.PROJECT_TRANSFER, mer_id);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.sourceV = sourceV;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.project_id = project_id;
        this.project_account_id = project_account_id;
        this.serv_type = serv_type;
        this.trans_action = trans_action;
        this.partic_type = partic_type;
        this.partic_acc_type = partic_acc_type;
        this.partic_user_id = partic_user_id;
        this.partic_account_id = partic_account_id;
        this.amount = amount;
        this.pay_passwd = pay_passwd;
    }    
}
