/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 借款人的借款统计信息
 *
 * @author rooseek
 */
@XmlRootElement
public class LoanStatistics extends BaseObject {

    private static final long serialVersionUID = 20131012L;

    /**
     * 借款人uuid
     */
    private String userId;

//    /**
//     * 批准的贷款申请数
//     */
//    private long approvedRequests;

    /**
     * 发布的贷款数
     */
    private long publishedLoans;

    /**
     * 成功的贷款数
     */
    private long successfulLoans;

    /**
     * 还清的贷款数
     */
    private long clearedLoans;

    /**
     * 逾期的贷款数，只要某次还款逾期，那么对应的贷款就设定为逾期
     */
    private long overdueLoans;
    
    /*
     * 违约的贷款，即逾期贷款一定时间后仍然没有还款
     */
    private long breachLoans;

    /**
     * 总共的借入金额
     */
    private long totalLoanAmount;

    /**
     * 待还款总金额
     */
    private BigDecimal dueAmount;

    /**
     * 逾期金额
     */
    private BigDecimal overdueAmount;

    public LoanStatistics() {
    }

    public LoanStatistics(String userId, 
                          long publishedLoans, 
                          long successfulLoans,
                          long clearedLoans, 
                          long overdueLoans, 
                          long breachLoans,
                          long totalLoanAmount, 
                          BigDecimal dueAmount,
                          BigDecimal overdueAmount) {
        this.userId = userId;
        this.publishedLoans = publishedLoans;
        this.successfulLoans = successfulLoans;
        this.clearedLoans = clearedLoans;
        this.overdueLoans = overdueLoans;
        this.breachLoans = breachLoans;
        this.totalLoanAmount = totalLoanAmount;
        this.dueAmount = dueAmount;
        this.overdueAmount = overdueAmount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPublishedLoans(long publishedLoans) {
        this.publishedLoans = publishedLoans;
    }

    public void setSuccessfulLoans(long successfulLoans) {
        this.successfulLoans = successfulLoans;
    }

    public void setClearedLoans(long clearedLoans) {
        this.clearedLoans = clearedLoans;
    }

    public void setOverdueLoans(long overdueLoans) {
        this.overdueLoans = overdueLoans;
    }

    public void setTotalLoanAmount(long totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public String getUserId() {
        return userId;
    }

    public long getPublishedLoans() {
        return publishedLoans;
    }

    public long getSuccessfulLoans() {
        return successfulLoans;
    }

    public long getClearedLoans() {
        return clearedLoans;
    }

    public long getOverdueLoans() {
        return overdueLoans;
    }

    public long getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public long getBreachLoans() {
        return breachLoans;
    }

    public void setBreachLoans(long breachLoans) {
        this.breachLoans = breachLoans;
    }
}
