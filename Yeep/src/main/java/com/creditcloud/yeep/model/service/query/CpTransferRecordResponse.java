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
 * 通用转账记录
 * 
 * @author tinglany
 */
@XmlRootElement (name = "response")
public class CpTransferRecordResponse extends BaseResponse {
    
    @NotNull
    private List<CpTransferRecord> records;

    public CpTransferRecordResponse() {
    }

    public CpTransferRecordResponse(String platformNo, String code, String description,List<CpTransferRecord> records) {
        super(platformNo, code, description);
        this.records = records;
    }
 
    @XmlElementWrapper(name="records")
    @XmlElement(name="record") 
    public List<CpTransferRecord> getRecords() {
        return records;
    }

    public void setRecords(List<CpTransferRecord> records) {
        this.records = records;
    }

   
}
