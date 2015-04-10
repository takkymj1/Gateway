/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.TopInvester;
import com.creditcloud.model.ElementCount;
import com.creditcloud.model.ElementSum;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.BidMethod;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rooseek
 */
public interface InvestQueryService {

    /**
     * count invest by user
     *
     * @param userId
     * @param statusList
     * @return
     */
    public int countByUserAndStatus(String userId, List<InvestStatus> statusList);

    /**
     * list invest by user
     *
     * @param userId
     * @param pageInfo
     * @param statusList
     * @return
     */
    public PagedResult<Invest> listByUserAndStatus(String userId, PageInfo pageInfo, List<InvestStatus> statusList);

    /**
     * count invest by loan
     *
     * @param loanId
     * @param statusList
     * @return
     */
    public int countByLoanAndStatus(String loanId, List<InvestStatus> statusList);

    /**
     * list invest by loan
     *
     * @param loanId
     * @param pageInfo
     * @param status
     * @return
     */
    public PagedResult<Invest> listByLoanAndStatus(String loanId, PageInfo pageInfo, List<InvestStatus> status);

    /**
     * sum invest by loan
     *
     * @param loanId
     * @param status
     * @return
     */
    public int sumByLoanAndStatus(String loanId, List<InvestStatus> status);

    /**
     * sum invest by user and loan
     *
     * @param userId
     * @param loanId
     * @return
     */
    public int sumByLoanAndUser(String userId, String loanId);

    /**
     * count by loan and user and bidMethod
     *
     * @param userId
     * @param loanId
     * @param statusList
     * @param bidMethods
     * @return
     */
    public int countByLoanAndUser(String userId, String loanId, List<InvestStatus> statusList, List<BidMethod> bidMethods);

    /**
     * list by loan and user
     *
     * @param userId
     * @param loanId
     * @param statusList
     * @param bidMethods
     * @return
     */
    public List<Invest> listByLoanAndUser(String userId, String loanId, List<InvestStatus> statusList, List<BidMethod> bidMethods);

    /**
     * list invest between fromdate and todate
     *
     * @param userId
     * @param from
     * @param to
     * @param statusList
     * @return
     */
    public List<Invest> listByUserAndSubmitTime(String userId, Date from, Date to, List<InvestStatus> statusList);

    /**
     * 按InvestStatus统计用户用户对贷款的投资笔数
     *
     * @param userId
     * @param statusList
     * @return
     */
    public List<ElementCount<InvestStatus>> countLoanInvestByUserAndStatus(String userId, List<InvestStatus> statusList);

    /**
     * 按InvestStatus统计用户对贷款的投资总额
     *
     * @param userId
     * @param statusList
     * @return
     */
    public List<ElementSum<InvestStatus>> sumLoanInvestByUserAndStatus(String userId, List<InvestStatus> statusList);

    /**
     * 统计用户已借出的借款总额
     *
     * @param userId
     * @param statusList
     * @return
     */
    public long sumLoanInvestByUser(String userId, List<InvestStatus> statusList);

    /**
     * 统计用户已借出的借款总额, 返回类型使用 BigDecimal
     *
     * @param userId
     * @param statusList
     * @return
     */
    public BigDecimal sumLoanInvestByUser2BigDecimal(String userId, List<InvestStatus> statusList);
    
    /**
     * 列出所有投资某贷款的用户id,用于发送通知
     *
     * @param loanId
     * @param statusList
     * @return 不重复的userId集合
     */
    public Set<String> listUserByLoan(String loanId, List<InvestStatus> statusList);

    /**
     * 列出loan对应的所有投标，按照用户排序
     *
     * @param loanId
     * @param statusList
     * @return
     */
    public List<Invest> listByLoanOrderByUser(String loanId, List<InvestStatus> statusList);

    public int countByStatus(List<InvestStatus> statusList);

    public List<ElementCount<InvestStatus>> countEachByLoanAndStatus(String loanId, List<InvestStatus> statusList);

    public List<ElementSum<InvestStatus>> sumEachByLoanAndStatus(String loanId, List<InvestStatus> statusList);

    public PagedResult<Invest> listByStatus(PageInfo pageInfo, List<InvestStatus> statusList);

    public List<TopInvester> listTopInvester(int topSize, List<InvestStatus> statusList);

    public List<ElementSum<String>> sumByUserAndDate(Date from, Date to, List<String> userIds, List<InvestStatus> statusList);

    public BigDecimal sumAllByUserAndDate(Date from, Date to, List<String> userIds, List<InvestStatus> statusList);

    /**
     *
     * @param from
     * @param to
     * @param minAmount
     * @param statusList
     * @param userIds
     * @return
     */
    public List<Invest> listByMinAmount(Date from,
                                        Date to,
                                        BigDecimal minAmount,
                                        List<InvestStatus> statusList,
                                        List<String> userIds);

    public int countByUserAndStatusAndPurpose(String userId,
                                              List<InvestStatus> statusList,
                                              List<LoanPurpose> purposeList);

    public PagedResult<Invest> listByUserAndStatusAndPurpose(String userId,
                                                             List<InvestStatus> statusList,
                                                             List<LoanPurpose> purposeList,
                                                             PageInfo pageInfo);

    public List<Invest> listByUserAndStatusAndLoans(String userId, PageInfo pageInfo, List<InvestStatus> statusList, List<String> loanList);
    
    public List<Invest> listByIdsAndStatus(List<String> investIds, List<InvestStatus> statusList);
    
    public PagedResult<Invest> listByUserAndStatusForCs(String id, PageInfo ALL, List<InvestStatus> asList);
}
