/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import com.creditcloud.yeep.model.UserRequest;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 资金冻结
 * 
 * @author tinglany
 */
@XmlRootElement (name = "request")
public class FreezeRequest extends UserRequest {
  
    //冻结金额
    @NotNull
    private BigDecimal amount; 
    
    //到期自动解冻
    @NotNull
    private String expired; 

    public FreezeRequest() {
    }
    
    public FreezeRequest(String platformNo,
                         String platformUserNo,
                         String requestNo,
                         BigDecimal amount,
                         String expired) {
        super(platformUserNo,platformNo,null,requestNo,null,null);
        this.amount = amount;
        this.expired = expired;
    } 

    public BigDecimal getAmount() {
        return amount;
    }

    public String getExpired() {
        return expired;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }
 
}
