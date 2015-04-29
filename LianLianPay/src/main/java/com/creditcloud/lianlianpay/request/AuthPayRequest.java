/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.request;

import com.creditcloud.lianlianpay.base.BaseRequest;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class AuthPayRequest extends BaseRequest {

    //版本号
    @NotNull
    private String version;
  
    //商户用户唯一编号
    @NotNull
    private String user_id; 
    
    //平台来源标示
    private String platform;    
    
    //请求应用标识
    @NotNull
    private String app_request;

    //商户业务类型
    @NotNull
    private String busi_partner;    

    //商户唯一订单号
    @NotNull
    private String no_order; 

    //商户订单时间
    @NotNull
    private String dt_order;
    
    //商品名称
    @NotNull
    private String name_goods;
    
    //订单描述
    private String info_order;
    
    //交易金额
    @NotNull
    private String money_order;
    
    //服务器异步通知地址
    @NotNull
    private String notify_url;  
    
    //支 付 结 束 回 显 url
    private String url_return; 
    
    //签约协议号
    private String no_agree;
    
    //订单有效时间
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
    
    //分帐信息数据
    @NotNull
    private String shareing_data; 
    
    //风险控制参数
    @NotNull
    private String risk_item;
    
    //银行卡号
    @NotNull
    private String card_no;
 
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
    }   
}

