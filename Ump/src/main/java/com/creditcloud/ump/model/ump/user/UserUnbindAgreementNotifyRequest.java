/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.NotifyRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import javax.ws.rs.QueryParam;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class UserUnbindAgreementNotifyRequest extends NotifyRequest {
    
    @QueryParam("user_id")
    private String user_id;
    
    @QueryParam("user_unbind_agreement_list")
    private String user_unbind_agreement_list;

    public UserUnbindAgreementNotifyRequest() {
        super(CmdIdType.MER_UNBIND_AGREEMNT_NOTIFY);
    }
    
    public UserUnbindAgreementNotifyRequest(String mer_id, 
                                            String user_id, 
                                            String ret_code,
                                            String user_unbind_agreement_list) {
        super(CmdIdType.MER_UNBIND_AGREEMNT_NOTIFY, mer_id, ret_code, null);
        this.user_id = user_id;
        this.user_unbind_agreement_list = user_unbind_agreement_list;
    }
    
    
}
