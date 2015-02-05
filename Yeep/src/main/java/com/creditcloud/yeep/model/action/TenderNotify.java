/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */
@XmlRootElement(name = "notify")
public class TenderNotify extends BaseNotification {
    
    @NotNull
    private String requestNo;

    public TenderNotify() {
    }

    public TenderNotify(String requestNo, String platformNo, BizType bizType, String code, String message) {
        super(platformNo, bizType, code, message);
        this.requestNo = requestNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
    
}
