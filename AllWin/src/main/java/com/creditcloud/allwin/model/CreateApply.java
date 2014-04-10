package com.creditcloud.allwin.model;

public class CreateApply {

    /**
     * 借款人姓名，必输
     */
    private String customerName;

    /**
     * 身份证号码，必输，数据符合身份证格式
     */
    private String paperNumber;
    /**
     * 申请编号. 必输且唯一
     */
    private String applyId;
    /**
     * 申请贷款类型，必输且符合：01.经营 02.消费 99.其他
     */
    private String loanType;
    /**
     * 申请贷款金额。 必输
     */
    private double loanMoney;
    /**
     * *
     * 币种，必输，符合： 1.人民币 2.美元 3.欧元 4.港币 5.日元
     */
    private String currency;
    /**
     * 贷款期限。 必输，以月为单位
     */
    private int loanTimeLimit;
    /**
     * 担保类型。 必输， 符合： A.抵押 B.质押 C.担保 D.信用 E.保证 Y.其它
     */
    private String assureType;
    /**
     * 申请日期，必输， 符合： "YYYY-MM-DD"的数据格式
     * <br> 如 2012-02-01
     */
    private String applyDate;
    /**
     * 地点描述。 非必输。
     */
    private String creditAddress; // 可输

    /**
     * 默认构造函数
     */
    public CreateApply() {

    }

    /**
     * 包含所有的必输字段的构造函数
     *
     * @param customerName
     * @param paperNumber
     * @param applyId
     * @param loanType
     * @param loanMoney
     * @param currency
     * @param loanTimeLimit
     * @param assureType
     * @param applyDate
     */
    public CreateApply(String customerName, String paperNumber,
            String applyId, String loanType, double loanMoney, String currency,
            int loanTimeLimit, String assureType, String applyDate) {
        super();
        this.customerName = customerName;
        this.paperNumber = paperNumber;
        this.applyId = applyId;
        this.loanType = loanType;
        this.loanMoney = loanMoney;
        this.currency = currency;
        this.loanTimeLimit = loanTimeLimit;
        this.assureType = assureType;
        this.applyDate = applyDate;
    }

    /**
     * 包含所有字段的构造函数
     *
     * @param customerName
     * @param paperNumber
     * @param applyId
     * @param loanType
     * @param loanMoney
     * @param currency
     * @param loanTimeLimit
     * @param assureType
     * @param applyDate
     * @param creditAddress
     */
    public CreateApply(String customerName, String paperNumber,
            String applyId, String loanType, double loanMoney, String currency,
            int loanTimeLimit, String assureType, String applyDate,
            String creditAddress) {
        this(customerName, paperNumber, applyId, loanType, loanMoney, currency,
                loanTimeLimit, assureType, applyDate);
        this.creditAddress = creditAddress;
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

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
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

    public int getLoanTimeLimit() {
        return loanTimeLimit;
    }

    public void setLoanTimeLimit(int loanTimeLimit) {
        this.loanTimeLimit = loanTimeLimit;
    }

    public String getAssureType() {
        return assureType;
    }

    public void setAssureType(String assureType) {
        this.assureType = assureType;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getCreditAddress() {
        return creditAddress;
    }

    public void setCreditAddress(String creditAddress) {
        this.creditAddress = creditAddress;
    }

}
