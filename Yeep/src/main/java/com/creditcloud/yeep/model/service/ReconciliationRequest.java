/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.joda.time.LocalDate;


/**
 * 业务对账
 * 
 * @author tinglany
 */

@XmlRootElement(name = "request")
public class ReconciliationRequest extends BaseRequest {
    
    //日期,yyyy-MM-dd 格式
    @NotNull
    private String date;

    public ReconciliationRequest() {
    }
    
    public ReconciliationRequest(String platformNo,
                                 String date) {
        super(platformNo,null,null,null);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
