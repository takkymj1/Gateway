package com.creditcloud.allwin.model;

import java.util.Arrays;
import java.util.List;

/**
 * **异常还款记录明细***
 */
public class AbnormalCreditDetail implements java.io.Serializable {

    private String creditStartDate;// 借款日期
    private String creditEndDate;// 借款到期日期
    private String loanType;// 贷款类型
    private String assureType;// 担保方式
    private String loanMoney;// 合同金额
    private String loanPeriods;// 还款期数
    private List<Overdue> overdues; // 逾期明细

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getAssureType() {
        return assureType;
    }

    public void setAssureType(String assureType) {
        this.assureType = assureType;
    }

    public String getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(String loanMoney) {
        this.loanMoney = loanMoney;
    }

    public String getCreditStartDate() {
        return creditStartDate;
    }

    public void setCreditStartDate(String creditStartDate) {
        this.creditStartDate = creditStartDate;
    }

    public String getCreditEndDate() {
        return creditEndDate;
    }

    public void setCreditEndDate(String creditEndDate) {
        this.creditEndDate = creditEndDate;
    }

    public List<Overdue> getOverdues() {
        return overdues;
    }

    public void setOverdues(List<Overdue> overdues) {
        this.overdues = overdues;
    }

    public String getLoanPeriods() {
        return loanPeriods;
    }

    public void setLoanPeriods(String loanPeriods) {
        this.loanPeriods = loanPeriods;
    }

    @Override
    public String toString() {
        return "AbnormalCreditDetail [creditStartDate=" + creditStartDate
                + ", creditEndDate=" + creditEndDate + ", loanType=" + loanType
                + ", assureType=" + assureType + ", loanMoney=" + loanMoney
                + ", loanPeriods=" + loanPeriods + ", overdues="
                + Arrays.asList(overdues).toString() + "]";
    }

}
