package com.creditcloud.allwin.model;

//异常还款记录明细中的明细项,和AbnormalCreditDetail是多对1的关系
public class Overdue implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String checkOverdueDate;//逾期开始日期
    private String overdueDays; //逾期时长
    private String overdueReason;//逾期原因
    private String overdueState;//处置状态
    private String operTime;//更新日期
    private String remark;//备注

    public String getCheckOverdueDate() {
        return checkOverdueDate;
    }

    public void setCheckOverdueDate(String checkOverdueDate) {
        this.checkOverdueDate = checkOverdueDate;
    }

    public String getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(String overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getOverdueReason() {
        return overdueReason;
    }

    public void setOverdueReason(String overdueReason) {
        this.overdueReason = overdueReason;
    }

    public String getOverdueState() {
        return overdueState;
    }

    public void setOverdueState(String overdueState) {
        this.overdueState = overdueState;
    }

    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
