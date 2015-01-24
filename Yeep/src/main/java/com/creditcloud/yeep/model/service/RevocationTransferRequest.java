/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import com.creditcloud.yeep.model.UserRequest;
/**
 * 取消投标
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class RevocationTransferRequest extends UserRequest {
    
    
    public RevocationTransferRequest(String platformNo,
                                     String requestNo,
                                     String platformUserNo) {
        super(platformUserNo,platformNo,null,requestNo,null,null);
    }

}
