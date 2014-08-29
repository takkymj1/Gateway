/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class QueryAccountRequest extends BaseRequest {
    
    private String user_id;
    
    private String is_find_account;
    
    private String is_select_agreement;
    
    public QueryAccountRequest(String mer_id, 
                               String user_id, 
                               String is_find_account, 
                               String is_select_agreement) {
        super(CmdIdType.USER_SEARCH, mer_id);
        this.user_id = user_id;
        this.is_find_account = is_find_account;
        this.is_select_agreement = is_select_agreement;
    }
    
}
