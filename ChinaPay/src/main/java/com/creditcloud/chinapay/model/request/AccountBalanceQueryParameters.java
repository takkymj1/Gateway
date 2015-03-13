package com.creditcloud.chinapay.model.request;

public class AccountBalanceQueryParameters extends SinglePayParameters {
	@Override
	public String getTextToSign() {
		return new StringBuffer(merId).append(version).toString();
	}
}
