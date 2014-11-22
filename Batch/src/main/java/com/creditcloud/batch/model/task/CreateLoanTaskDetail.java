/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model.task;

import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.InvestRule;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import lombok.Value;

/**
 *
 * @author sobranie
 */
@Value
public class CreateLoanTaskDetail {

    @NotNull
    @MobileNumber
    private String mobile;

    @IncrementalInteger(min = LoanConstant.MIN_LOAN_AMOUNT,
                        increment = LoanConstant.LOAN_AMOUNT_INCREMENT,
                        max = LoanConstant.MAX_LOAN_AMOUNT,
                        groups = Default.class)
    private int amount;
    
    /**
     * 年化利率（万分之几）
     */
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_RATE,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_RATE,
                        groups = Default.class)
    private int rate;
    
    @NotNull
    private Duration duration;
    
    @NotNull
    private RepaymentMethod method;
    
    /**
     * 借款唯一号
     */
    @Size(max = LoanConstant.MAX_LOAN_REQUEST_SERIAL)
    private String serial;
    
    @NotNull
    private InvestRule investRule;
    
    @NotNull
    private String title;
    
    /**
     * 所属产品分类的Key
     */
    private String productKey;
    
    /**
     * 经过车辆认证
     */
    private boolean hasVehicle;
    
    /**
     * 经过房产认证
     */
    private boolean hasRealestate;
    
    /**
     * 借款协议模板Id
     */
    private String contractTemplateId;
    
    /**
     * 居间服务协议模板Id
     */
    private String brokerageContractTemplateId;
}
