/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class UserUnbindAgreementResponse extends BaseResponse{
    
    private String user_id;

    public UserUnbindAgreementResponse() {
        super(CmdIdRspType.MER_UNBIND_AGREEMENT_RSP);
    }

    public UserUnbindAgreementResponse(String mer_id, String ret_code, String ret_msg, String user_id) {
        super(CmdIdRspType.MER_UNBIND_AGREEMENT_RSP, mer_id, ret_code, ret_msg);
        this.user_id = user_id;
    }
    
    
    
}
