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
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayPostParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayQueryParameters;
import com.creditcloud.chinapay.api.model.pojo.response.SinglePayPostResult;
import com.creditcloud.chinapay.api.model.pojo.response.SinglePayQueryResult;
import com.creditcloud.chinapay.impl.utils.Constants;

public class MerchantSinglePayClient extends MerchantChianPayNetClientBase {
	protected String urlSinglePayPost = Constants.URL_SINGLE_PAY_POST_TEST;
	protected String urlSinglePayQuery = Constants.URL_SINGLE_PAY_QUERY_TEST;

	public String getUrlSinglePayPost() {
		return urlSinglePayPost;
	}

	public void setUrlSinglePayPost(String urlSinglePayPost) {
		this.urlSinglePayPost = urlSinglePayPost;
	}

	public String getUrlSinglePayQuery() {
		return urlSinglePayQuery;
	}

	public void setUrlSinglePayQuery(String urlSinglePayQuery) {
		this.urlSinglePayQuery = urlSinglePayQuery;
	}

	public SinglePayQueryResult query(SinglePayQueryParameters parameters) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();

		// 创建POST对象,设定POST FORM的目标地址
		HttpPost post = new HttpPost(urlSinglePayQuery);
		post.setHeader("User-Agent", USER_AGENT);
		post.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded;charset=" + encoding);

		// 组织要提交的FORM的数据
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("merId", parameters.getMerId()));
		urlParameters.add(new BasicNameValuePair("merDate", parameters.getMerDate()));
		urlParameters.add(new BasicNameValuePair("merSeqId", parameters.getMerSeqId()));
		urlParameters.add(new BasicNameValuePair("version", parameters.getVersion()));
		urlParameters.add(new BasicNameValuePair("chkValue", parameters.getChkValue()));
		urlParameters.add(new BasicNameValuePair("signFlag", parameters.getSignFlag()));
		post.setEntity(new UrlEncodedFormEntity(urlParameters, encoding));

		// 执行FORM的POST
		HttpResponse response = client.execute(post);

		// 获得HTTP返回码
		int status_code = response.getStatusLine().getStatusCode();
		log().debug("单笔代付查询POST返回HTTP status code : " + status_code);

		// 读取HTTP响应数据
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		log().debug("单笔代付查询POST返回内容  : " + result.toString());

		if (status_code != HTTP_STATUS_OK)
			// 如果遇到HTTP失败,报异常
			throw new HTTPException("和服务器通讯发生故障,HTTP状态码 : " + status_code + ",Response数据 : " + result.toString());

		String responseText = result.toString();
		// 验证返回数据来自合法的服务器
		String DELIMITER = "|";
		PlainTextSignaturePair pair = parsePlainTextSignaturePairFromResponseText(responseText, DELIMITER);
		pair.plainText += DELIMITER;

		if (PlainTextSignaturePair.isNullPair(pair))
			throw new InvalidResponseFormatException("服务器的返回数据格式不正确:" + responseText);

		log().debug("单笔代付查询POST返回明文信息 : " + pair.plainText);
		log().debug("单笔代付查询POST返回签名内容 : " + pair.signature);

		boolean match = verifyTextAgainstSignature(pair);
		if (!match)
			throw new MaliciousServerException("来自服务器的数据验证失败,明文:[" + pair.plainText + "],签名:[" + pair.signature + "]");

		SinglePayQueryResult singlePayQueryResult = SinglePayQueryResult.parse(responseText);
		log().debug(singlePayQueryResult);
		return singlePayQueryResult;
	}

	public SinglePayPostResult post(SinglePayPostParameters parameters) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();

		// 创建POST对象,设定POST FORM的目标地址
		HttpPost post = new HttpPost(urlSinglePayPost);
		post.setHeader("User-Agent", USER_AGENT);
		post.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded;charset=" + encoding);

		// 组织要提交的FORM的数据
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("merId", parameters.getMerId()));
		urlParameters.add(new BasicNameValuePair("merDate", parameters.getMerDate()));
		urlParameters.add(new BasicNameValuePair("merSeqId", parameters.getMerSeqId()));
		urlParameters.add(new BasicNameValuePair("cardNo", parameters.getCardNo()));
		urlParameters.add(new BasicNameValuePair("usrName", parameters.getUsrName()));
		urlParameters.add(new BasicNameValuePair("openBank", parameters.getOpenBank()));
		urlParameters.add(new BasicNameValuePair("prov", parameters.getProv()));
		urlParameters.add(new BasicNameValuePair("city", parameters.getCity()));
		urlParameters.add(new BasicNameValuePair("transAmt", parameters.getTransAmt()));
		urlParameters.add(new BasicNameValuePair("purpose", parameters.getPurpose()));
		urlParameters.add(new BasicNameValuePair("subBank", parameters.getSubBank()));
		urlParameters.add(new BasicNameValuePair("flag", parameters.getFlag()));
		urlParameters.add(new BasicNameValuePair("version", parameters.getVersion()));
		urlParameters.add(new BasicNameValuePair("chkValue", parameters.getChkValue()));
		urlParameters.add(new BasicNameValuePair("signFlag", parameters.getSignFlag()));
		post.setEntity(new UrlEncodedFormEntity(urlParameters, encoding));

		// 执行FORM的POST
		HttpResponse response = client.execute(post);

		// 获得HTTP返回码
		int status_code = response.getStatusLine().getStatusCode();
		log().debug("单笔代付交易POST返回 HTTP status code : " + status_code);

		// 读取HTTP响应数据
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		log().debug("单笔代付交易POST返回内容 : " + result.toString());

		if (status_code != HTTP_STATUS_OK)
			// 如果遇到HTTP失败,报异常
			throw new HTTPException("和服务器通讯发生故障,HTTP状态码 : " + status_code + ",Response数据 : " + result.toString());

		String responseText = result.toString();
		// 验证返回数据来自合法的服务器
		String DELIMITER = "&chkValue=";
		PlainTextSignaturePair pair = parsePlainTextSignaturePairFromResponseText(responseText, DELIMITER);
		if (PlainTextSignaturePair.isNullPair(pair))
			throw new InvalidResponseFormatException("服务器的返回数据格式不正确:" + result);

		log().debug("单笔代付交易POST返回结果明文信息 : " + pair.plainText);
		log().debug("单笔代付交易POST返回结果签名内容 : " + pair.signature);

		boolean match = verifyTextAgainstSignature(pair);
		if (!match)
			throw new MaliciousServerException("来自服务器的数据验证失败,明文:[" + pair.plainText + "],签名:[" + pair.signature + "]");
		SinglePayPostResult singlePayPostResult = SinglePayPostResult.parse(responseText);
		log().debug(singlePayPostResult);
		return singlePayPostResult;
	}
}
