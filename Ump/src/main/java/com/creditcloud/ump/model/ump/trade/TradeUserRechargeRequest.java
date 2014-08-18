/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class TradeUserRechargeRequest extends BaseRequest {

    private String ret_url;

    private String notify_url;

    private String order_id;

    private String mer_date;

    private String pay_type;

    private String recharge_mer_id;

    private String account_id;

    private String account_type;

    private String amount;

    private String gate_id;

    private String user_ip;

    public TradeUserRechargeRequest(String sign_type,
                                    String charset,
                                    String res_format,
                                    String sign,
                                    String mer_id,
                                    String version,
                                    String ret_url,
                                    String notify_url,
                                    String order_id,
                                    String mer_date,
                                    String pay_type,
                                    String recharge_mer_id,
                                    String account_id,
                                    String account_type,
                                    String amount,
                                    String gate_id,
                                    String user_ip) {
        super(CmdIdType.MER_RECHARGE_PERSON, sign_type, charset, res_format, sign, mer_id, version);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.pay_type = pay_type;
        this.recharge_mer_id = recharge_mer_id;
        this.account_id = account_id;
        this.account_type = account_type;
        this.amount = amount;
        this.gate_id = gate_id;
        this.user_ip = user_ip;
    }

    public TradeUserRechargeRequest(String mer_id,
                                    String ret_url,
                                    String notify_url,
                                    String order_id,
                                    String mer_date,
                                    String pay_type,
                                    String recharge_mer_id,
                                    String account_id,
                                    String account_type,
                                    String amount,
                                    String gate_id,
                                    String user_ip) {
        super(CmdIdType.MER_RECHARGE_PERSON, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.pay_type = pay_type;
        this.recharge_mer_id = recharge_mer_id;
        this.account_id = account_id;
        this.account_type = account_type;
        this.amount = amount;
        this.gate_id = gate_id;
        this.user_ip = user_ip;
    }
}
