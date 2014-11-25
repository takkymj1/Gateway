/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;

/**
 * 取消自动投标授权
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class UnAutoTranResponse extends BaseResponse {
    
    public UnAutoTranResponse(String platformNo,
                              String code,
                              String description) {
        super(platformNo,code,description);
    }    
}
