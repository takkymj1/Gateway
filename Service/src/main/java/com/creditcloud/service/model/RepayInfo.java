/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.loan.LoanRepayment;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class RepayInfo extends AbstractRepay {

    private static final long serialVersionUID = 20140804L;

    /**
     * 目前只有提前还款用到此参数,也将用于逾期违约等还款处理
     */
    private RepayType type;

    /**
     * 如果未到还款日还款是否按照提前还款流程走，false则按正常还款流程
     */
    private boolean advanceRepayWhenUndue;

    /**
     * 是否是一组还款中得首期还款
     */
    private boolean firstRepayment;
    
    /**
     * 本期还款总额：本金+利息
     */
    private BigDecimal totalAmount;

    public RepayInfo(LoanRepayment loanRepayment) {
        setLoanRepayment(loanRepayment);
    }

    public RepayInfo(LoanRepayment loanRepayment,
                     FeeConfig feeConfig,
                     RepayType type,
                     boolean advanceRepayWhenUndue) {
        setLoanRepayment(loanRepayment);
        setFeeConfig(feeConfig);
        this.type = type;
        this.advanceRepayWhenUndue = advanceRepayWhenUndue;
    }

    public RepayInfo(LoanRepayment loanRepayment,
                     FeeConfig feeConfig,
                     RepayType type,
                     boolean advanceRepayWhenUndue,
                     boolean firstRepayment) {
        setLoanRepayment(loanRepayment);
        setFeeConfig(feeConfig);
        this.type = type;
        this.advanceRepayWhenUndue = advanceRepayWhenUndue;
        this.firstRepayment = firstRepayment;
    }
    
    public RepayInfo(LoanRepayment loanRepayment,
                     FeeConfig feeConfig,
                     RepayType type,
                     boolean advanceRepayWhenUndue,
                     boolean firstRepayment,
                     BigDecimal totalAmount) {
        setLoanRepayment(loanRepayment);
        setFeeConfig(feeConfig);
        this.type = type;
        this.advanceRepayWhenUndue = advanceRepayWhenUndue;
        this.firstRepayment = firstRepayment;
        this.totalAmount = totalAmount;
    }
}
