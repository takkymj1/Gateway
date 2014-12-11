/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseRequest;
/**
 * 资金解冻
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class UnFreezeRequest extends BaseRequest {
    
    //冻结时的请求流水号
    @NotNull
    private String freezeRequestNo;
    
    public UnFreezeRequest(String platformNo,
                           String freezeRequestNo) {
        super(platformNo,null,null,null);
        this.freezeRequestNo = freezeRequestNo;
    }
    
}
