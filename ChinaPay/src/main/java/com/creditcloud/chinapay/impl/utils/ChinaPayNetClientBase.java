package com.creditcloud.chinapay.impl.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ChinaPayNetClientBase {
	protected Log log() {
		Log log = LogFactory.getLog(getClass());
		return log;
	}

	protected final String USER_AGENT = "Mozilla/5.0";
	protected final int HTTP_STATUS_OK = 200;
	protected String encoding = Constants.CHINAPAY_DEFAULT_ENCODING;
	protected String chinaPayId = Constants.CHINAPAY_MERCHANT_ID;
	protected String chinaPayPublicKey;

	public String getChinaPayPublicKey() {
		return chinaPayPublicKey;
	}

	public void setChinaPayPublicKey(String chinaPayPublicKey) {
		this.chinaPayPublicKey = chinaPayPublicKey;
	}


	public String getChinaPayId() {
		return chinaPayId;
	}

	public void setChinaPayId(String chinaPayId) {
		this.chinaPayId = chinaPayId;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
}
