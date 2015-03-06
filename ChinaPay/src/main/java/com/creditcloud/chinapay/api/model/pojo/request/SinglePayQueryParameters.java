package com.creditcloud.chinapay.api.model.pojo.request;

public class SinglePayQueryParameters extends SinglePayParameters {
	@Override
	public String getTextToSign() {
		return new StringBuffer(merId).append(merDate).append(merSeqId).append(version).toString();
	}
}
