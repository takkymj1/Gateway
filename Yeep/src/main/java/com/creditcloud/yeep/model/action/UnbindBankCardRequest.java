/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.model.UserRequest;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class UnbindBankCardRequest extends UserRequest {

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
