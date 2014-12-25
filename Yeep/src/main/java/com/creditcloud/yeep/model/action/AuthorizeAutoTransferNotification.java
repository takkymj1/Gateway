/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserNotification;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.enums.BizType;

/**
 *
 * @author kakaci
 */

public class AuthorizeAutoTransferNotification extends UserNotification {

    public AuthorizeAutoTransferNotification() {
    }

    public AuthorizeAutoTransferNotification(String platformUserNo,
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
        return sb.toString();
    }
}
