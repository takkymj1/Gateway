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
public class CardDetailResponse extends BaseResponse {
    
    //所属银行编号
    private String bank_code;
    
    //所属银行名称
    private String bank_name;
    
    //银行卡类型
    private String card_type;

    public CardDetailResponse() {
    }

    public CardDetailResponse(String bank_code, String bank_name, String card_type, String ret_code, String ret_msg, String sign_type, String sign) {
        super(ret_code, ret_msg, sign_type, sign);
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.card_type = card_type;
    }
      
}
