/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.tender;

import com.creditcloud.ump.model.ump.base.NotifyRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import javax.ws.rs.QueryParam;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class TenderTransferNotifyRequest extends NotifyRequest {

    @QueryParam("order_id")
    private String order_id;

    @QueryParam("mer_date")
    private String mer_date;
    
    @QueryParam("trade_no")
    private String trade_no;
    
    @QueryParam("mer_check_date")
    private String mer_check_date;

    public TenderTransferNotifyRequest() {
        super(CmdIdType.PROJECT_TRANFER_NOTIFY);
    }
    
    public TenderTransferNotifyRequest(String mer_id,
                                       String ret_code,
                                       String ret_msg,
                                       String order_id,
                                       String mer_date,
                                       String trade_no,
                                       String mer_check_date) {
        super(CmdIdType.PROJECT_TRANFER_NOTIFY, mer_id, ret_code, ret_msg);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.mer_check_date = mer_check_date;
        this.trade_no = trade_no;
    }
}
