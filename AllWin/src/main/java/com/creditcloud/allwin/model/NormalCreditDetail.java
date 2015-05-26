package com.creditcloud.allwin.model;

/**
 * ***
 * 正常还款账户明细
 */
public class NormalCreditDetail implements java.io.Serializable {

    private String creditStartDate;//借款日期
    private String creditEndDate;//借款到期日期
    private String creditAddress;//借款地点(请直接输入中文描述)
    private String loanType;//贷款类型
    private String assureType;//担保方式
    private String loanMoney;//合同金额
    private String loanPeriods;//还款期数
    private String remark; //备注

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

    public String getLoanPeriods() {
        return loanPeriods;
    }

    public void setLoanPeriods(String loanPeriods) {
        this.loanPeriods = loanPeriods;
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

    public String getCreditAddress() {
        return creditAddress;
    }

    public void setCreditAddress(String creditAddress) {
        this.creditAddress = creditAddress;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "NormalCreditDetail [creditStartDate=" + creditStartDate
                + ", creditEndDate=" + creditEndDate + ", creditAddress="
                + creditAddress + ", loanType=" + loanType + ", assureType="
                + assureType + ", loanMoney=" + loanMoney + ", loanPeriods="
                + loanPeriods + ", remark=" + remark + "]";
    }
}
