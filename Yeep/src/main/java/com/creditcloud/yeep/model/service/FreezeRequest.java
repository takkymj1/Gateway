/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
/**
 * 资金冻结
 * 
 * @author tinglany
 */
//@Data
//@NoArgsConstructor
public class FreezeRequest extends UserRequest {
  

    
    //冻结金额
    @NotNull
    private String amount; 
    
    //到期自动解冻
    @NotNull
    private String expired; 
    
    public FreezeRequest(String platformNo,
                         String platformUserNo,
                         String requestNo,
                         String amount,
                         String expired) {
        super(platformUserNo,platformNo,null,requestNo,null,null);
        this.amount = amount;
        this.expired = expired;
    }   
}
