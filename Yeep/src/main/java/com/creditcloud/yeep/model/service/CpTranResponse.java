/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.Status;
import javax.validation.constraints.NotNull;

/**
 * 通用转账记录
 * 
 * @author tinglany
 */
public class CpTranResponse extends BaseObject {
    
    //流水号
    @NotNull
    private String requestNo;
    
    //业务类型
    @NotNull
    private BizType bizType;
    
    //转账总金额
    @NotNull
    private String amount;
    
    //充值状态
    @NotNull
    private Status status;
    
    //处理状态: PROCESSING:处理中。SUCCESS:成功。ERROR:异常。FAIL:失败
    @NotNull
    private Status subStatus;
    
    public CpTranResponse(String requestNo,
                                 BizType bizType,
                                 String amount,
                                 Status status,
                                 Status subStatus) {
        this.requestNo = requestNo;
        this.bizType = bizType;
        this.amount = amount;
        this.status = status;
        this.subStatus = subStatus;
    }
}
