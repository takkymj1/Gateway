/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay;

import com.creditcloud.model.BaseObject;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class PayResult extends BaseObject {

    //支付结果
    private String result_pay;

    //商户编号
    private String oid_partner;

    //商户订单时间
    private String dt_order;

    //商户唯一订单号
    private String no_order;

    //连连支付支付单号
    private String oid_paybill;

    //交易金额
    private String money_order;

    //支付方式
    private String pay_type;

    public PayResult() {
    }

    public PayResult(String result_pay,
                     String oid_partner,
                     String dt_order,
                     String no_order,
                     String oid_paybill,
                     String money_order,
                     String pay_type) {
        this.result_pay = result_pay;
        this.oid_partner = oid_partner;
        this.dt_order = dt_order;
        this.no_order = no_order;
        this.oid_paybill = oid_paybill;
        this.money_order = money_order;
        this.pay_type = pay_type;
    }

}
