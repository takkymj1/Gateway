/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.response;

import com.creditcloud.lianlianpay.base.BaseResponse;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class PayResultResponse extends BaseResponse {

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
    
    //清算日期
    private String settle_date;
    
    //订单描述
    private String info_order;
    
    //支付方式  
    private String pay_type;
    
    //银行编号
    private String bank_code;
    
    //银行名称
    private String bank_name;
    
    //支付备注
    private String memo;
    
    //银行卡号
    private String card_no;

    public PayResultResponse() {
    }

    public PayResultResponse(String result_pay, String oid_partner, String dt_order, String no_order, String oid_paybill, String money_order, String settle_date, String info_order, String pay_type, String bank_code, String bank_name, String memo, String card_no, String ret_code, String ret_msg, String sign_type, String sign) {
        super(ret_code, ret_msg, sign_type, sign);
        this.result_pay = result_pay;
        this.oid_partner = oid_partner;
        this.dt_order = dt_order;
        this.no_order = no_order;
        this.oid_paybill = oid_paybill;
        this.money_order = money_order;
        this.settle_date = settle_date;
        this.info_order = info_order;
        this.pay_type = pay_type;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.memo = memo;
        this.card_no = card_no;
    }
    
}
