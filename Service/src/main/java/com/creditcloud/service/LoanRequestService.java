/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRequestService {

    /**
     * fail to submit loan request
     */
    int ADD_FAIL = 0;

    /**
     * succeed to submit loan request
     */
    int ADD_SUCCESS = 1;

    /**
     * exceed 3 submit in one day
     */
    int OUT_OF_MAX_LOAN = 2;

    /**
     *
     * @param clientCode
     * @param loanRequest
     * @return 0 for failure, 1 for success, 2 for exceed 3 submit in one day
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    int submitLoanRequest(String clientCode, LoanRequest loanRequest);

    /**
     * get LoanRequest by id
     *
     * @param clientCode
     * @param requestId
     * @return LoanRequest
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    LoanRequest getRequestById(String clientCode, String requestId);

    /**
     * cancel a loan request
     *
     * @param clientCode
     * @param requestId
     * @return true if successful
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean cancelLoanRequest(String clientCode, String requestId);

    /**
     * list loan request by user id
     *
     * @param clientCode
     * @param userId
     * @param pageInfo
     * @return empty result is no loan found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    PagedResult<LoanRequest> listRequestByUserId(String clientCode, String userId, PageInfo pageInfo);
}
