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
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class AuthorizeAutoTransferNotification extends UserNotification {

    public AuthorizeAutoTransferNotification(String platformUserNo,
                                             String platformNo,
                                             BizType bizType,
                                             String code,
                                             String message) {
        super(platformUserNo, platformNo, bizType, code, message);
    }
}
