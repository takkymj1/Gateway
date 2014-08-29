/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

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
public class QueryTenderResponse extends BaseResponse {
    
    private String project_id;
    
    private String project_account_id;
    
    private String project_account_state;
    
    private String project_state;
    
    private String balance;
    
    public QueryTenderResponse() {
        super(CmdIdRspType.PROJECT_ACCOUNT_SEARCH_RSP);
    }

    public QueryTenderResponse(String sign_type, 
                               String sign, 
                               String mer_id, 
                               String version, 
                               String ret_code, 
                               String ret_msg, 
                               String project_id, 
                               String project_account_id, 
                               String project_account_state, 
                               String project_state, 
                               String balance) {
        super(CmdIdRspType.PROJECT_ACCOUNT_SEARCH_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.project_id = project_id;
        this.project_account_id = project_account_id;
        this.project_account_state = project_account_state;
        this.project_state = project_state;
        this.balance = balance;
    }
    
    
}
