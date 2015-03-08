package com.creditcloud.chinapay.api.model.pojo.request;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.creditcloud.chinapay.api.model.pojo.POJO;
import com.creditcloud.chinapay.api.utils.StringUtils;

public abstract class SingleCutParameters extends POJO {
	protected String merId = "";
	protected String transType = "0003";
	protected String orderNo = "";
	protected String transDate = "";
	protected String priv1 = "";
	protected String version = "20100831";
	protected String chkValue = "";

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getUnicodePriv1() {
		String text = StringUtils.toUnicode(priv1);
		return text;
	}

	public void setTransDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String dateStringYYYYMMDD = sdf.format(date);
		setTransDate(dateStringYYYYMMDD);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getChkValue() {
		return chkValue;
	}

	public void setChkValue(String chkValue) {
		this.chkValue = chkValue;
	}

	public String getTextToSign() {
		return new StringBuffer(merId).append(transType).append(orderNo).append(transDate).append(version).toString();
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getPriv1() {
		return priv1;
	}

	public void setPriv1(String priv1) {
		this.priv1 = priv1;
	}
}
