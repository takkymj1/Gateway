/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
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
//    private int approvedRequests;

    /**
     * 发布的贷款数
     */
    private int publishedLoans;

    /**
     * 成功的贷款数
     */
    private int successfulLoans;

    /**
     * 还清的贷款数
     */
    private int clearedLoans;

    /**
     * 逾期的贷款数，只要某次还款逾期，那么对应的贷款就设定为逾期
     */
    private int overdueLoans;
    
    /*
     * 违约的贷款，即逾期贷款一定时间后仍然没有还款
     */
    private int breachLoans;

    /**
     * 总共的借入金额
     */
    private long totalLoanAmount;

    /**
     * 待还款总金额
     */
    private RepayAmount dueLoanAmount;

    /**
     * 逾期金额
     */
    private RepayAmount overdueLoanAmount;

    public LoanStatistics() {
    }

    public LoanStatistics(String userId,
                          int publishedLoans, 
                          int successfulLoans, 
                          int clearedLoans, 
                          int overdueLoans, 
                          int breachLoans, 
                          long totalLoanAmount, 
                          RepayAmount dueLoanAmount, 
                          RepayAmount overdueLoanAmount) {
        this.userId = userId;
        this.publishedLoans = publishedLoans;
        this.successfulLoans = successfulLoans;
        this.clearedLoans = clearedLoans;
        this.overdueLoans = overdueLoans;
        this.breachLoans = breachLoans;
        this.totalLoanAmount = totalLoanAmount;
        this.dueLoanAmount = dueLoanAmount;
        this.overdueLoanAmount = overdueLoanAmount;
    }

    public String getUserId() {
        return userId;
    }

    public int getPublishedLoans() {
        return publishedLoans;
    }

    public int getSuccessfulLoans() {
        return successfulLoans;
    }

    public int getClearedLoans() {
        return clearedLoans;
    }

    public int getOverdueLoans() {
        return overdueLoans;
    }

    public int getBreachLoans() {
        return breachLoans;
    }

    public long getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public RepayAmount getDueLoanAmount() {
        return dueLoanAmount;
    }

    public RepayAmount getOverdueLoanAmount() {
        return overdueLoanAmount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPublishedLoans(int publishedLoans) {
        this.publishedLoans = publishedLoans;
    }

    public void setSuccessfulLoans(int successfulLoans) {
        this.successfulLoans = successfulLoans;
    }

    public void setClearedLoans(int clearedLoans) {
        this.clearedLoans = clearedLoans;
    }

    public void setOverdueLoans(int overdueLoans) {
        this.overdueLoans = overdueLoans;
    }

    public void setBreachLoans(int breachLoans) {
        this.breachLoans = breachLoans;
    }

    public void setTotalLoanAmount(long totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public void setDueLoanAmount(RepayAmount dueLoanAmount) {
        this.dueLoanAmount = dueLoanAmount;
    }

    public void setOverdueLoanAmount(RepayAmount overdueLoanAmount) {
        this.overdueLoanAmount = overdueLoanAmount;
    }

}
