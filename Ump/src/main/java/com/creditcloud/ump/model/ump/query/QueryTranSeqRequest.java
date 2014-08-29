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
public class QueryTranSeqRequest extends BaseRequest {
    
    private String account_id;
    
    private String account_type;
    
    private String start_date;
    
    private String end_date;
    
    private String page_num;

    public QueryTranSeqRequest(String mer_id, 
                               String account_id, 
                               String account_type, 
                               String start_date, 
                               String end_date, 
                               String page_num) {
        super(CmdIdType.TRANSEQ_SEARCH, mer_id);
        this.account_id = account_id;
        this.account_type = account_type;
        this.start_date = start_date;
        this.end_date = end_date;
        this.page_num = page_num;
    }
    
    
}
