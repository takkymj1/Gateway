/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.trade;

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
public class TradeTransferNotifyResponse extends BaseResponse {
    
    private String order_id;
    
    private String mer_date;

    public TradeTransferNotifyResponse() {
        super(CmdIdRspType.TRANSFER_NOTIFY_RSP);
    }
    
    public TradeTransferNotifyResponse(String mer_id, 
                                       String ret_code, 
                                       String order_id, 
                                       String mer_date) {
        super(CmdIdRspType.TRANSFER_NOTIFY_RSP, mer_id, ret_code, null);
        this.order_id = order_id;
        this.mer_date = mer_date;
    }
    
    /**
     * This response doesn't have ret_msg field
     * 
     * @param ret_msg 
     */
    @Override
    public void setRet_msg(String ret_msg) {
        ret_msg = null;
    }
    
}
