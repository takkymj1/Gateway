/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rooseek
 */
public interface LoanQueryService {

    /**
     * count by user id
     *
     * @param userId
     * @return
     */
    public int countByUser(String userId);

    /**
     * list by user id
     *
     * @param userId
     * @param pageInfo
     * @return
     */
    public PagedResult<Loan> listByUser(String userId, PageInfo pageInfo);

    public int countByUserAndStatusAndDate(String userId, Date from, Date to, LoanStatus... statusList);
    
    /**
     * 
     * @param userId
     * @param from  开标时间timeOpen的查询起始时间
     * @param to    开标时间timeOpen的查询截止时间
     * @param pageInfo
     * @param statusList
     * @return 
     */
    public PagedResult<Loan> listByUserAndStatusAndDate(String userId, Date from, Date to, PageInfo pageInfo, LoanStatus... statusList);

    /**
     * list by loan request id
     *
     * @param requestId
     * @return
     */
    public List<Loan> listByRequest(String requestId);

    /**
     * list by corporation user
     *
     * @param entity
     * @return
     */
    public PagedResult<Loan> listByCorporationUser(RealmEntity entity, PageInfo pageInfo, LoanStatus... statusList);

    /**
     * count by loan status
     *
     * @param statusList
     * @param hiddenList
     *
     * @return
     */
    public int countByStatus(List<Boolean> hiddenList, LoanStatus... statusList);

    /**
     * list by loan status
     *
     * @param statusList
     * @param pageInfo
     * @param hiddenList
     * @return
     */
    public PagedResult<Loan> listByStatus(PageInfo pageInfo, List<Boolean> hiddenList, LoanStatus... statusList);

    /**
     * list by loan status and pureRequest
     *
     * @param pureRequest
     * @param statusList
     * @param pageInfo
     * @param hiddenList
     * @return
     */
    public PagedResult<Loan> listByStatusAndPureRequest(boolean pureRequest, PageInfo pageInfo, List<Boolean> hiddenList, LoanStatus... statusList);
    
    /**
     * manager默认都可见
     *
     * @param pageInfo
     * @param statusList
     * @return
     */
    public PagedResult<Loan> listByStatus(PageInfo pageInfo, LoanStatus... statusList);

    /**
     * count by repayment method
     *
     * @param methodList
     * @return
     */
    public int countByMethod(RepaymentMethod... methodList);

    /**
     * list by repayment method
     *
     * @param methodList
     * @param pageInfo
     * @return
     */
    public PagedResult<Loan> listByMethod(PageInfo pageInfo, RepaymentMethod... methodList);

  

    /**
     * 按贷款状态统计客户的贷款总额
     *
     * @param userId
     * @param status
     * @return
     */
    public long sumLoanAmountByUserAndStatus(String userId, LoanStatus... status);

    public long sumBidAmountByUserAndStatus(String userId, LoanStatus... status);

    /**
     * 获取loanRequest对应loan最大序号
     *
     * @param loanRequestId
     * @return
     */
    public int getMaxOrdinal(String loanRequestId);

    public int countByStatusAndPurpose(List<LoanStatus> statusList, List<LoanPurpose> purposeList);

    public PagedResult<Loan> listByStatusAndPurpose(List<LoanStatus> statusList, List<LoanPurpose> purposeList, PageInfo pageInfo);
    
    public PagedResult<Loan> listByStatusAndSettledDate(Date from, Date to, PageInfo pageInfo, LoanStatus... statusList);
}
