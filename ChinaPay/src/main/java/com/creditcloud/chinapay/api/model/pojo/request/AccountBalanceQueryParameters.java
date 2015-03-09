package com.creditcloud.chinapay.api.model.pojo.request;

public class AccountBalanceQueryParameters extends SinglePayParameters {
	@Override
	public String getTextToSign() {
		return new StringBuffer(merId).append(version).toString();
	}
}
