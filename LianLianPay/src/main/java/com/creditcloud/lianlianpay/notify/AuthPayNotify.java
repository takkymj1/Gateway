/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.notify;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class AuthPayNotify extends BaseObject {
    
    @NotNull
    private String oid_partner;
    
    @NotNull
    private String sign_type;
    
    @NotNull
    private String sign;
    
    @NotNull
    private String dt_order;
    
    @NotNull
    private String no_order;
    
    @NotNull
    private String oid_paybill;
 
    @NotNull
    private String money_order;
    
    @NotNull
    private String result_pay;
    
    private String settle_date;
    
    private String info_order;
    
    @NotNull
    private String pay_type;
    
    private String bank_code;
    
    private String no_agree;
    
    private String id_type;
    
    private String id_no;
    
    private String acct_name;
    
    private String card_no;

    public AuthPayNotify() {
    }

    public AuthPayNotify(String oid_partner, String sign_type, String sign, String dt_order, String no_order, String oid_paybill, String money_order, String result_pay, String settle_date, String info_order, String pay_type, String bank_code, String no_agree, String id_type, String id_no, String acct_name, String card_no) {
        this.oid_partner = oid_partner;
        this.sign_type = sign_type;
        this.sign = sign;
        this.dt_order = dt_order;
        this.no_order = no_order;
        this.oid_paybill = oid_paybill;
        this.money_order = money_order;
        this.result_pay = result_pay;
        this.settle_date = settle_date;
        this.info_order = info_order;
        this.pay_type = pay_type;
        this.bank_code = bank_code;
        this.no_agree = no_agree;
        this.id_type = id_type;
        this.id_no = id_no;
        this.acct_name = acct_name;
        this.card_no = card_no;
    }   
    
}
