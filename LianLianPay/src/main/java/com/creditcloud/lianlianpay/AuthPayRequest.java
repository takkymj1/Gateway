/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay;

import com.creditcloud.lianlianpay.base.BaseRequest;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tinglany
 */
public class AuthPayRequest extends BaseRequest {

    @NotNull
    private String version;
  
    @NotNull
    private String user_id; 
    
    private String platform;    
    
    @NotNull
    private String app_request;

    @NotNull
    private String busi_partner;    

    @NotNull
    private String no_order; 

    @NotNull
    private String dt_order;
    
    @NotNull
    private String name_goods;
    
    private String info_order;
    
    @NotNull
    private String money_order;
    
    @NotNull
    private String notify_url;  
    
    private String url_return; 
    
    private String no_agree;
    
    private String valid_order;
    
    //证件类型
    @NotNull
    private String id_type;
    
    //证件号码
    @NotNull
    private String id_no;
    
    //银行账号姓名
    @NotNull
    private String acct_name;
    
    
    @NotNull
    private String shareing_data; 
    
    @NotNull
    private String risk_item;
    
    @NotNull
    private String card_no;
 
    @NotNull
    private String sign;  

    public AuthPayRequest() {
    }

    public AuthPayRequest(String version, 
                          String oid_partner, 
                          String user_id, 
                          String platform, 
                          String app_request, 
                          String sign_type, 
                          String sign, 
                          String busi_partner, 
                          String no_order, 
                          String dt_order, 
                          String name_goods, 
                          String info_order, 
                          String money_order, 
                          String notify_url,
                          String url_return,
                          String no_agree,
                          String valid_order,
                          String id_type,
                          String id_no,
                          String acct_name,
                          String shareing_data,
                          String risk_item,
                          String card_no)  {
        super(oid_partner, sign_type, sign);
        this.version = version;
        this.user_id = user_id;
        this.platform = platform;
        this.app_request = app_request;
        this.busi_partner = busi_partner;
        this.no_order = no_order;
        this.dt_order = dt_order;
        this.name_goods = name_goods;
        this.info_order = info_order;
        this.money_order = money_order;
        this.notify_url = notify_url;
        this.url_return = url_return;
        this.no_agree = no_agree;
        this.valid_order = valid_order;
        this.id_type = id_type;
        this.id_no = id_no;
        this.acct_name = acct_name;
        this.shareing_data = shareing_data;
        this.risk_item = risk_item;
        this.card_no = card_no;
        this.sign = sign;
    }   
}

