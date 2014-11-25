/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class ReconciliationResponse extends BaseResponse {
    
    //记录列表
    @NotNull
    private String records;
    
    //业务类型,枚举值:
    @NotNull
    private BizType bizType;
    
    //易宝收取手续费
    @NotNull
    private String fee;
    
    //商户平台收取分润
    @NotNull
    private String balance;
    
    //业务金额
    @NotNull
    private String amount;
    
    public ReconciliationResponse(String platformNo,
                                  String code,
                                  String description,
                                  String records,
                                  BizType bizType,
                                  String fee,
                                  String balance,
                                  String amount) {
        super(platformNo,code,description);
        this.records = records;
        this.bizType = bizType;
        this.fee = fee;
        this.balance = balance;
        this.amount = amount;
    }    
}
