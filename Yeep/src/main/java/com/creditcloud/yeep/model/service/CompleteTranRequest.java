/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;

/**
 * 通用转账确认
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class CompleteTranRequest extends BaseRequest {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //CONFIRM 表示解冻后完成资金划转,CANCEL 表示解冻后取消转账
    @NotNull
    private Status mode; 
    
    public CompleteTranRequest(String platformNo,
                               String requestNo,
                               Status mode,
                               String notifyUrl) {
        super(platformNo,null,notifyUrl,null);
        this.requestNo = requestNo;
        this.mode = mode;
    }
    
}
