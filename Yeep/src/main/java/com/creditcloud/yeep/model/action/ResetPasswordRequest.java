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
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class ResetPasswordRequest extends UserRequest {


    public ResetPasswordRequest(String platformUserNo,
                                String platformNo,
                                String callbackUrl,
                                String requestNo) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, null);
    }

}
