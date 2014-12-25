/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author kakaci
 */


@XmlRootElement (name = "response")
public class AuthorizeAutoRepaymentNotification extends UserNotification {

    public AuthorizeAutoRepaymentNotification() {
    }

    public AuthorizeAutoRepaymentNotification(String platformUserNo,
                                              String platformNo,
                                              String bizType,
                                              String code,
                                              String message,
                                              String sign) {
        super(platformUserNo, platformNo, bizType, code, message,sign);
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString());
        return sb.toString();
    }
}
