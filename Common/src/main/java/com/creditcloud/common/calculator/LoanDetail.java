/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loanRequest.LoanRequestMethod;
import com.creditcloud.model.misc.Duration;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sobranie
 */
public class LoanDetail extends BaseObject {

    /**
     * 本金
     */
    private final BigDecimal principal;

    /**
     * 利息
     */
    private final BigDecimal interest;

    /**
     * 借款时间
     */
    private final Duration duration;
    
    /**
     * 还款方式
     */
    private final LoanRequestMethod method;
    
    /**
     * 还款明细，包含期数
     */
    private final List<Repayment> repayments;

    public LoanDetail(BigDecimal principal,
                      BigDecimal interest, 
                      Duration duration, 
                      LoanRequestMethod method) {
        this.principal = principal;
        this.interest = interest;
        this.duration = duration;
        this.method = method;
        repayments = new ArrayList<>();
    }
    
    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public Duration getDuration() {
        return duration;
    }

    public LoanRequestMethod getMethod() {
        return method;
    }

    public List<Repayment> getRepayments() {
        return repayments;
    }
    
    public static class Repayment extends BaseObject {
        
        private final BigDecimal amountPrincipal;
        
        private final BigDecimal amountInterest;
        
        private final BigDecimal amountOutstanding;
        
        private Date dueDate;

        public Repayment(BigDecimal amountPrincipal, 
                         BigDecimal amountInterest, 
                         BigDecimal amountOutstanding, 
                         Date dueDate) {
            this.amountPrincipal = amountPrincipal;
            this.amountInterest = amountInterest;
            this.amountOutstanding = amountOutstanding;
            this.dueDate = dueDate;
        }
        
        public BigDecimal getAmountPrincipal() {
            return amountPrincipal;
        }

        public BigDecimal getAmountInterest() {
            return amountInterest;
        }

        public BigDecimal getAmountOutstanding() {
            return amountOutstanding;
        }

        public Date getDate() {
            return dueDate;
        }
    }
}
