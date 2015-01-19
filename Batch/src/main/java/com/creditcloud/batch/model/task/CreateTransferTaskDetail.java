/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model.task;

import com.creditcloud.model.constraints.MobileNumber;
import javax.validation.constraints.NotNull;
import lombok.Value;

/**
 * 批量转账任务
 * 
 * @author keven
 */
@Value
public class CreateTransferTaskDetail {
    
    /**
     * 转入用户手机号
     */
    @NotNull
    @MobileNumber
    private String mobile;
    
    /**
     * 转账金额
     */
    @NotNull
    private String amount;
}
