/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.tender;

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
public class TenderCreateResponse extends BaseResponse {
    
    private String project_account_id;
    
    private String mer_check_date;

    public TenderCreateResponse() {
        super(CmdIdRspType.MER_BIND_PROJECT_RSP);
    }
        
    public TenderCreateResponse(String sign_type, 
                                String sign, 
                                String mer_id, 
                                String version, 
                                String ret_code, 
                                String ret_msg,
                                String project_account_id,
                                String mer_check_date) {
        super(CmdIdRspType.MER_BIND_PROJECT_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.project_account_id = project_account_id;
        this.mer_check_date = mer_check_date;
    }
    
}
