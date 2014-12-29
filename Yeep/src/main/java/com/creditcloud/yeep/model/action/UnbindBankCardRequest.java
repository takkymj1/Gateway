/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */
@XmlRootElement (name = "request")
public class UnbindBankCardRequest extends UserRequest {

    
    public UnbindBankCardRequest() {
    }

    public UnbindBankCardRequest(String platformUserNo,
                                 String platformNo,
                                 String callbackUrl,
                                 String sign,
                                 String requestNo) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, null,sign);
    }

    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString());
        return sb.toString();
    }
}

