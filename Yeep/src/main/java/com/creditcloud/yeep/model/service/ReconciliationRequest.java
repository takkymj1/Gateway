/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import org.joda.time.LocalDate;


/**
 * 业务对账
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class ReconciliationRequest extends BaseRequest {
    
    //日期,yyyy-MM-dd 格式
    @NotNull
    private LocalDate date;
    
    public ReconciliationRequest(String platformNo,
                                 LocalDate date) {
        super(platformNo,null,null,null);
        this.date = date;
    }   
}
