/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.LoanRequestResult;

/**
 * 提交贷款申请的返回结果
 *
 * @author rooseek
 */
public class SubmitRequestResult extends BaseObject {

    private final LoanRequestResult result;

    private final LoanRequest request;

    public SubmitRequestResult(LoanRequestResult result, LoanRequest request) {
        this.result = result;
        this.request = request;
    }

    public LoanRequestResult getResult() {
        return result;
    }

    public LoanRequest getRequest() {
        return request;
    }
}
