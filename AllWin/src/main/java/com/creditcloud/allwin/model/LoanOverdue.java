package com.creditcloud.allwin.model;

/**
 * 逾期信息model
 *
 * @author sobranie
 */
public class LoanOverdue {

    /**
     * 合同编号， 唯一且必输
     */
    private String loanAccount;
    /**
     * 逾期开始日期， 必输
     */
    private String overdueStartDate;
    /**
     * 逾期截止日期， 可输
     */
    private String overdueEndDate;
    /**
     * 逾期原因，必输且符合：01.还款能力下降 02.恶意拖欠 03.身份欺诈 04.逃逸 05.犯罪入狱 06.疾病 07.死亡 99.其他
     *
     */
    private String overdueReason;
    /**
     * 逾期贷款状态， 必输且符合：01.催收中 02.催收还款中 03.正常还款 04.核销 05.逾期已结清 06.正常结清 07.协议还款
     */
    private String overdueState;

    public LoanOverdue() {

    }

    /**
     * 包含所有必输参数的构造函数
     *
     * @param loanAccount
     * @param overdueStartDate
     * @param overdueReason
     * @param overdueState
     */
    public LoanOverdue(String loanAccount, String overdueStartDate,
            String overdueReason, String overdueState) {
        super();
        this.loanAccount = loanAccount;
        this.overdueStartDate = overdueStartDate;
        this.overdueReason = overdueReason;
        this.overdueState = overdueState;
    }

    /**
     * 包含所有参数的构造函数
     *
     * @param loanAccount
     * @param overdueStartDate
     * @param overdueEndDate
     * @param overdueReason
     * @param overdueState
     */
    public LoanOverdue(String loanAccount, String overdueStartDate,
            String overdueEndDate, String overdueReason, String overdueState) {
        this(loanAccount, overdueStartDate, overdueReason, overdueState);
        this.overdueEndDate = overdueEndDate;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount;
    }

    public String getOverdueStartDate() {
        return overdueStartDate;
    }

    public void setOverdueStartDate(String overdueStartDate) {
        this.overdueStartDate = overdueStartDate;
    }

    public String getOverdueEndDate() {
        return overdueEndDate;
    }

    public void setOverdueEndDate(String overdueEndDate) {
        this.overdueEndDate = overdueEndDate;
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

}
