/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.response;

import com.creditcloud.model.BaseObject;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class AuthPayReturn extends BaseObject {
    
    //签名方式
    private String sign_type;
    
    //签名
    private String sign;
    
    //商户编号
    private String oid_partner;
    
    //商户订单时间
    private String dt_order;
    
    //商户唯一订单号
    private String no_order;
    
    //连连支付支付单 号
    private String oid_paybill;
    
    //支付结果
    private String result_pay;
    
    //交易金额
    private String money_order;
    
    //清算日期
    private String settle_date;

    public AuthPayReturn() {
    }

    public AuthPayReturn(String sign_type, String sign, String oid_partner, String dt_order, String no_order, String oid_paybill, String result_pay, String money_order, String settle_date) {
        this.sign_type = sign_type;
        this.sign = sign;
        this.oid_partner = oid_partner;
        this.dt_order = dt_order;
        this.no_order = no_order;
        this.oid_paybill = oid_paybill;
        this.result_pay = result_pay;
        this.money_order = money_order;
        this.settle_date = settle_date;
    }
    
    
}
