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

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class AuthorizeAutoRepaymentRequest extends UserRequest {
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

    public AuthorizeAutoRepaymentRequest(String platformUserNo,
                                         String platformNo,
                                         String callbackUrl,
                                         String notifyUrl,
                                         String sign,
                                         String requestNo,
                                         String orderNo) {
        super(platformUserNo, platformNo, callbackUrl, notifyUrl, sign);
        this.requestNo = requestNo;
        this.orderNo = orderNo;
    }
}
