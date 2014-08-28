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
public class UserBindAgreementNotifyRequest extends NotifyRequest{
    
    @QueryParam("user_id")
    private String user_id;
    
    @QueryParam("user_bind_agreement_list")
    private String user_bind_agreement_list;

    public UserBindAgreementNotifyRequest(String mer_id, 
                                          String user_id, 
                                          String ret_code, 
                                          String user_bind_agreement_list) {
        super(CmdIdType.MER_BIND_AGREEMENT_NOTIFY, mer_id, ret_code, null);
        this.user_id = user_id;
        this.user_bind_agreement_list = user_bind_agreement_list;
    }
}
