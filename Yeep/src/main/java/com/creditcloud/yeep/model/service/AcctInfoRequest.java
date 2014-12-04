/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import lombok.NoArgsConstructor;
/**
 * 账户查询
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class AcctInfoRequest extends UserRequest {
    
    //商户编号
    @NotNull
    private String platformNo;
    
    //平台会员编号
    @NotNull
    private String platformUserNo;
    
    public AcctInfoRequest(String platformUserNo,
                               String platformNo) {
        super(platformUserNo,platformNo,null,null,null,null);   
    }
}
