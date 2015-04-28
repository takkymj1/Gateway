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
public class CardDetail extends BaseObject {
    
    //交易结果代码
    private String ret_code;
    
    //交易结果描述
    private String ret_msg;
    
    //签名方式
    private String sign_type;
    
    //签名
    private String sign;
    
    //所属银行编号
    private String bank_code;
    
    //所属银行名称
    private String bank_name;
    
    //银行卡
    private String card_type;

    public CardDetail() {
    }

    public CardDetail(String ret_code, 
                      String ret_msg, 
                      String sign_type, 
                      String sign, 
                      String bank_code, 
                      String bank_name, 
                      String card_type) {
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
        this.sign_type = sign_type;
        this.sign = sign;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.card_type = card_type;
    }   
    
}
