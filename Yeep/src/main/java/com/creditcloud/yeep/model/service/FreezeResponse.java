/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;
/**
 * 资金冻结
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class FreezeResponse extends BaseResponse {

    public FreezeResponse(String platformNo,
                          String code,
                          String description) {
        super(platformNo,code,description);
    }  
}
