/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.tender;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class TenderUpdateResponse extends BaseResponse{
    
    private String mer_check_date;

    public TenderUpdateResponse() {
        super(CmdIdRspType.MER_UPDATE_PROJECT_RSP);
    }
    
    public TenderUpdateResponse(String sign_type, 
                                String sign, 
                                String mer_id, 
                                String version, 
                                String ret_code, 
                                String ret_msg, 
                                String mer_check_date) {
        super(CmdIdRspType.MER_UPDATE_PROJECT_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.mer_check_date = mer_check_date;
    }
    
}
