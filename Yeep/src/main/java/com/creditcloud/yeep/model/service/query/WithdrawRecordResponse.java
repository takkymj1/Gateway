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
public class WithdrawRecordResponse extends BaseResponse {
    
    @NotNull
    private List<WithdrawRecord> records;
    

    public WithdrawRecordResponse() {
    }

    public WithdrawRecordResponse(List<WithdrawRecord> records, String platformNo, String code, String description) {
        super(platformNo, code, description);
        this.records = records;
    }

    @XmlElementWrapper(name="records")
    @XmlElement(name="record") 
    public List<WithdrawRecord> getRecords() {
        return records;
    }

    public void setRecords(List<WithdrawRecord> records) {
        this.records = records;
    }
   
      
}
