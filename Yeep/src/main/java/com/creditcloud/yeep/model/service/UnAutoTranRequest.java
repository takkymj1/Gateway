/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;

/**
 * 取消自动投标授权
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class UnAutoTranRequest extends UserRequest {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    public UnAutoTranRequest(String platformNo,
                             String platformUserNo,
                             String requestNo) {
        super(platformUserNo,platformNo,null,null,null);
        this.requestNo = requestNo;
    }
    
}
