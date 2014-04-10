package com.creditcloud.allwin.model;

public class PatchOverdue {
    /*
     * 借款人姓名，必输
     */

    private String customerName;
    /**
     * 身份证号， 必输
     */
    private String paperNumber;
    /**
     * 合同编号， 必输且唯一
     */
    private String loanAccount;
    /*
     * 申请贷款类型，必输且符合：01.经营 02.消费 99.其他
     */
    private String loanType;
    /**
     * 合同金额， 必输
     */
    private double loanMoney;
    /**
     * 币种，必输，符合： 1.人民币 2.美元 3.欧元 4.港币 5.日元
     */
    private String currency;
    /**
     * 借款日期， 必输
     */
    private String creditStartDate;
    /**
     * 担保类型。 必输， 符合： A.抵押 B.质押 C.担保 D.信用 E.保证 Y.其它
     */
    private String assureType;
    /**
     * 借款到期日期。
     */
    private String creditEndDate;
    /**
     * 借款到期日期。
     */
    private int loanPeriods;
    /**
     * 应还款总额，可输
     */
    private double backMoney;
    /**
     * 借款地点描述， 可输
     */
    private String creditAddress;
    /**
     * 逾期开始日期， 必输
     */
    private String overdueStartDate;
    /**
     * 逾期结束日期， 可输
     */
    private String overdueEndDate;
    /**
     * 逾期原因，必输且符合：01.还款能力下降 02.恶意拖欠 03.身份欺诈 04.逃逸 05.犯罪入狱 06.疾病 07.死亡 99.其他
     */
    private String overdueReason;
    /**
     * 逾期贷款状态， 必输且符合：01.催收中 02.催收还款中 03.正常还款 04.核销 05.逾期已结清 06.正常结清 07.协议还款
     */
    private String overdueState;

    public PatchOverdue() {

    }

    /**
     * 所有必输参数构成的构造函数
     *
     * @param customerName
     * @param paperNumber
     * @param loanAccount
     * @param loanType
     * @param loanMoney
     * @param currency
     * @param creditStartDate
     * @param assureType
     * @param creditEndDate
     * @param loanPeriods
     * @param overdueStartDate
     * @param overdueReason
     * @param overdueState
     */
    public PatchOverdue(String customerName, String paperNumber,
            String loanAccount, String loanType, double loanMoney,
            String currency, String creditStartDate, String assureType,
            String creditEndDate, int loanPeriods, String overdueStartDate,
            String overdueReason, String overdueState) {
        super();
        this.customerName = customerName;
        this.paperNumber = paperNumber;
        this.loanAccount = loanAccount;
        this.loanType = loanType;
        this.loanMoney = loanMoney;
        this.currency = currency;
        this.creditStartDate = creditStartDate;
        this.assureType = assureType;
        this.creditEndDate = creditEndDate;
        this.loanPeriods = loanPeriods;
        this.overdueStartDate = overdueStartDate;
        this.overdueReason = overdueReason;
        this.overdueState = overdueState;
    }

    /**
     * 所有参数构成的构造函数
     *
     * @param customerName
     * @param paperNumber
     * @param loanAccount
     * @param loanType
     * @param loanMoney
     * @param currency
     * @param creditStartDate
     * @param assureType
     * @param creditEndDate
     * @param loanPeriods
     * @param backMoney
     * @param creditAddress
     * @param overdueStartDate
     * @param overdueEndDate
     * @param overdueReason
     * @param overdueState
     */
    public PatchOverdue(String customerName, String paperNumber,
            String loanAccount, String loanType, double loanMoney,
            String currency, String creditStartDate, String assureType,
            String creditEndDate, int loanPeriods, double backMoney,
            String creditAddress, String overdueStartDate,
            String overdueEndDate, String overdueReason, String overdueState) {
        this(customerName, paperNumber, loanAccount, loanType, loanMoney,
                currency, creditStartDate, assureType, creditEndDate,
                loanPeriods, overdueStartDate, overdueReason, overdueState);
        this.backMoney = backMoney;
        this.creditAddress = creditAddress;
        this.overdueEndDate = overdueEndDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(String paperNumber) {
        this.paperNumber = paperNumber;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(double loanMoney) {
        this.loanMoney = loanMoney;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCreditStartDate() {
        return creditStartDate;
    }

    public void setCreditStartDate(String creditStartDate) {
        this.creditStartDate = creditStartDate;
    }

    public String getAssureType() {
        return assureType;
    }

    public void setAssureType(String assureType) {
        this.assureType = assureType;
    }

    public String getCreditEndDate() {
        return creditEndDate;
    }

    public void setCreditEndDate(String creditEndDate) {
        this.creditEndDate = creditEndDate;
    }

    public int getLoanPeriods() {
        return loanPeriods;
    }

    public void setLoanPeriods(int loanPeriods) {
        this.loanPeriods = loanPeriods;
    }

    public double getBackMoney() {
        return backMoney;
    }

    public void setBackMoney(double backMoney) {
        this.backMoney = backMoney;
    }

    public String getCreditAddress() {
        return creditAddress;
    }

    public void setCreditAddress(String creditAddress) {
        this.creditAddress = creditAddress;
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
