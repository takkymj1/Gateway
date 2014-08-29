/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

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
public class UserBindAgreementRequest extends BaseRequest {
    
    private String ret_url;
    
    private String notify_url;
    
    private String user_id;
    
    private String account_id;
    
    private String user_bind_agreement_list;

    public UserBindAgreementRequest(String sign_type, 
                                    String charset, 
                                    String res_format, 
                                    String sign, 
                                    String mer_id, 
                                    String version, 
                                    String ret_url, 
                                    String notify_url, 
                                    String user_id, 
                                    String account_id, 
                                    String user_bind_agreement_list) {
        super(CmdIdType.MER_BIND_AGREEMENT, sign_type, charset, res_format, sign, mer_id, version);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.user_id = user_id;
        this.account_id = account_id;
        this.user_bind_agreement_list = user_bind_agreement_list;
    }
    
    public UserBindAgreementRequest(String mer_id, 
                                    String ret_url, 
                                    String notify_url, 
                                    String user_id, 
                                    String account_id, 
                                    String user_bind_agreement_list) {
        super(CmdIdType.MER_BIND_AGREEMENT, mer_id);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.user_id = user_id;
        this.account_id = account_id;
        this.user_bind_agreement_list = user_bind_agreement_list;
    }    
    
}
