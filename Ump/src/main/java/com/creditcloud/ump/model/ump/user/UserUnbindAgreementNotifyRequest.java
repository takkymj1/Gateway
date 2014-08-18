/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.NotifyRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class UserUnbindAgreementNotifyRequest extends NotifyRequest {
    
    private String user_id;
    
    private String user_unbind_agreement_list;

    public UserUnbindAgreementNotifyRequest(String mer_id, 
                                            String user_id, 
                                            String ret_code,
                                            String user_unbind_agreement_list) {
        super(CmdIdType.MER_UNBIND_AGREEMNT_NOTIFY, mer_id, ret_code, null);
        this.user_id = user_id;
        this.user_unbind_agreement_list = user_unbind_agreement_list;
    }
    
    
}
