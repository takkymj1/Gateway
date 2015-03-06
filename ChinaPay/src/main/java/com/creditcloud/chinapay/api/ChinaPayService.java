package com.creditcloud.chinapay.api;

import java.util.Map;

import com.creditcloud.chinapay.api.model.pojo.BankAccount;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutPostParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SingleCutQueryParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayPostParameters;
import com.creditcloud.chinapay.api.model.pojo.request.SinglePayQueryParameters;
import com.creditcloud.chinapay.api.model.pojo.response.SingleCutPostResult;
import com.creditcloud.chinapay.api.model.pojo.response.SingleCutQueryResult;
import com.creditcloud.chinapay.api.model.pojo.response.SinglePayPostResult;
import com.creditcloud.chinapay.api.model.pojo.response.SinglePayQueryResult;

public interface ChinaPayService {
	/**
	 * do nothing
	 *
	 * @return "ChinaPay" always
	 */
	String ping();

	SinglePayPostResult singlePayTrans(SinglePayPostParameters parameters);

	SinglePayQueryResult singlePayQuery(SinglePayQueryParameters parameters);

	SingleCutPostResult singleCutTrans(SingleCutPostParameters parameters);

	SingleCutQueryResult singleCutQuery(SingleCutQueryParameters parameters);

	Map<String, String> validateBankAccount(BankAccount account);
}
