package com.creditcloud.investmentfund.lionfund.api.moneyfund.model;

import lombok.Data;

/**
 * 客户银行卡信息
 * 
 * @author GuohuaZhang
 *
 */
@Data
public class BankAccount extends POJO {
	protected String userName = "";
	protected String bankName = "";
	protected String certType = "00";
	protected String certNo = "";

	protected String cardNo = "";
	protected String telNo = "";

	/**
	 * 银行卡用户的真实姓名
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 银行卡用户的真实姓名
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 所属银行名称
	 * 
	 * @return
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 设置所属银行名称
	 * 
	 * @param bankName
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCertType() {
		return certType;
	}

	/**
	 * 00：身份证；<br>
	 * 
	 * @param certType
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * 卡号
	 * 
	 * @return
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * 设置卡号
	 * 
	 * @param cardNo
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * 身份证明号码
	 * 
	 * @return
	 */
	public String getCertNo() {
		return certNo;
	}

	/**
	 * 设置身份证明号码
	 * 
	 * @param certNo
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
