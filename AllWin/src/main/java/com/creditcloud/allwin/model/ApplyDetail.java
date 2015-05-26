package com.creditcloud.allwin.model;

/**
 * 贷款申请记录明细（最近六个月）
 */
public class ApplyDetail implements java.io.Serializable {

    private String applyDate;  //申请日期
    private String memberType; //会员类型
    private String creditAddress;//借款地点
    private String loanType; //贷款类型
    private String loanMoney; //申请金额
    private String applyResult; //申请审批结果
    private String remark;//备注

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(String loanMoney) {
        this.loanMoney = loanMoney;
    }

    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
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
        return "ApplyDetail [applyDate=" + applyDate + ", memberType="
                + memberType + ", creditAddress=" + creditAddress
                + ", loanType=" + loanType + ", loanMoney=" + loanMoney
                + ", applyResult=" + applyResult + ", remark=" + remark + "]";
    }
}
