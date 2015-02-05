/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.ServiceType;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */

@XmlRootElement(name = "response")
public class authorCpTransferResponse extends BaseResponse {
 
    //请求流水号
    @NotNull
    private String requestNo;
    
    //请求流水号
    @NotNull
    private ServiceType service;
    
    public authorCpTransferResponse() {
    }

    public authorCpTransferResponse(String platformNo, 
                                    String requestNo, 
                                    ServiceType service, 
                                    String code, 
                                    String description) {
        super(platformNo, code, description);
        this.requestNo = requestNo;
        this.service =service;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public ServiceType getService() {
        return service;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setService(ServiceType service) {
        this.service = service;
    }  
       
}
