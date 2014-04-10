package com.creditcloud.allwin.model;

/**
 * 提交合同数据Model
 *
 * @author sobranie
 */
public class ContractApply {

    /**
     * 申请编号， 唯一且必输
     */
    private String applyId;
    /**
     * 合同编号， 唯一且必输
     *
     */
    private String loanAccount;
    /**
     * 申请贷款类型，必输且符合：01.经营 02.消费 99.其他
     */
    private String loanType;

    /**
     * 申请贷款金额。 必输
     */
    private double loanMoney;
    /**
     * 币种，必输，符合： 1.人民币 2.美元 3.欧元 4.港币 5.日元
     */
    private String currency;
    /**
     * 借款日期 必输且符合： "YYYY-MM-DD"的数据格式
     *
     */
    private String creditStartDate;
    /**
     * 担保类型。 必输， 符合： A.抵押 B.质押 C.担保 D.信用 E.保证 Y.其它
     *
     */
    private String assureType;
    /**
     * 借款到期日期： 必输且符合： "YYYY-MM-DD"的数据格式
     */
    private String creditEndDate;
    /**
     * 还款期数，必输
     */
    private int loanPeriods;
    /**
     * 应还款总额，非必输
     */
    private double backMoney;

    public ContractApply() {

    }

    /**
     * 包含所有必输字段的构造函数
     *
     * @param applyId
     * @param loanAccount
     * @param loanType
     * @param loanMoney
     * @param currency
     * @param creditStartDate
     * @param assureType
     * @param creditEndDate
     * @param loanPeriods
     */
    public ContractApply(String applyId, String loanAccount, String loanType,
            double loanMoney, String currency, String creditStartDate,
            String assureType, String creditEndDate, int loanPeriods) {
        super();
        this.applyId = applyId;
        this.loanAccount = loanAccount;
        this.loanType = loanType;
        this.loanMoney = loanMoney;
        this.currency = currency;
        this.creditStartDate = creditStartDate;
        this.assureType = assureType;
        this.creditEndDate = creditEndDate;
        this.loanPeriods = loanPeriods;
    }

    /**
     * 包含所有的字段的构造函数
     *
     * @param applyId
     * @param loanAccount
     * @param loanType
     * @param loanMoney
     * @param currency
     * @param creditStartDate
     * @param assureType
     * @param creditEndDate
     * @param loanPeriods
     * @param backMoney
     */
    public ContractApply(String applyId, String loanAccount, String loanType,
            double loanMoney, String currency, String creditStartDate,
            String assureType, String creditEndDate, int loanPeriods,
            double backMoney) {
        this(applyId, loanAccount, loanType, loanMoney, currency,
                creditStartDate, assureType, creditEndDate, loanPeriods);
        this.backMoney = backMoney;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
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

}
