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

    public QueryTenderRequest(String mer_id,
                              String project_id) {
        super(CmdIdType.PROJECT_ACCOUNT_SEARCH, mer_id);
        this.project_id = project_id;
    }
}
