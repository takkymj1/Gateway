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

    private String result_pay;

    private String oid_partner;

    private String dt_order;
    
    private String no_order;
    
    private String oid_paybill;
    
    private String money_order;
    
    private String settle_date;
    
    private String info_order;
    
    private String pay_type;
    
    private String bank_code;
    
    private String bank_name;
    
    private String memo;
    
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
