package com.creditcloud.chinapay.model.request;

public class SingleCutQueryParameters extends SingleCutParameters {

    private static final long serialVersionUID = 20150311L;

    @Override
    public String getTextToSign() {
        return new StringBuffer(merId).append(transType).append(orderNo).append(transDate).append(version).toString();
    }
}
