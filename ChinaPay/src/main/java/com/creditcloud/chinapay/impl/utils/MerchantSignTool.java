package com.creditcloud.chinapay.impl.utils;

public class MerchantSignTool {
	protected String merchantId;
	protected String merchantPrivateKey;
	protected String chinaPayPublicKey;
	protected String chinaPayId = "999999999999999";

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantPrivateKey() {
		return merchantPrivateKey;
	}

	public void setMerchantPrivateKey(String merchantPrivateKey) {
		this.merchantPrivateKey = merchantPrivateKey;
	}

	public String getChinaPayPublicKey() {
		return chinaPayPublicKey;
	}

	public void setChinaPayPublicKey(String chinaPayPublicKey) {
		this.chinaPayPublicKey = chinaPayPublicKey;
	}

	public String getChinapayId() {
		return chinaPayId;
	}

	public void setChinapayId(String chinaPayId) {
		this.chinaPayId = chinaPayId;
	}

	public String sign(String plainText) {
		String signedText = MerchantSignUtils.sign(plainText, merchantId, merchantPrivateKey);
		return signedText;
	}

	public boolean verify(String plainText, String signature) {
		return MerchantSignUtils.verify(plainText, signature, chinaPayId, chinaPayPublicKey);
	}
}
