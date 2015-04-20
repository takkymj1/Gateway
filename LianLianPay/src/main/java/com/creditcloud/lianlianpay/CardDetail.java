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
    
    private String ret_code;
    
    private String ret_msg;
    
    private String sign_type;
    
    private String sign;
    
    private String bank_code;
    
    private String bank_name;
    
    private String card_type;

    public CardDetail() {
    }

    public CardDetail(String ret_code, String ret_msg, String sign_type, String sign, String bank_code, String bank_name, String card_type) {
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
        this.sign_type = sign_type;
        this.sign = sign;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.card_type = card_type;
    }   
    
}
