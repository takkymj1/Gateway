/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model.task;

import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanRequestAssignType;
import com.creditcloud.model.enums.loan.PreRepaymentPenaltyInterestType;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.InvestRule;
import java.math.BigDecimal;
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
     * 借款用途
     */
    private LoanPurpose loanPurpose;
    
    /**
     * 所属产品分类的Key
     */
    private String productKey;

    /**
     * 担保机构企业名称
     */
    private String guaranteeName;
    
    /**
     * 借款说明
     */
    private String loanDescription;
    
    /**
     * 借款合同名称
     */
    private String loanContractTemplateName;
    
    /**
     * 居间服务协议模板名称
     */
    private String brokerageContractTemplateName;
    
    /**
     * 担保费率
     */
    private BigDecimal loanGuaranteeFee;

    /**
     * 服务费率
     */
    private BigDecimal loanServiceFee;
    
    /**
     * 综合利率（万分之几）
     */
    private int comprehensiveRate;

    /**
     * 可转让属性
     */
    private LoanRequestAssignType assignable;
    
    /**
     * 提前还款罚息
     */
    private PreRepaymentPenaltyInterestType penaltyInterestType;
}
