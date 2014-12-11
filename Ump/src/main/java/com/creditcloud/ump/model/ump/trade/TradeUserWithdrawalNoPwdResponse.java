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
@ToString(callSuper = true)
public class TradeUserWithdrawalNoPwdResponse extends BaseResponse {

    private String order_id;

    private String mer_date;

    private String trade_no;

    private String amount;

    public TradeUserWithdrawalNoPwdResponse() {
        super(CmdIdRspType.CUST_WITHDRAWALS_NOPWD_RSP);
    }
}
