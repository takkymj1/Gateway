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
public class UserRegisterResponse extends BaseResponse {

    private String reg_date;

    private String user_id;

    private String account_id;

    public UserRegisterResponse() {
        super(CmdIdRspType.MER_REGISTER_PERSON_RSP);
    }
    
    public UserRegisterResponse(String sign_type, 
                                String sign, 
                                String mer_id, 
                                String version,
                                String ret_code, 
                                String ret_msg,
                                String reg_date,
                                String user_id,
                                String account_id) {
        super(CmdIdRspType.MER_REGISTER_PERSON_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.reg_date = reg_date;
        this.user_id = user_id;
        this.account_id = account_id;
    }    
}
