/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class ResetPasswordRequest extends UserRequest {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public ResetPasswordRequest(String platformUserNo,
                                String platformNo,
                                String callbackUrl,
                                String sign,
                                String requestNo) {
        super(platformUserNo, platformNo, callbackUrl, null, sign);
        this.requestNo = requestNo;
    }
}
