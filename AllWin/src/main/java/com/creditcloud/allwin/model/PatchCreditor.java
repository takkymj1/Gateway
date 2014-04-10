package com.creditcloud.allwin.model;

/**
 * 补录债券信息Model
 *
 * @author sobranie
 */
public class PatchCreditor {

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
     * 还款期数，必输
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
     * 是否已经结清， 必输且符合： 1：已经结清， 0：未结清
     */
    private String isClear;
    /**
     * 未偿还本金，可输
     */
    private double nbsMoney;
    /**
     * 未偿还总金额， 可输
     */
    private double nbMoney;
    /**
     * 结清日期，可输
     */
    private String cleanDate;

    public PatchCreditor() {

    }

    /**
     * 包含所有必输参数的构造函数
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
     * @param isClear
     */
    public PatchCreditor(String customerName, String paperNumber,
            String loanAccount, String loanType, double loanMoney,
            String currency, String creditStartDate, String assureType,
            String creditEndDate, int loanPeriods, String isClear) {
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
        this.isClear = isClear;
    }

    /**
     * 包含所有参数的构造函数
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
     * @param isClear
     * @param nbsMoney
     * @param nbMoney
     * @param cleanDate
     */
    public PatchCreditor(String customerName, String paperNumber,
            String loanAccount, String loanType, double loanMoney,
            String currency, String creditStartDate, String assureType,
            String creditEndDate, int loanPeriods, double backMoney,
            String creditAddress, String isClear, double nbsMoney,
            double nbMoney, String cleanDate) {
        this(customerName, paperNumber, loanAccount, loanType, loanMoney,
                currency, creditStartDate, assureType, creditEndDate,
                loanPeriods, isClear);
        this.backMoney = backMoney;
        this.creditAddress = creditAddress;
        this.nbsMoney = nbsMoney;
        this.nbMoney = nbMoney;
        this.cleanDate = cleanDate;
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

    public String getIsClear() {
        return isClear;
    }

    public void setIsClear(String isClear) {
        this.isClear = isClear;
    }

    public int getLoanPeriods() {
        return loanPeriods;
    }

    public void setLoanPeriods(int loanPeriods) {
        this.loanPeriods = loanPeriods;
    }

    public double getNbsMoney() {
        return nbsMoney;
    }

    public void setNbsMoney(double nbsMoney) {
        this.nbsMoney = nbsMoney;
    }

    public double getNbMoney() {
        return nbMoney;
    }

    public void setNbMoney(double nbMoney) {
        this.nbMoney = nbMoney;
    }

    public String getCleanDate() {
        return cleanDate;
    }

    public void setCleanDate(String cleanDate) {
        this.cleanDate = cleanDate;
    }

}
