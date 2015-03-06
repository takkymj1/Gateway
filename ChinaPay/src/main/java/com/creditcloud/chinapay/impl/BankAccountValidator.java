package com.creditcloud.chinapay.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.creditcloud.chinapay.api.exception.HTTPException;
import com.creditcloud.chinapay.api.exception.MaliciousServerException;
import com.creditcloud.chinapay.api.model.pojo.BankAccount;
import com.creditcloud.chinapay.api.utils.StringUtils;
import com.creditcloud.chinapay.impl.utils.BankValidatorSignUtils;

public class BankAccountValidator {
	protected final int HTTP_STATUS_OK = 200;

	protected Log log() {
		Log log = LogFactory.getLog(getClass());
		return log;
	}

	protected String urlValidating = "http://140.206.112.245/USWeb/service/param";

	// 系统编号:缺省为测试系统编号
	protected String appSysID = "90000";
	// 签名密钥:缺省为测试签名密钥
	protected String signKey = "88888888";

	public Map<String, String> validate(BankAccount account) throws Exception {
		String url = buildValidatingURL(account);

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet post = new HttpGet(url);

		// 执行FORM的POST
		HttpResponse response = client.execute(post);

		// 获得HTTP返回码
		int status_code = response.getStatusLine().getStatusCode();
		log().debug("HTTP status code : " + status_code);

		// 读取HTTP响应数据
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		log().debug("Response  : " + result.toString());
		if (status_code != HTTP_STATUS_OK)
			// 如果遇到HTTP失败,报异常
			throw new HTTPException("和服务器通讯发生故障,HTTP状态码 : " + status_code + ",Response数据 : " + result.toString());

		String responseText = result.toString();
		final String PAIR_DELIMITER = "&";
		final String NAME_VALUE_DELIMITER = "=";
		Map<String, String> namedValues = StringUtils.parseNamedValues(responseText, PAIR_DELIMITER,
				NAME_VALUE_DELIMITER);

		boolean isComingFromTrustedServer = verifyRepsonseParameters(namedValues);
		if (!isComingFromTrustedServer)
			throw new MaliciousServerException("来自服务器的数据验证失败:" + responseText);

		return namedValues;
	}

	protected boolean verifyRepsonseParameters(Map<String, String> responseParameters) {
		// 不参与签名的参数
		Set<String> itemsToIgnore = new HashSet<String>();
		itemsToIgnore.add("signMethod");
		itemsToIgnore.add("signature");
		String messageToSign = BankValidatorSignUtils.buildURLParameters(responseParameters, true, itemsToIgnore);
		String responseSignature = BankValidatorSignUtils.sign(messageToSign, signKey);
		boolean match = responseSignature.equalsIgnoreCase(responseParameters.get("signature"));
		return match;
	}

	protected String buildValidatingURL(BankAccount account) {
		Map<String, String> parameters = fromAccountToValidatorParameters(account);
		String signature = sign(parameters);
		parameters.put("signature", signature);

		String usrName = (String) parameters.get("usrName");
		if (StringUtils.isNotEmpty(usrName)) {
			// 对usrName进行utf-8 URLEncoding编码
			String encoded = utf8URLEncoding(usrName);
			parameters.put("usrName", encoded);
		}

		boolean toSort = true;
		final String urlParameters = BankValidatorSignUtils.buildURLParameters(parameters, toSort, null);
		final String url = urlValidating + "?" + urlParameters;
		log().debug("银行卡账户银联后台验证URL:" + url);

		return url;
	}

	protected String sign(Map<String, String> parameters) {
		// 不参与签名的参数
		Set<String> keysToIgnore = new HashSet<String>();
		keysToIgnore.add("signMethod");
		keysToIgnore.add("signature");
		boolean toSort = true;
		String messageToSign = BankValidatorSignUtils.buildURLParameters(parameters, toSort, keysToIgnore);
		String signature = BankValidatorSignUtils.sign(messageToSign, signKey);
		return signature;
	}

	protected String utf8URLEncoding(String text) {
		try {
			String encoded = URLEncoder.encode(text, "UTF-8");
			return encoded;
		} catch (UnsupportedEncodingException e) {
			return text;
		}
	}

	protected Map<String, String> fromAccountToValidatorParameters(BankAccount account) {
		Map<String, String> map = new HashMap<String, String>();
		// 系统编号
		map.put("appSysId", appSysID);
		map.put("signMethod", "MD5");
		map.put("save", "false");

		map.put("cardNo", account.getCardNo());
		map.put("certType", account.getCertType());
		map.put("certNo", account.getCertNo());
		map.put("usrName", account.getUserName());
		map.put("dcType", account.getDcType());
		map.put("channelId", account.getChannelId());

		return map;
	}

	public String getUrlValidating() {
		return urlValidating;
	}

	public void setValidatingURL(String urlValidating) {
		this.urlValidating = urlValidating;
	}

	public String getAppSysID() {
		return appSysID;
	}

	public void setAppSysID(String appSysID) {
		this.appSysID = appSysID;
	}

	public String getSignKey() {
		return signKey;
	}

	public void setSignKey(String signKey) {
		this.signKey = signKey;
	}

}
