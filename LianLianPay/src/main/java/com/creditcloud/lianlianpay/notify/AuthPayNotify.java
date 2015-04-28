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
    
    //商户编号
    @NotNull
    private String oid_partner;
    
    //签名方式
    @NotNull
    private String sign_type;
    
    //签名
    @NotNull
    private String sign;
    
    //商户订单时间
    @NotNull
    private String dt_order;
    
    //商户唯一订单号
    @NotNull
    private String no_order;
    
    //连连支付支付单号
    @NotNull
    private String oid_paybill;
 
    //交易金额
    @NotNull
    private String money_order;
    
    //支付结果
    @NotNull
    private String result_pay;
    
    //清算日期
    private String settle_date;
    
    //订单描述
    private String info_order;
    
    //支付方式
    @NotNull
    private String pay_type;
    
    //银行编号
    private String bank_code;
    
    //签约协议号
    private String no_agree;
    
    //证件类型
    private String id_type;
    
    //证件号码
    private String id_no;
    
    //银行账号姓名
    private String acct_name;
    
    //银行卡号
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
