/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tinglany
 */
@XmlRootElement (name = "request")
public class AuthorizeAutoRepayRequest extends UserRequest {
  
    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    public AuthorizeAutoRepayRequest() {
    }

    public AuthorizeAutoRepayRequest(String platformNo,
                                     String platformUserNo,
                                     String requestNo,
                                     String orderNo,
                                     String callbackUrl,
                                     String notifyUrl,  
                                     String sign) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl,sign);
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
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
