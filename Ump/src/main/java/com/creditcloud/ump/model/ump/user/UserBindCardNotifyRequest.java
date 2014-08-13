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
public class UserBindCardNotifyRequest extends BaseRequest {
    
    private String user_id;
    
    private String ret_code;
    
    private String last_four_cardid;
    
    private String user_bind_agreement_list;

    public UserBindCardNotifyRequest(String sign_type, 
                                     String charset, 
                                     String res_format, 
                                     String sign, 
                                     String mer_id, 
                                     String version,
                                     String user_id, 
                                     String ret_code, 
                                     String last_four_cardid, 
                                     String user_bind_agreement_list) {
        super(CmdIdType.MER_BIND_CARD_NOTIFY, sign_type, charset, res_format, sign, mer_id, version);
        this.user_id = user_id;
        this.ret_code = ret_code;
        this.last_four_cardid = last_four_cardid;
        this.user_bind_agreement_list = user_bind_agreement_list;
    }
    
    public UserBindCardNotifyRequest(String mer_id, 
                                     String user_id, 
                                     String ret_code, 
                                     String last_four_cardid, 
                                     String user_bind_agreement_list) {
        super(CmdIdType.MER_BIND_CARD_NOTIFY, mer_id);
        this.user_id = user_id;
        this.ret_code = ret_code;
        this.last_four_cardid = last_four_cardid;
        this.user_bind_agreement_list = user_bind_agreement_list;
    }    
}
