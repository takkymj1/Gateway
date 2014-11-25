/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;

/**
 * 取消投标
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class RevocationTransferResponse extends BaseResponse {
    
    public RevocationTransferResponse(String platfomNo,
                                      String code,
                                      String description) {
        super(platfomNo,code,description);
    }    
}
