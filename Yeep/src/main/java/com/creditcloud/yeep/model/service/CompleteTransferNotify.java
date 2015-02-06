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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 通用转账确认回调
 *  
 * @author tinglany
 */

@XmlRootElement(name ="notify")
public class CompleteTransferNotify extends BaseNotification {
    
    //CONFIRM 或者 CANCEL
    @NotNull
    private Status status;
    
    //请求流水号
    @NotNull
    private String requestNo;

    public CompleteTransferNotify() {
    }
    
    public CompleteTransferNotify(String platformNo,
                                  BizType bizType,
                                  String code,
                                  String message,
                                  Status status,
                                  String requestNo) {
        super(platformNo,bizType,code,message);
        this.status =status;
        this.requestNo =requestNo;
    } 

    public Status getStatus() {
        return status;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
}
