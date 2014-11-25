/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
/**
 * 取消投标
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class RevocationTransferRequest extends UserRequest {
    
    //之前投标的请求流水号
    @NotNull
    private String requestNo;
    
    public RevocationTransferRequest(String platformNo,
                                     String requestNo,
                                     String platformUserNo) {
        super(platformUserNo,platformNo,null,null,null);
        this.requestNo = requestNo;
    }   
}
