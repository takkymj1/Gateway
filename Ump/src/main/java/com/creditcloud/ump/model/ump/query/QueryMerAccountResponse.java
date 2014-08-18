/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class QueryMerAccountResponse extends BaseResponse {
    
    private String query_mer_id;
    
    private String balance;
    
    private String account_type;
    
    private String account_state;

    public QueryMerAccountResponse() {
        super(CmdIdRspType.PTP_MER_QUERY_RSP);
    }
    
    public QueryMerAccountResponse(String sign_type, 
                                   String sign,
                                   String mer_id, 
                                   String version,
                                   String ret_code,
                                   String ret_msg, 
                                   String query_mer_id, 
                                   String balance, 
                                   String account_type, 
                                   String account_state) {
        super(CmdIdRspType.PTP_MER_QUERY_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.query_mer_id = query_mer_id;
        this.balance = balance;
        this.account_type = account_type;
        this.account_state = account_state;
    }
    
}
