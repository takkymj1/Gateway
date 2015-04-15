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
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import java.util.List;

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

    
    /**
     * 按LoanRequestStatus和pureRequest列出一定时间内提交的LoanRequest
     *
     * @param pureRequest 是否为单纯的借款申请，用于判断某些业务例如配资申请
     * @param from
     * @param to
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRequest> listByStatusAndDate(boolean pureRequest, Date from, Date to, PageInfo info, LoanRequestStatus... status);
    
    
    
    public PagedResult<LoanRequest> listByStatus(PageInfo info, LoanRequestStatus... status);

    public List<LoanRequest> listByRequestProviderAndStatus(RealmEntity provider, LoanRequestStatus... status);

    /**
     * 列出关联到某借款申请的所有子借款申请
     *
     * @param parentId
     * @return
     */
    public List<LoanRequest> listByParent(String parentId);

    /**
     * 获取关联到某借款申请的子借款申请，如果有多个则默认返回最新添加的<p>
     * 如果业务规则可以关联到多个，使用listByParent
     *
     * @param parentId
     * @return
     */
    public LoanRequest getByParent(String parentId);

    /**
     * 列出hidden为true的借款申请，此类借款申请应用场景视具体业务需求
     *
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRequest> listHiddenByStatus(PageInfo info, LoanRequestStatus... status);
}
