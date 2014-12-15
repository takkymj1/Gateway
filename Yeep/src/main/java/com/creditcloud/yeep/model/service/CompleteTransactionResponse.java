/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;

/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class CompleteTransactionResponse extends BaseResponse {
    
    public CompleteTransactionResponse(String platformNo,
                                       String code,
                                       String description,
                                       String sign) {
        super(platformNo,code,description,sign);
    } 
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString());
        return sb.toString();
    }    
}
