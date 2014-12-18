/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class AuthorizeAutoRepaymentRequest extends UserRequest {
  
    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    public AuthorizeAutoRepaymentRequest(String platformUserNo,
                                         String platformNo,
                                         String callbackUrl,
                                         String notifyUrl,
                                         String requestNo,
                                         String orderNo,
                                         String sign) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl,sign);
        this.orderNo = orderNo;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo));
        return sb.toString();
    }
}
