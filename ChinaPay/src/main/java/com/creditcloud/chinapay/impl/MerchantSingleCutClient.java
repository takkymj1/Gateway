package com.creditcloud.chinapay.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import com.creditcloud.chinapay.api.exception.HTTPException;
import com.creditcloud.chinapay.api.exception.InvalidResponseFormatException;
import com.creditcloud.chinapay.api.exception.MaliciousServerException;
import com.creditcloud.chinapay.api.model.pojo.PlainTextSignaturePair;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutPostParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutQueryParameters;
import com.creditcloud.chinapay.api.model.pojo.response.SingleCutPostResult;
import com.creditcloud.chinapay.api.model.pojo.response.SingleCutQueryResult;
import com.creditcloud.chinapay.impl.utils.Constants;

public class MerchantSingleCutClient extends MerchantChianPayNetClientBase {
	protected String urlSingleCutPost = Constants.URL_SINGLE_CUT_POST_TEST;
	protected String urlSingleCutQuery = Constants.URL_SINGLE_CUT_QUERY_TEST;

	public SingleCutQueryResult query(SingleCutQueryParameters parameters) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();

		// 创建POST对象,设定POST FORM的目标地址
		HttpPost post = new HttpPost(urlSingleCutQuery);
		post.setHeader("User-Agent", USER_AGENT);
		post.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded;charset=" + encoding);

		// 组织要提交的FORM的数据
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("merId", parameters.getMerId()));
		urlParameters.add(new BasicNameValuePair("transType", parameters.getTransType()));
		urlParameters.add(new BasicNameValuePair("orderNo", parameters.getOrderNo()));
		urlParameters.add(new BasicNameValuePair("transDate", parameters.getTransDate()));
		urlParameters.add(new BasicNameValuePair("version", parameters.getVersion()));
		urlParameters.add(new BasicNameValuePair("priv1", parameters.getUnicodePriv1()));
		urlParameters.add(new BasicNameValuePair("chkValue", parameters.getChkValue()));
		post.setEntity(new UrlEncodedFormEntity(urlParameters, encoding));

		// 执行FORM的POST
		HttpResponse response = client.execute(post);

		// 获得HTTP返回码
		int status_code = response.getStatusLine().getStatusCode();
		log().debug("单笔代扣查询POST返回HTTP status code : " + status_code);

		// 读取HTTP响应数据
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		log().debug("单笔代扣查询POST返回内容  : " + result.toString());

		if (status_code != HTTP_STATUS_OK)
			// 如果遇到HTTP失败,报异常
			throw new HTTPException("和服务器通讯发生故障,HTTP状态码 : " + status_code + ",Response数据 : " + result.toString());

		String responseText = result.toString();
		// 验证返回数据来自合法的服务器
		final String DELIMITER = "&chkValue=";
		PlainTextSignaturePair pair = parsePlainTextSignaturePairFromResponseText(responseText, DELIMITER);
		if (PlainTextSignaturePair.isNullPair(pair))
			throw new InvalidResponseFormatException("服务器的返回数据格式不正确:" + result);
		pair.plainText += DELIMITER;

		log().debug("单笔代扣查询POST返回内容明文部分 : " + pair.plainText);
		log().debug("单笔代扣查询POST返回内容签名内容 : " + pair.signature);

		boolean match = verifyTextAgainstSignature(pair);
		if (!match)
			throw new MaliciousServerException("来自服务器的数据验证失败,明文:[" + pair.plainText + "],签名:[" + pair.signature + "]");

		SingleCutQueryResult singleCutQueryResult = SingleCutQueryResult.parse(responseText);
		log().debug(singleCutQueryResult);
		return singleCutQueryResult;
	}

	public SingleCutPostResult post(SingleCutPostParameters parameters) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();

		// 创建POST对象,设定POST FORM的目标地址
		HttpPost post = new HttpPost(urlSingleCutPost);
		post.setHeader("User-Agent", USER_AGENT);
		post.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded;charset=" + encoding);

		// 组织要提交的FORM的数据
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("merId", parameters.getMerId()));
		urlParameters.add(new BasicNameValuePair("transDate", parameters.getTransDate()));
		urlParameters.add(new BasicNameValuePair("orderNo", parameters.getOrderNo()));
		urlParameters.add(new BasicNameValuePair("transType", parameters.getTransType()));
		urlParameters.add(new BasicNameValuePair("openBankId", parameters.getOpenBankId()));
		urlParameters.add(new BasicNameValuePair("cardType", parameters.getCardType()));
		urlParameters.add(new BasicNameValuePair("cardNo", parameters.getCardNo()));
		urlParameters.add(new BasicNameValuePair("usrName", parameters.getUnicodeUsrName()));
		urlParameters.add(new BasicNameValuePair("certType", parameters.getCertType()));
		urlParameters.add(new BasicNameValuePair("certId", parameters.getCertId()));
		urlParameters.add(new BasicNameValuePair("curyId", parameters.getCuryId()));
		urlParameters.add(new BasicNameValuePair("transAmt", parameters.getTransAmt()));
		urlParameters.add(new BasicNameValuePair("purpose", parameters.getUnicodePurpose()));
		urlParameters.add(new BasicNameValuePair("priv1", parameters.getUnicodePriv1()));
		urlParameters.add(new BasicNameValuePair("version", parameters.getVersion()));
		urlParameters.add(new BasicNameValuePair("gateId", parameters.getGateId()));
		urlParameters.add(new BasicNameValuePair("chkValue", parameters.getChkValue()));
		post.setEntity(new UrlEncodedFormEntity(urlParameters, encoding));

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
		log().debug("单笔代扣交易POST返回内容  : " + result.toString());

		if (status_code != HTTP_STATUS_OK)
			// 如果遇到HTTP失败,报异常
			throw new HTTPException("和服务器通讯发生故障,HTTP状态码 : " + status_code + ",Response数据 : " + result.toString());

		String responseText = result.toString();
		// 验证返回数据来自合法的服务器
		final String DELIMITER = "&chkValue=";
		PlainTextSignaturePair pair = parsePlainTextSignaturePairFromResponseText(responseText, DELIMITER);
		pair.plainText += DELIMITER;
		if (PlainTextSignaturePair.isNullPair(pair))
			throw new InvalidResponseFormatException("服务器的返回数据格式不正确:" + responseText);

		log().debug("单笔代扣交易POST返回内容明文部分 : " + pair.plainText);
		log().debug("单笔代扣交易POST返回内容签名内容 : " + pair.signature);

		boolean match = verifyTextAgainstSignature(pair);
		if (!match)
			throw new MaliciousServerException("来自服务器的数据验证失败,明文:[" + pair.plainText + "],签名:[" + pair.signature + "]");
		SingleCutPostResult singleCutPostResult = SingleCutPostResult.parse(responseText);
		log().debug(singleCutPostResult);
		return singleCutPostResult;
	}



	public String getUrlSingleCutPost() {
		return urlSingleCutPost;
	}

	public void setUrlSingleCutPost(String urlSingleCutPost) {
		this.urlSingleCutPost = urlSingleCutPost;
	}

	public String getUrlSingleCutQuery() {
		return urlSingleCutQuery;
	}

	public void setUrlSingleCutQuery(String urlSingleCutQuery) {
		this.urlSingleCutQuery = urlSingleCutQuery;
	}
}
