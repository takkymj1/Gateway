/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.request;

import com.creditcloud.lianlianpay.base.BaseRequest;

/**
 *
 * @author tinglany
 */
public class CardDetailRequest extends BaseRequest {
    
    private String card_no;

    public CardDetailRequest() {
    }

    public CardDetailRequest(String card_no, String oid_partner, String sign_type, String sign) {
        super(oid_partner, sign_type, sign);
        this.card_no = card_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
    
}
