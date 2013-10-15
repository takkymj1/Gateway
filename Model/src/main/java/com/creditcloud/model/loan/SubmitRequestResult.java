/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.LoanRequestResult;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 提交贷款申请的返回结果
 *
 * @author rooseek
 */
@XmlRootElement
public class SubmitRequestResult extends BaseObject {

    private static final long serialVersionUID = 20131015L;

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
