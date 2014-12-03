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
                                         String orderNo) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl);
        this.orderNo = orderNo;
    }
}
