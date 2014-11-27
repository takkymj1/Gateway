/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
/**
 *
 * @author kakaci
 */
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorizeAutoRepaymentNotification extends UserNotification {

    public AuthorizeAutoRepaymentNotification(String platformUserNo,
                                              String platformNo,
                                              BizType bizType,
                                              String code,
                                              String message) {
        super(platformUserNo, platformNo, bizType, code, message);
    }
}
