/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class AuthPayRequest extends BaseObject {

    @NotNull
    private String realName;
    
    @NotNull
    private String app_request;

    @NotNull
    private String busi_partner;    

    @NotNull
    private String card_no;
    
    @NotNull
    private String dt_order;
    
    @NotNull
    private String id_no;
    
    @NotNull
    private String money_order;
    
    @NotNull
    private String no_order;  
    
    @NotNull
    private String notify_url;  
    
    @NotNull
    private String oid_partner; 
    
    @NotNull
    private String sign_type;
    
    @NotNull
    private String url_return;
    
    @NotNull
    private String user_id;  
    
//    @NotNull
//    private String key; 
    
    @NotNull
    private String sign;  

    public AuthPayRequest() {
    }

    public AuthPayRequest(String realName, 
                          String app_request, 
                          String busi_partner, 
                          String card_no, 
                          String dt_order, 
                          String id_no, 
                          String money_order, 
                          String no_order, 
                          String notify_url, 
                          String oid_partner, 
                          String sign_type, 
                          String url_return, 
                          String user_id, 
                          String sign) {
        this.realName = realName;
        this.app_request = app_request;
        this.busi_partner = busi_partner;
        this.card_no = card_no;
        this.dt_order = dt_order;
        this.id_no = id_no;
        this.money_order = money_order;
        this.no_order = no_order;
        this.notify_url = notify_url;
        this.oid_partner = oid_partner;
        this.sign_type = sign_type;
        this.url_return = url_return;
        this.user_id = user_id;
        this.sign = sign;
    }
    
    
}

