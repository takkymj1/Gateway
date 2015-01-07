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
 * @author sobranie
 */
@Data
@ToString(callSuper = true)
public class SendPwdRequest extends BaseRequest {

    private String user_id;

    private String order_id;

    private String identity_code;

    public SendPwdRequest(String mer_id,
                          String user_id,
                          String order_id,
                          String identity_code) {
        super(CmdIdType.MER_SEND_SMS_PWD, mer_id);
        this.user_id = user_id;
        this.order_id = order_id;
        this.identity_code = identity_code;
    }

}
