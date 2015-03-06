package com.creditcloud.chinapay.impl.utils;

import java.nio.charset.Charset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import chinapay.Base64;
import chinapay.SecureLink;

public class MerchantSignUtils {
	protected static Log log() {
		Log log = LogFactory.getLog(MerchantSignUtils.class);
		return log;
	}

	public static String base64Encoding(String plainText, String encoding) {
		byte[] bytes = plainText.getBytes(Charset.forName(encoding));

		// 对签名的数据进行Base64编码
		String base64Text = new String(Base64.encode(bytes));
		return base64Text;
	}
	
	public static String base64Encoding(String plainText) {
		byte[] bytes = plainText.getBytes();

		// 对签名的数据进行Base64编码
		String base64Text = new String(Base64.encode(bytes));
		return base64Text;
	}

	public static String sign(String plainText, String merId, String priKey) {
		log().debug("================>签名过程<================");

		// 初始化key文件：
		chinapay.PrivateKey key = new chinapay.PrivateKey();

		log().debug("商户号 : " + merId);
		log().debug("私  钥 : " + priKey);
		boolean suc = key.buildKey(merId, 0, priKey);
		if (!suc) {
			log().error("创建私钥对象失败");
			return null;
		}

		// 签名
		SecureLink secureLink = new SecureLink(key);
		String signedText = secureLink.Sign(plainText);

		log().debug("签  名 : " + signedText);
		return signedText;
	}

	public static boolean verify(String plainText, String signedText, String merId, String pubKey) {
		log().debug("================>验证过程<================");
		
		// 验证签名示例代码
		chinapay.PrivateKey key = new chinapay.PrivateKey();

		log().debug("商户号 : " + merId);
		log().debug("公  钥 : " + pubKey);

		boolean suc = key.buildKey(merId, 0, pubKey);
		if (!suc) {
			log().error("创建公钥对象失败");
			return false;
		}

		chinapay.SecureLink t;
		t = new chinapay.SecureLink(key);
		boolean match = t.verifyAuthToken(plainText, signedText);
		log().debug("数据明文 和 签名文本 匹配 : " + match);
		return match;
	}
}
