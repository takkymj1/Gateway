/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.Status;
import com.creditcloud.yeep.model.BaseRequest;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;

/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class RechargeRecordResponse extends BaseResponse {
    
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
                                  Status status,
                                  String sign) {
        this.amount = amount;
        this.UserNo = UserNo;
        this.createTime = createTime;
        this.status = status;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(UserNo))
                .append(StringUtils.trimToEmpty(createTime.toString()))
                .append(StringUtils.trimToEmpty(status.name()));
        return sb.toString();
    }    
}
