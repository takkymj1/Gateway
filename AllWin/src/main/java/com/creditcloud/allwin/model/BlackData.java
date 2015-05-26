package com.creditcloud.allwin.model;

/**
 * 不良记录
 *
 * @author
 */
public class BlackData implements java.io.Serializable {

    private String createDate; //创建时间
    private String creditAddress; //借款地点
    private String arrears; //欠款总额，实际是一个浮点数的值。
    private String overdueDays; //逾期天数
    private String overduePeriods;//逾期期数
    private String phone; //电话
    private String email; //邮箱
    private String residenceAddress; //户籍地址
    private String currentAddress; //当前地址

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreditAddress() {
        return creditAddress;
    }

    public void setCreditAddress(String creditAddress) {
        this.creditAddress = creditAddress;
    }

    public String getArrears() {
        return arrears;
    }

    public void setArrears(String arrears) {
        this.arrears = arrears;
    }

    public String getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(String overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getOverduePeriods() {
        return overduePeriods;
    }

    public void setOverduePeriods(String overduePeriods) {
        this.overduePeriods = overduePeriods;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    @Override
    public String toString() {
        return "BlackData [createDate=" + createDate + ", creditAddress="
                + creditAddress + ", arrears=" + arrears + ", overdueDays="
                + overdueDays + ", overduePeriods=" + overduePeriods
                + ", phone=" + phone + ", email=" + email
                + ", residenceAddress=" + residenceAddress
                + ", currentAddress=" + currentAddress + "]";
    }

}
