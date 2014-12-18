/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 * 通用转账确认
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class CompleteTransactionRequest extends BaseRequest {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //CONFIRM 表示解冻后完成资金划转,CANCEL 表示解冻后取消转账
    @NotNull
    private Status mode; 
    
    public CompleteTransactionRequest(String platformNo,
                                      String requestNo,
                                      Status mode,
                                      String notifyUrl,
                                      String sign) {
        super(platformNo,null,notifyUrl,null,sign);
        this.requestNo = requestNo;
        this.mode = mode;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(mode.name()));
        return sb.toString();
    }    
}
