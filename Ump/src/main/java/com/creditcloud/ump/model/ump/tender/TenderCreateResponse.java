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
    
    private String project_state;
    
    private String mer_check_date;

    public TenderCreateResponse() {
        super(CmdIdRspType.MER_BIND_PROJECT_RSP);
    }
}
