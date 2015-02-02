/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service.query;

import com.creditcloud.yeep.model.BaseResponse;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */

@XmlRootElement (name = "response")
public class RechargeRecordResponse extends BaseResponse {
    
    @NotNull
    private List<RechargeRecord> records;

    public RechargeRecordResponse() {
    }

    public RechargeRecordResponse(List<RechargeRecord> records, String platformNo, String code, String description) {
        super(platformNo, code, description);
        this.records = records;
    }

    @XmlElementWrapper(name="records")
    @XmlElement(name="record") 
    public List<RechargeRecord> getRecords() {
        return records;
    }

    public void setRecords(List<RechargeRecord> records) {
        this.records = records;
    }   
   
}
