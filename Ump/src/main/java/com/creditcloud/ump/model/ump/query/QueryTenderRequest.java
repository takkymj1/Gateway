/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.query;

import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class QueryTenderRequest extends BaseRequest {
    
    private String project_id;

    public QueryTenderRequest(CmdIdType service, 
                              String sign_type, 
                              String charset, 
                              String res_format, 
                              String sign, 
                              String mer_id, 
                              String version,
                              String project_id) {
        super(CmdIdType.PROJECT_ACCOUNT_SEARCH, sign_type, charset, res_format, sign, mer_id, version);
        this.project_id = project_id;
    }
    
    
}
