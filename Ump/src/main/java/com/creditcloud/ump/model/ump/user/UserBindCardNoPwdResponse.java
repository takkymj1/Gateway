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
public class UserBindCardNoPwdResponse extends BaseResponse {
    
    private String user_id;
    
    private String order_id;
    
    private String mer_date;

    public UserBindCardNoPwdResponse() {
        super(CmdIdRspType.MER_BIND_CARD_NOPWD_RSP);
    }
}
