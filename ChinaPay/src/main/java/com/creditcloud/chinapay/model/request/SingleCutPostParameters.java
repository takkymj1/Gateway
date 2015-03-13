package com.creditcloud.chinapay.model.request;

import com.creditcloud.chinapay.utils.StringUtils;

public class SingleCutPostParameters extends SingleCutParameters {

    private static final long serialVersionUID = 20150311L;

    protected String openBankId = "";

    protected final String cardType = "0";

    protected String cardNo = "";

    protected String usrName = "";

    protected final String certType = "01";

    protected String certId = "";

    protected final String curyId = "156";

    protected String transAmt = "";

    protected String purpose = "";

    protected final String gateId = "7008";

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

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    @Override
    public String getTextToSign() {
        return new StringBuffer(merId).append(transDate).append(orderNo).append(transType).append(openBankId)
                .append(cardType).append(cardNo).append(getUnicodeUsrName()).append(certType).append(certId)
                .append(curyId).append(transAmt).append(getUnicodePriv1()).append(version).append(gateId).toString();
    }

    public String getOpenBankId() {
        return openBankId;
    }

    public void setOpenBankId(String openBankId) {
        this.openBankId = openBankId;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCertType() {
        return certType;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCuryId() {
        return curyId;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getUnicodePurpose() {
        String text = StringUtils.toUnicode(purpose);
        return text;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getGateId() {
        return gateId;
    }

    public String getUnicodeUsrName() {
        String text = StringUtils.toUnicode(usrName);
        return text;
    }
}
