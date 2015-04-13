/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fengMessage.model;

import com.creditcloud.fengMessage.model.base.BaseRequest;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jiaguangfu
 */
@Data
@NoArgsConstructor
public class WechatLotteryCouponNotice02Request extends BaseRequest {
    
    private String date;
    
    private String couponAmount;
    
    private String rateLimit;
    
    public WechatLotteryCouponNotice02Request(Date date, String couponAmount, String rateLimit){
        this.template_id = "WECHAT_LOTTERY_COUPON_002";
        this.date = DATE_FORMATTER.format(date);
        this.couponAmount = couponAmount;
        this.rateLimit = rateLimit;
    } 
}    

