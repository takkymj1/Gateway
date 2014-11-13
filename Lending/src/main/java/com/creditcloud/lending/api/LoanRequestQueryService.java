/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;

/**
 *
 * @author rooseek
 */
public interface LoanRequestQueryService {

    /**
     *
     * @param userId
     * @return
     */
    public int checkTodayLoanRequestCount(String userId);

    /**
     * count loan request by user and status
     *
     * @param userId
     * @param status
     * @return
     */
    public int countByUserAndStatus(final String userId, final LoanRequestStatus... status);

    /**
     * list by user and loan request status
     *
     * @param userId
     * @param pageInfo
     * @param status
     * @return
     */
    public PagedResult<LoanRequest> listByUserAndStatus(final String userId, final PageInfo pageInfo, final LoanRequestStatus... status);

    /**
     * count loan request by employee and status
     *
     * @param employeeId
     * @param status
     * @return
     */
    public int countByEmployeeAndStatus(final String employeeId, final LoanRequestStatus... status);

    /**
     * list by employee and loan request status
     *
     * @param employeeId
     * @param pageInfo
     * @param status
     * @return
     */
    public PagedResult<LoanRequest> listByEmployeeAndStatus(final String employeeId, final PageInfo pageInfo, final LoanRequestStatus... status);
   
    /**
     * 按LoanRequestStatus列出一定时间内提交的LoanRequest
     *
     * @param from
     * @param to
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRequest> listByStatusAndDate(Date from, Date to, PageInfo info, LoanRequestStatus... status);

    public PagedResult<LoanRequest> listByStatus(PageInfo info, LoanRequestStatus... status);
}
