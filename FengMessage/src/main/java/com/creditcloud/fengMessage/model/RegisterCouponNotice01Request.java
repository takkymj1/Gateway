/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fengMessage.model;

import com.creditcloud.fengMessage.model.base.BaseRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author caojiadong
 */
@Data
@NoArgsConstructor
public class RegisterCouponNotice01Request extends BaseRequest {
    
    public String date;
    
    public String couponAmount;
    
    public String investAmount;
    
    public RegisterCouponNotice01Request(String date, String couponAmount, String investAmount){
        this.template_id = "REGISTER_COUPON_001";
        this.date = date;
        this.couponAmount = couponAmount;
        this.investAmount = investAmount;
    }    
}
