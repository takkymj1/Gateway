/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class UserUnbindAgreementRequest extends BaseRequest {
    
    private String ret_url;
    
    private String notify_url;
    
    private String user_id;
    
    private String account_id;
    
    private String user_unbind_agreement_list;

    public UserUnbindAgreementRequest(String mer_id, String ret_url, String notify_url, String user_id, String account_id, String user_unbind_agreement_list) {
        super(CmdIdType.MER_UNBIND_AGREEMENT, mer_id);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.user_id = user_id;
        this.account_id = account_id;
        this.user_unbind_agreement_list = user_unbind_agreement_list;
    }
}
