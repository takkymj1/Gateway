package com.creditcloud.chinapay.model.response;

import java.util.List;

import com.creditcloud.chinapay.model.POJO;
import com.creditcloud.chinapay.utils.StringUtils;

public class AccountBalanceQueryResult extends POJO {
	protected String code = "";// 应答信息 数字 定长，3位 000表示查询成功。001表示查询出错。签名错误和超限错误码也为001
	protected String merId = "";// 商户号 数字 定长，15位 商户在收付捷平台中的唯一id.如果code！=000，则该字段为空
	protected String merAmt = "";// 商户余额 数字 定长，15位 商户的备付金余额.单位为分。如果code！=000，则该字段为空
	protected String chkValue = "";// 签名值 字符 定长，256位 除了报文尾部的256位以上的都是作为签名的明文。明文需进行BASE64编码，具体见下方。

	/**
	 * 应答信息 数字 定长，3位 000表示查询成功。001表示查询出错。签名错误和超限错误码也为001
	 * 
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 应答信息 数字 定长，3位 000表示查询成功。001表示查询出错。签名错误和超限错误码也为001
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 商户号 数字 定长，15位 商户在收付捷平台中的唯一id.如果code！=000，则该字段为空
	 * 
	 * @return
	 */
	public String getMerId() {
		return merId;
	}

	/**
	 * 商户号 数字 定长，15位 商户在收付捷平台中的唯一id.如果code！=000，则该字段为空
	 * 
	 * @param merId
	 */
	public void setMerId(String merId) {
		this.merId = merId;
	}

	/**
	 * 商户余额 数字 定长，15位 商户的备付金余额.单位为分。如果code！=000，则该字段为空
	 * 
	 * @return
	 */
	public String getMerAmt() {
		return merAmt;
	}

	/**
	 * 商户余额 数字 定长，15位 商户的备付金余额.单位为分。如果code！=000，则该字段为空
	 * 
	 * @param merAmt
	 */
	public void setMerAmt(String merAmt) {
		this.merAmt = merAmt;
	}

	public String getChkValue() {
		return chkValue;
	}

	public void setChkValue(String chkValue) {
		this.chkValue = chkValue;
	}

	public static AccountBalanceQueryResult parse(String responseText) {
		final String TOKEN_DELIMITER = "\\|";
		final boolean trimToken = true;
		List<String> tokens = StringUtils.parseTokens(responseText, TOKEN_DELIMITER, trimToken);

		AccountBalanceQueryResult result = new AccountBalanceQueryResult();
		result.code = tokens.get(0);
		if (tokens.size() > 1)
			result.merId = tokens.get(1);
		if (tokens.size() > 2)
			result.merAmt = tokens.get(2);
		return result;
	}

	/**
	 * 返回账户余额,以分为单位
	 * @return
	 */
	public long getAccountBalance() {
		long cents = StringUtils.toLong(merAmt, 0L);
		return cents;
	}
}
