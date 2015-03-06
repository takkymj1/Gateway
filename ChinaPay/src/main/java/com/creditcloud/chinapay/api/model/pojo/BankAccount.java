package com.creditcloud.chinapay.api.model.pojo;

public class BankAccount extends POJO {
	protected String userName = "";
	protected String bankName = "";
	protected String certType = "";
	protected String certNo = "";

	protected String cardNo = "";
	protected String PIN = "";

	protected String dcType = "0";

	protected String cardCvn2 = "";
	protected String cardExpire = "";
	protected String cardPhone = "";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public String getDcType() {
		return dcType;
	}

	public void setDcType(String dcType) {
		this.dcType = dcType;
	}

	public String getCardCvn2() {
		return cardCvn2;
	}

	public void setCardCvn2(String cardCvn2) {
		this.cardCvn2 = cardCvn2;
	}

	public String getCardExpire() {
		return cardExpire;
	}

	public void setCardExpire(String cardExpire) {
		this.cardExpire = cardExpire;
	}

	public String getCardPhone() {
		return cardPhone;
	}

	public void setCardPhone(String cardPhone) {
		this.cardPhone = cardPhone;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getChannelId() {
		if ("招商银行".equalsIgnoreCase(bankName))
			return "12";
		else
			return "19";
	}
}
