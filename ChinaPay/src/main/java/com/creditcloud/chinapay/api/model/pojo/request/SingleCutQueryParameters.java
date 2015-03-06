package com.creditcloud.chinapay.api.model.pojo.request;

public class SingleCutQueryParameters extends SingleCutParameters {
	@Override
	public String getTextToSign() {
		return new StringBuffer(merId).append(transType).append(orderNo).append(transDate).append(version).toString();
	}
}
