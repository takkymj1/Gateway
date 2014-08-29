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
public class QueryTranSeqResponse extends BaseResponse {
    
    private String total_num;
    
    private String trans_detail;
    
    public QueryTranSeqResponse() {
        super(CmdIdRspType.TRANSEQ_SEARCH_RSP);
    }

    public QueryTranSeqResponse(String sign_type, 
                                String sign, 
                                String mer_id, 
                                String version, 
                                String ret_code, 
                                String ret_msg, 
                                String total_num, 
                                String trans_detail) {
        super(CmdIdRspType.TRANSEQ_SEARCH_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.total_num = total_num;
        this.trans_detail = trans_detail;
    }
    
    
}
