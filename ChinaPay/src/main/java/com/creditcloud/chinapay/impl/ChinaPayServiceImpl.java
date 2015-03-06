package com.creditcloud.chinapay.impl;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.creditcloud.chinapay.api.ChinaPayService;
import com.creditcloud.chinapay.api.model.pojo.BankAccount;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutPostParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutQueryParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayPostParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayQueryParameters;
import com.creditcloud.chinapay.api.model.pojo.response.SingleCutPostResult;
import com.creditcloud.chinapay.api.model.pojo.response.SingleCutQueryResult;
import com.creditcloud.chinapay.api.model.pojo.response.SinglePayPostResult;
import com.creditcloud.chinapay.api.model.pojo.response.SinglePayQueryResult;
import com.creditcloud.chinapay.impl.utils.Constants;

public class ChinaPayServiceImpl implements ChinaPayService {
	protected Log log() {
		Log log = LogFactory.getLog(getClass());
		return log;
	}

	@Override
	public String ping() {
		return "ChinaPay";
	}

	@Override
	public SinglePayPostResult singlePayTrans(SinglePayPostParameters parameters) {
		try {
			MerchantSinglePayClient client = new MerchantSinglePayClient();
			client.setUrlSinglePayPost(Constants.URL_SINGLE_PAY_POST_TEST);
			client.setUrlSinglePayQuery(Constants.URL_SINGLE_PAY_QUERY_TEST);
			client.setMerchantId(Constants.MERCHANT_ID_SINGLE_PAY_ZMT);
			client.setMerchantPrivateKey(Constants.SINGLE_PAY_PRIVATE_KEY_ZMT);
			client.setChinaPayId(Constants.CHINAPAY_MERCHANT_ID);
			client.setChinaPayPublicKey(Constants.SINGLE_PAY_PUBLIC_KEY_ZMT);
			SinglePayPostResult result = client.post(parameters);
			return result;
		} catch (Exception e) {
			log().error("单笔代付交易异常,请联系开发人员", e);
			return null;
		}
	}

	@Override
	public SinglePayQueryResult singlePayQuery(SinglePayQueryParameters parameters) {
		try {
			MerchantSinglePayClient client = new MerchantSinglePayClient();
			client.setUrlSinglePayPost(Constants.URL_SINGLE_PAY_POST_TEST);
			client.setUrlSinglePayQuery(Constants.URL_SINGLE_PAY_QUERY_TEST);
			client.setMerchantId(Constants.MERCHANT_ID_SINGLE_PAY_ZMT);
			client.setMerchantPrivateKey(Constants.SINGLE_PAY_PRIVATE_KEY_ZMT);
			client.setChinaPayId(Constants.CHINAPAY_MERCHANT_ID);
			client.setChinaPayPublicKey(Constants.SINGLE_PAY_PUBLIC_KEY_ZMT);
			SinglePayQueryResult result = client.query(parameters);
			return result;
		} catch (Exception e) {
			log().error("单笔代付查询异常,请联系开发人员", e);
			return null;
		}
	}

	@Override
	public SingleCutPostResult singleCutTrans(SingleCutPostParameters parameters) {
		try {
			MerchantSingleCutClient client = new MerchantSingleCutClient();
			client.setUrlSingleCutPost(Constants.URL_SINGLE_CUT_POST_TEST);
			client.setUrlSingleCutQuery(Constants.URL_SINGLE_CUT_QUERY_TEST);
			client.setMerchantId(Constants.MERCHANT_ID_SINGLE_CUT_ZMT);
			client.setMerchantPrivateKey(Constants.SINGLE_CUT_PRIVATE_KEY_ZMT);
			client.setChinaPayId(Constants.CHINAPAY_MERCHANT_ID);
			client.setChinaPayPublicKey(Constants.SINGLE_CUT_PUBLIC_KEY_ZMT);
			SingleCutPostResult result = client.post(parameters);
			return result;
		} catch (Exception e) {
			log().error("单笔代扣交易异常,请联系开发人员", e);
			return null;
		}
	}

	@Override
	public SingleCutQueryResult singleCutQuery(SingleCutQueryParameters parameters) {
		try {
			MerchantSingleCutClient client = new MerchantSingleCutClient();
			client.setUrlSingleCutPost(Constants.URL_SINGLE_CUT_POST_TEST);
			client.setUrlSingleCutQuery(Constants.URL_SINGLE_CUT_QUERY_TEST);
			client.setMerchantId(Constants.MERCHANT_ID_SINGLE_CUT_ZMT);
			client.setMerchantPrivateKey(Constants.SINGLE_CUT_PRIVATE_KEY_ZMT);
			client.setChinaPayId(Constants.CHINAPAY_MERCHANT_ID);
			client.setChinaPayPublicKey(Constants.SINGLE_CUT_PUBLIC_KEY_ZMT);
			SingleCutQueryResult result = client.query(parameters);
			return result;
		} catch (Exception e) {
			log().error("单笔代扣查询异常,请联系开发人员", e);
			return null;
		}
	}

	@Override
	public Map<String, String> validateBankAccount(BankAccount account) {
		try {
			BankAccountValidator validator = new BankAccountValidator();
			validator.setSignKey("88888888");
			validator.setAppSysID("90000");
			validator.setValidatingURL("http://140.206.112.245/USWeb/service/param");
			Map<String, String> responseResult = validator.validate(account);
			return responseResult;
		} catch (Exception e) {
			log().error("单笔代扣查询异常,请联系开发人员", e);
			return null;
		}
	}

}
