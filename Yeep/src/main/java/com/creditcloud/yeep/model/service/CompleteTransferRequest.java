/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 通用转账确认
 * 
 * @author tinglany
 */

@XmlRootElement(name = "request")
public class CompleteTransferRequest extends BaseRequest {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //CONFIRM 表示解冻后完成资金划转,CANCEL 表示解冻后取消转账
    @NotNull
    private String mode; 

    public CompleteTransferRequest() {
    }
    
    public CompleteTransferRequest(String platformNo,
                                      String requestNo,
                                      String mode,
                                      String notifyUrl) {
        super(platformNo,null,notifyUrl,null);
        this.requestNo = requestNo;
        this.mode = mode;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getMode() {
        return mode;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
     
}
