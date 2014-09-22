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
public class QuerySettleFileRequest extends BaseRequest {
    
    private String settle_date_p2p;
    
    private String settle_type_p2p;
    
    public QuerySettleFileRequest(String mer_id, 
                                  String settle_date_p2p, 
                                  String settle_type_p2p) {
        super(CmdIdType.DOWNLOAD_SETTLE_FILE_P, mer_id);
        this.settle_date_p2p = settle_date_p2p;
        this.settle_type_p2p = settle_type_p2p;
    }
}
