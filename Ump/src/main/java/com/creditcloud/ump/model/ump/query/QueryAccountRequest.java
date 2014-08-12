/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;

/**
 *
 * @author kdliu
 */
public class QueryAccountRequest extends BaseRequest {
    
    private String user_id;
    
    private String is_find_account;
    
    private String is_select_agreement;

    public QueryAccountRequest(String sign_type, 
                               String charset, 
                               String res_format, 
                               String sign, 
                               String mer_id, 
                               String version, 
                               String user_id, 
                               String is_find_account, 
                               String is_select_agreement) {
        super(CmdIdType.USER_SEARCH, sign_type, charset, res_format, sign, mer_id, version);
        this.user_id = user_id;
        this.is_find_account = is_find_account;
        this.is_select_agreement = is_select_agreement;
    }
    
    public QueryAccountRequest(String mer_id, 
                               String user_id, 
                               String is_find_account, 
                               String is_select_agreement) {
        super(CmdIdType.USER_SEARCH, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.user_id = user_id;
        this.is_find_account = is_find_account;
        this.is_select_agreement = is_select_agreement;
    }
    
}
