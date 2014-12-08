/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class BindBankCardRequest extends UserRequest {

    public BindBankCardRequest(String platformNo,
                               String requestNo,
                               String notifyUrl,
                               String callbackUrl,
                               String sign,
                               String platformUserNo) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl);
    }
}