/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class QueryAccountResponse extends BaseResponse {
    
    private String plat_user_id;
    
    private String account_id;
    
    private String cust_name;
    
    private String identity_type;
    
    private String identity_code;
    
    private String mobile_id;
    
    private String mail_addr;
    
    private String account_state;
    
    private String balance;
    
    private String card_id;
    
    private String user_bind_agreement_list;

    public QueryAccountResponse() {
        super(CmdIdRspType.USER_SEARCH_RSP);
    }
        
    public QueryAccountResponse(String sign_type, 
                                String sign, 
                                String mer_id, 
                                String version, 
                                String ret_code, 
                                String ret_msg,
                                String plat_user_id, 
                                String account_id, 
                                String cust_name, 
                                String identity_type, 
                                String identity_code, 
                                String mobile_id, 
                                String mail_addr, 
                                String account_state, 
                                String balance, 
                                String card_id, 
                                String user_bind_agreement_list) {
        super(CmdIdRspType.USER_SEARCH_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.plat_user_id = plat_user_id;
        this.account_id = account_id;
        this.cust_name = cust_name;
        this.identity_type = identity_type;
        this.identity_code = identity_code;
        this.mobile_id = mobile_id;
        this.mail_addr = mail_addr;
        this.account_state = account_state;
        this.balance = balance;
        this.card_id = card_id;
        this.user_bind_agreement_list = user_bind_agreement_list;
    }
    
    
}
