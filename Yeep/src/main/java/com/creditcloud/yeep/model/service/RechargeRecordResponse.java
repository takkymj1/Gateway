/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.Status;
import javax.validation.constraints.NotNull;
import org.joda.time.LocalDate;

/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class RechargeRecordResponse {
    
    //充值金额
    @NotNull
    private String amount;
    
    //充值用户
    @NotNull
    private String UserNo;
    
    //充值时间
    @NotNull
    private LocalDate createTime;
    
    //充值状态
    @NotNull
    private Status status;
    
    public RechargeRecordResponse(String amount,
                                  String UserNo,
                                  LocalDate createTime,
                                  Status status) {
        this.amount = amount;
        this.UserNo = UserNo;
        this.createTime = createTime;
        this.status = status;
    }  
}
