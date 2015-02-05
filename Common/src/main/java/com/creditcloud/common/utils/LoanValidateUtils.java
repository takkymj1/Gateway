/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.enums.loan.RepaymentPeriod;
import com.creditcloud.model.loan.Duration;

/**
 *
 * @author chai
 */
public class LoanValidateUtils {
    
    public static ValidateResult validatePeriodAndDuration(RepaymentPeriod period, Duration duration){
        ValidateResult result = new ValidateResult(false, "", "");
        if(period == null){
            result.setSuccess(true);
            return result;
        }
        if(duration == null){
            result.setMessage("持续时间不可为空");
            return result;
        }
        if(duration.getDays() > 0){
            result.setMessage("持续时间包含天，与RepaymentPeriod中任一周期均不匹配");
            return result;
        }
        int totalMonths = duration.getTotalMonths();
        int monthsOfPeriod = period.getMonthsOfPeriod();
        switch (period){
            case Monthly :
                result.setSuccess(true);
                return result;
            default:
                if(totalMonths % monthsOfPeriod == 0){
                    result.setSuccess(true);
                }else{
                    result.setMessage(String.format("还款周期 [%s] 与 持续时间 [%s个月] 不匹配", period.getKey(), totalMonths));
                }
                return result;
        }
    } 
}
