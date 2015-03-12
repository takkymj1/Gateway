package com.creditcloud.chinapay.api.model.pojo.request;

public class SinglePayPostParameters extends SinglePayParameters {

    private static final long serialVersionUID = 20150311L;

    private String cardNo = "";

    private String usrName = "";

    private String openBank = "";

    private String prov = "";

    private String city = "";

    private String transAmt = "";

    private String purpose = "";

    private String subBank = "";

    private final String flag = "00";

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSubBank() {
        return subBank;
    }

    public void setSubBank(String subBank) {
        this.subBank = subBank;
    }

    public String getFlag() {
        return flag;
    }

    @Override
    public String getTextToSign() {
        return new StringBuffer(merId).append(merDate).append(merSeqId).append(cardNo).append(usrName).append(openBank)
                .append(prov).append(city).append(transAmt).append(purpose).append(subBank).append(flag)
                .append(version).toString();
    }
}
