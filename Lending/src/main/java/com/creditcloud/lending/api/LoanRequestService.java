/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.LoanStat;
import com.creditcloud.lending.model.RequestAvg;
import com.creditcloud.model.ElementCount;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.loan.SubmitRequestResult;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.User;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRequestService {

    public SubmitRequestResult addNew(LoanRequest loanRequest,
                                      User user);

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
     *
     * @param userId
     * @return
     */
    public int checkTodayLoanRequestCount(String userId);

    /**
     * 获取一段时间内每天新提交的Loan数目
     *
     * @param from
     * @param to
     * @return
     */
    public List<ElementCount<Date>> getDailyNewLoan(Date from, Date to);

    /**
     * 获取一段时间内每天新提交的Loan金额的总额
     *
     * @param from
     * @param to
     * @return
     */
    public List<ElementCount<Date>> getDailyNewLoanSum(Date from, Date to);

    /**
     * 获取一段时间内新提交Loan数目总和
     *
     * @param from
     * @param to
     * @return
     */
    public int getLoanCount(Date from, Date to);

    /**
     * 获取一段时间内新提交Loan金额总和
     *
     * @param from
     * @param to
     * @return
     */
    public int getLoanSum(Date from, Date to);

    /**
     * count loans by LoanStatus
     *
     * @return
     */
    public List getLoanCountByStatus();

    /**
     * count loans by LoanPurpose
     *
     * @return
     */
    public List getLoanCountByPurpose();

    /**
     * 按LoanRequestStatus统计一定时间内提交的LoanRequest
     *
     * @param from
     * @param to
     * @param status
     * @return
     */
    public int countByStatus(Date from, Date to, LoanRequestStatus... status);

    public int countByStatus(LoanRequestStatus... status);

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

    /**
     * 按请求状态统计
     *
     * @param status
     * @return
     */
    public List<LoanStat<LoanRequestStatus>> countAndSumEachByStatus(LoanRequestStatus... status);

    /**
     * 按还款方式统计
     *
     * @param statusList
     * @param method
     * @return
     */
    public List<LoanStat<RepaymentMethod>> countAndSumEachByMethod(List<LoanRequestStatus> statusList, RepaymentMethod... method);

    /**
     * 按来源统计
     *
     * @param statusList
     * @param source
     * @return
     */
    public List<LoanStat<Source>> countAndSumEachBySource(List<LoanRequestStatus> statusList, Source... source);

    /**
     * 按有无抵押综合统计
     *
     * @param statusList
     * @return
     */
    public List<LoanStat<Boolean>> countAndSumEachByMortgaged(List<LoanRequestStatus> statusList);

    /**
     * 按申请用途
     *
     * @param statusList
     * @param purpose
     * @return
     */
    public List<LoanStat<LoanPurpose>> countAndSumEachByPurpose(List<LoanRequestStatus> statusList, LoanPurpose... purpose);

    /**
     * 按经办人
     *
     * @param statusList
     * @return
     */
    public List<LoanStat<String>> countAndSumEachByEmployee(List<LoanRequestStatus> statusList);

    /**
     * 统计所有申请平均值
     *
     * @param status
     * @return
     */
    public RequestAvg avgByStatus(LoanRequestStatus... status);

    public boolean markStatus(LoanRequestStatus status, String id);
}
