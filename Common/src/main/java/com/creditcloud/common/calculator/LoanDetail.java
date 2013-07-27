/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.model.constant.TimeConstant;
import com.creditcloud.model.enums.LoanRequestMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sobranie
 */
public class LoanDetail {

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
    
    public static class Repayment {
        
        private final BigDecimal amountPrincipal;
        
        private final BigDecimal amountInterest;
        
        private final BigDecimal amountOutstanding;
        
        private final Date dueDate;

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

    public static class Duration {

        private final int years;

        private final int months;

        private final int days;

        public Duration(int duration) {
            years = duration / TimeConstant.DAYS_PER_YEAR;
            months = (duration % TimeConstant.DAYS_PER_YEAR) / TimeConstant.DAYS_PER_MONTH;
            days = duration % TimeConstant.DAYS_PER_MONTH;
        }

        public int getYears() {
            return years;
        }

        public int getMonths() {
            return months;
        }

        public int getDays() {
            return days;
        }
    }
}
