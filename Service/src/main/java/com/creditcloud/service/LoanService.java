/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanReward;
import com.creditcloud.model.loan.LoanStatistics;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface LoanService extends LoanRequestService {

    /**
     * 主要供CreditMarket中更新状态用,只有OPENED/FAILED/FINISHED三种状态可以从CreditMarket更新
     *
     * @param clientCode
     * @param loanId
     * @param status
     * @param bidNumber
     * @param bidAmount
     * @return true if successful
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean markLoanStatus(String clientCode, String loanId, LoanStatus status, int bidNumber, int bidAmount);

    /**
     * get Loan by id
     *
     * @param clientCode
     * @param loanId
     * @return Loan
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    Loan getLoanById(String clientCode, String loanId);

    /**
     * list loan by user id
     *
     * @param clientCode
     * @param userId
     * @param pageInfo
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    PagedResult<Loan> listLoanByUser(String clientCode, String userId, PageInfo pageInfo);

    /**
     * list loan by user and status during certain period
     *
     * @param clientCode
     * @param userId
     * @param from
     * @param to
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<Loan> listLoanByUser(String clientCode, String userId, Date from, Date to, PageInfo pageInfo, LoanStatus... status);

    /**
     * list loan by loan request id
     *
     * @param clientCode
     * @param requestId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<Loan> listLoanByRequest(String clientCode, String requestId);

    /**
     * list loans by their status 默认不列出hidden的loan
     *
     * @param clientCode
     * @param statusList
     * @param pageInfo
     * @return
     */
    PagedResult<Loan> listLoanByStatus(String clientCode, PageInfo pageInfo, LoanStatus... statusList);

    /**
     * 列出所有非公开特定用户群体才能投的loan
     *
     * @param clientCode
     * @param statusList
     * @return
     */
    List<Loan> listPersonalLoanByStatus(String clientCode, LoanStatus... statusList);

    /**
     * 获得借款人的借款统计信息
     *
     * @param clientCode
     * @param userId
     * @return
     */
    LoanStatistics getLoanStatistics(String clientCode, String userId);

    /**
     * 借款标对应的投标奖励规则
     *
     * @param clientCode
     * @param loanId
     * @return
     */
    List<LoanReward> listLoanReward(String clientCode, String loanId);
}
