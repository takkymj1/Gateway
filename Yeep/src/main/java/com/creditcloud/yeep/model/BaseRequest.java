/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public abstract class BaseRequest extends BaseObject {

    //商户编号
    @NotNull
    private String platformNo;

    //页面回跳 URL
    @NotNull
    private String callbackUrl;

    //服务器通知 URL
    @NotNull
    private String notifyUrl;
    
    @NotNull
    private String sign;

    public BaseRequest(String platformNo,
                       String callbackUrl,
                       String notifyUrl, 
                       String sign) {
        this.platformNo = platformNo;
        this.callbackUrl = callbackUrl;
        this.notifyUrl = notifyUrl;
        this.sign = sign;
    }
}
