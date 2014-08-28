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
public class TenderTransferNotifyResponse extends BaseResponse {
    
    private String order_id;
    
    private String mer_date;

    public TenderTransferNotifyResponse() {
        super(CmdIdRspType.PROJECT_TRANFER_NOTIFY_RSP);
    }
    
    public TenderTransferNotifyResponse(String mer_id, 
                                       String ret_code, 
                                       String order_id, 
                                       String mer_date) {
        super(CmdIdRspType.NOTIFY_WITHDRAW_RSP, mer_id, ret_code, null);
        this.order_id = order_id;
        this.mer_date = mer_date;
    }
    
    @Override
    public void setRet_msg(String ret_msg) {
        super.setRet_msg(null);
    }
    
}
