/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;

/**
 *
 * @author sobranie
 */
public class SendPwdResponse extends BaseResponse {
    
    public SendPwdResponse() {
        super(CmdIdRspType.MER_SEND_SMS_PWD_RSP);
    }
            
}
