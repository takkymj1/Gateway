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
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class CompleteTransactionNotification extends BaseNotification {
    
    //CONFIRM 或者 CANCEL
    @NotNull
    private Status status;
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    public CompleteTransactionNotification(String platformNo,
                                           String bizType,
                                           String code,
                                           String message,
                                           Status status,
                                           String requestNo,
                                           String sign) {
        super(platformNo,bizType,code,message,sign);
        this.status =status;
        this.requestNo =requestNo;
    } 
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(status.name()))
                .append(StringUtils.trimToEmpty(requestNo));
        return sb.toString();
    }
}
