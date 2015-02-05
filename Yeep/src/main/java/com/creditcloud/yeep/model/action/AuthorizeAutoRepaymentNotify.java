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


@XmlRootElement (name = "notify")
public class AuthorizeAutoRepaymentNotify extends UserNotification {

    public AuthorizeAutoRepaymentNotify() {
    }

    public AuthorizeAutoRepaymentNotify(String platformUserNo,
                                        String platformNo,
                                        BizType bizType,
                                        String code,
                                        String message) {
        super(platformUserNo, platformNo, bizType, code, message);
    }

}
