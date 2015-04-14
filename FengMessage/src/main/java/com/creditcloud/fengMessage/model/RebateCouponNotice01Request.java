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
public class RebateCouponNotice01Request extends BaseRequest {
    
    private String date;
    
    private String couponAmount;
    
    private String rateLimit;
    
    private String eventName;
    
    public RebateCouponNotice01Request(Date date, String couponAmount, String rateLimit, String eventName){
        this.template_id = "REBATE_COMMON_COUPON_001";
        this.date = DATETIME_FORMATTER.format(date);
        this.couponAmount = couponAmount;
        this.rateLimit = rateLimit;
        this.eventName = eventName;
    }
}    


