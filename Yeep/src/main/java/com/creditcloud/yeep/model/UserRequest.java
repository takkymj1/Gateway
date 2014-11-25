/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class UserRequest extends BaseRequest {

    //平台用户编号
    @NotNull
    private String platformUserNo;

    public UserRequest(String platformUserNo,
                       String platformNo,
                       String callbackUrl,
                       String notifyUrl,
                       String sign) {
        super(platformNo, callbackUrl, notifyUrl, sign);
        this.platformUserNo = platformUserNo;
    }
}
