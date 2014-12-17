/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseNotification;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class AutoRepaymentNotification extends BaseNotification {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //标的号
    @NotNull
    private String orderNo;
    
    public AutoRepaymentNotification(String platformNo,
                                     BizType bizType,
                                     String code,
                                     String message,
                                     String requestNo,
                                     String orderNo,
                                     String sign) {
        super(platformNo,bizType,code,message,sign);    
    } 

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(orderNo));
        return sb.toString();
    }
}
