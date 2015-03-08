package com.creditcloud.chinapay.api.model.pojo.response;

import java.util.List;
import java.util.Properties;

import com.creditcloud.chinapay.api.model.pojo.POJO;
import com.creditcloud.chinapay.api.utils.StringUtils;

public class SinglePayPostResult extends POJO {
	protected String responseCode = "";// 4位 是 请求应答码，具体请见附录6.1.1
	protected String merId = "";// 15位 否 同请求报文参数中的商户号
	protected String merDate = "";// 8位 否 同请求报文参数中的商户日期
	protected String merSeqId = "";// 16位 否 同请求报文参数中的商户流水号
	protected String cpDate = "";// 8位 否 ChinaPay接收到交易的日期
	protected String cpSeqId = "";// 6位 否 ChinaPay系统内部流水
	protected String transAmt = "";// 12位 否 同请求报文参数中的金额
	protected String stat = "";// 1位 否 交易状态码，具体请参看附录6.1.2
	protected String cardNo = "";// 32位 否 同请求报文参数中的收款账号
	protected String chkValue = "";// 256位 是
									// 对返回字串的签名。返回应答报文中最后一个“&”符号以前的都是作为签名的明文。明文需进行BASE64编码，具体见下方。

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getMerDate() {
		return merDate;
	}

	public void setMerDate(String merDate) {
		this.merDate = merDate;
	}

	public String getMerSeqId() {
		return merSeqId;
	}

	public void setMerSeqId(String merSeqId) {
		this.merSeqId = merSeqId;
	}

	public String getCpDate() {
		return cpDate;
	}

	public void setCpDate(String cpDate) {
		this.cpDate = cpDate;
	}

	public String getCpSeqId() {
		return cpSeqId;
	}

	public void setCpSeqId(String cpSeqId) {
		this.cpSeqId = cpSeqId;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getChkValue() {
		return chkValue;
	}

	public void setChkValue(String chkValue) {
		this.chkValue = chkValue;
	}

	public static SinglePayPostResult parse(String responseText) {
		final String PAIR_DELIMITER = "&";
		final String NAME_VALUE_DELIMITER = "=";
		final boolean trimToken = true;
		List<String> namedValues = StringUtils.parseTokens(responseText, PAIR_DELIMITER, trimToken);
		Properties prop = new Properties();
		for (String namedValue : namedValues) {
			List<String> nameAndValue = StringUtils.parseTokens(namedValue, NAME_VALUE_DELIMITER, trimToken);
			String name = nameAndValue.get(0);
			String value = nameAndValue.size() >= 2 ? nameAndValue.get(1) : "";
			prop.put(name, value);
		}

		SinglePayPostResult result = new SinglePayPostResult();

		result.responseCode = prop.getProperty("responseCode", "");
		result.merId = prop.getProperty("merId", "");
		result.merDate = prop.getProperty("merDate", "");
		result.merSeqId = prop.getProperty("merSeqId", "");
		result.cpDate = prop.getProperty("cpDate", "");
		result.cpSeqId = prop.getProperty("cpSeqId", "");
		result.transAmt = prop.getProperty("transAmt", "");
		result.stat = prop.getProperty("stat", "");
		result.cardNo = prop.getProperty("cardNo", "");

		return result;
	}
}
