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
 * @author kakaci
 */
@XmlRootElement(name = "request")
public class ResetPasswordRequest extends UserRequest {

    public ResetPasswordRequest() {
    }


    public ResetPasswordRequest(String requestNo,
                                String platformNo,
                                String platformUserNo,
                                String callbackUrl) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, null);
    }

}
