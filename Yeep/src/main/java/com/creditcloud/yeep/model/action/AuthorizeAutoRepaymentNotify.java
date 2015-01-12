/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserNotification;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author kakaci
 */


@XmlRootElement (name = "notify")
public class AuthorizeAutoRepaymentNotify extends UserNotification {

    public AuthorizeAutoRepaymentNotify() {
    }

    public AuthorizeAutoRepaymentNotify(String platformUserNo,
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
