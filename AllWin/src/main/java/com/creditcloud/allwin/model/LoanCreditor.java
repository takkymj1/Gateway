package com.creditcloud.allwin.model;

public class LoanCreditor {

    /**
     * *
     * 合同编号，必输且唯一。
     */
    private String loanAccount;
    /**
     * 是否已经结清. 必须输入： 1. 结清， 0： 未结清
     */
    private String isClear;
    /**
     * 未偿还本金， 非必输
     */
    private double nbsMoney;
    /**
     * 未偿还总金额， 可输
     */
    private double nbMoney;
    /**
     * *
     * 结清日期， 可输
     */
    private String cleanDate;

    public LoanCreditor() {

    }

    /**
     * 包含所有必输参数的构造函数
     *
     * @param loanAccount
     * @param isClear
     */
    public LoanCreditor(String loanAccount, String isClear) {
        super();
        this.loanAccount = loanAccount;
        this.isClear = isClear;
    }

    /**
     * 包含所有参数的构造函数
     *
     * @param loanAccount
     * @param isClear
     * @param nbsMoney
     * @param nbMoney
     * @param cleanDate
     */
    public LoanCreditor(String loanAccount, String isClear, double nbsMoney,
            double nbMoney, String cleanDate) {
        this(loanAccount, isClear);
        this.nbsMoney = nbsMoney;
        this.nbMoney = nbMoney;
        this.cleanDate = cleanDate;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount;
    }

    public String getIsClear() {
        return isClear;
    }

    public void setIsClear(String isClear) {
        this.isClear = isClear;
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
