/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.model.BaseNotification;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class RepaymentNotification extends BaseNotification {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    public RepaymentNotification(String platformNo,
                                 BizType bizType, 
                                 String code, 
                                 String message, 
                                 String requestNo, 
                                 String orderNo,
                                 String sign) {
        super(platformNo, bizType, code, message,sign);
        this.requestNo = requestNo;
        this.orderNo = orderNo;
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
