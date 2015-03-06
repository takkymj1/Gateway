package com.creditcloud.chinapay.impl;

import com.creditcloud.chinapay.api.model.pojo.PlainTextSignaturePair;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayParameters;
import com.creditcloud.chinapay.impl.utils.ChinaPayNetClientBase;
import com.creditcloud.chinapay.impl.utils.MerchantSignTool;
import com.creditcloud.chinapay.impl.utils.MerchantSignUtils;

public class MerchantChianPayNetClientBase extends ChinaPayNetClientBase {
	protected String merchantId;
	protected String merchantPrivateKey;


	public void sign(SinglePayParameters parameters) {
		String plainText = parameters.getTextToSign();
		log().debug("明文                    : " + plainText);
		// 确保数据使用指定的编码集传输
		String base64Text = MerchantSignUtils.base64Encoding(plainText, encoding);
		log().debug("Base64编码    : " + base64Text);

		MerchantSignTool tool = new MerchantSignTool();
		tool.setMerchantId(merchantId);
		tool.setMerchantPrivateKey(merchantPrivateKey);
		String signature = tool.sign(base64Text);
		parameters.setChkValue(signature);
	}

	public void sign(SingleCutParameters parameters) {
		String plainText = parameters.getTextToSign();
		log().debug("明文                    : " + plainText);
		// 确保数据使用指定的编码集传输
		String base64Text = MerchantSignUtils.base64Encoding(plainText, encoding);
		log().debug("Base64编码    : " + base64Text);

		MerchantSignTool tool = new MerchantSignTool();
		tool.setMerchantId(merchantId);
		tool.setMerchantPrivateKey(merchantPrivateKey);
		String signature = tool.sign(base64Text);
		parameters.setChkValue(signature);
	}
	
	protected boolean verifyTextAgainstSignature(PlainTextSignaturePair pair) {
		String responsePlainText = pair.plainText;
		String chkValue = pair.signature;
		String base64Text = MerchantSignUtils.base64Encoding(responsePlainText, encoding);

		MerchantSignTool tool = new MerchantSignTool();
		tool.setChinapayId(chinaPayId);
		tool.setChinaPayPublicKey(chinaPayPublicKey);
		boolean match = tool.verify(base64Text, chkValue);
		return match;
	}

	protected PlainTextSignaturePair parsePlainTextSignaturePairFromResponseText(String responseText, String delimiter) {
		int endOfResponsePlainText = responseText.lastIndexOf(delimiter);
		if (endOfResponsePlainText == -1)
			return new PlainTextSignaturePair();

		PlainTextSignaturePair pair = new PlainTextSignaturePair();
		pair.plainText = responseText.substring(0, endOfResponsePlainText);
		pair.signature = responseText.substring(endOfResponsePlainText + delimiter.length());
		return pair;
	}

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
}
