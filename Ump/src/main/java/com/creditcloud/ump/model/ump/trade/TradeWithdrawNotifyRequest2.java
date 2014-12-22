/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.ump.base.NotifyRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import javax.ws.rs.QueryParam;
import lombok.Data;
import lombok.ToString;

/**
 * 新版联动接口，原有接口保持兼容
 *
 * @author rooseek
 */
@Data
@ToString(callSuper = true)
public class TradeWithdrawNotifyRequest2 extends NotifyRequest {

    @QueryParam("order_id")
    private String order_id;

    @QueryParam("mer_date")
    private String mer_date;

    @QueryParam("trade_no")
    private String trade_no;

    @QueryParam("amount")
    private String amount;

    public TradeWithdrawNotifyRequest2() {
        super(CmdIdType.WITHDRAW_APPLY_NOTIFY);
    }

    public TradeWithdrawNotifyRequest2(String mer_id,
                                       String order_id,
                                       String mer_date,
                                       String trade_no,
                                       String amount,
                                       String ret_code,
                                       String ret_msg) {
        super(CmdIdType.WITHDRAW_APPLY_NOTIFY, mer_id, ret_code, ret_msg);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.trade_no = trade_no;
        this.amount = amount;
    }
}
