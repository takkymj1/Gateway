/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseNotification;
import javax.validation.constraints.NotNull;

/**
 * 通用转账确认
 *  
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class CompleteTranNtf extends BaseNotification {
    
    //CONFIRM 或者 CANCEL
    @NotNull
    private Status status;
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    public CompleteTranNtf(String platformNo,
                           BizType bizType,
                           String code,
                           String message,
                           Status status,
                           String requestNo) {
        super(platformNo,bizType,code,message);
        this.status =status;
        this.requestNo =requestNo;
    }                                                                                                                                         
}
