/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "notify")
public class EnterpiseRegisterNotify extends UserNotification {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public EnterpiseRegisterNotify() {
    }

    public EnterpiseRegisterNotify(String platformNo,
                                   BizType bizType,
                                   String code,
                                   String message,
                                   String requestNo,
                                   String platformUserNo) {
        super(platformUserNo, platformNo, bizType, code, message);
        this.requestNo = requestNo;
    }

    public String getRequestNo() {
        return requestNo;
    }  
}
