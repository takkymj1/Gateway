/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

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
    private String status;
    
    //请求流水号
    @NotNull
    private String requestNo;

    public CompleteTransferNotify() {
    }
    
    public CompleteTransferNotify(String platformNo,
                                  String bizType,
                                  String code,
                                  String message,
                                  String status,
                                  String requestNo,
                                  String sign) {
        super(platformNo,bizType,code,message,sign);
        this.status =status;
        this.requestNo =requestNo;
    } 

    public String getStatus() {
        return status;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
}
