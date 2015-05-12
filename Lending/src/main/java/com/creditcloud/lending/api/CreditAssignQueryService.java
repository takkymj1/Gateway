/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.CreditAssignStatus;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.loan.CreditAssign;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rooseek
 */
public interface CreditAssignQueryService {

    public int count(Date from,
                     Date to,
                     List<CreditAssignStatus> statusList);

    public int count(List<CreditAssignStatus> statusList);

    /**
     * list by open time and status
     *
     * @param from
     * @param to
     * @param info
     * @param statusList
     * @return
     */
    public PagedResult<CreditAssign> list(Date from, Date to,
                                          PageInfo info,
                                          List<CreditAssignStatus> statusList);

    /**
     * list by status
     *
     * @param info
     * @param statusList
     * @return
     */
    public PagedResult<CreditAssign> list(PageInfo info,
                                          List<CreditAssignStatus> statusList);

    /**
     * list by criteriaInfo info
     *
     * @param criteriaInfo
     * @return
     */
    @Deprecated
    public PagedResult<CreditAssign> list(CriteriaInfo criteriaInfo);

    /**
     * list all credit assign from an original loan invest
     *
     * @param investId
     * @param statusList
     * @return
     */
    public List<CreditAssign> listByInvest(String investId,
                                           List<CreditAssignStatus> statusList);

    /**
     * count all credit assign from an original loan invest
     *
     * @param investId
     * @param statusList
     * @return
     */
    public int countByInvest(String investId,
                             List<CreditAssignStatus> statusList);
    
    /**
     * count all credit assign from an original userId
     *
     * @param userId
     * @param statusList
     * @return
     */
    public int countByUser(String userId,
                             List<CreditAssignStatus> statusList);

    /**
     * list invest on a credit assign
     *
     * @param creditAssignId
     * @param statusList
     * @return
     */
    public PagedResult<Invest> listInvest(String creditAssignId, List<InvestStatus> statusList);
    
    /**
     * list cretiral credit assign 
     * @param pageInfo
     * @param minRate
     * @param maxRate
     * @param minLeftMonth
     * @param maxLeftMonth
     * @param repayMethod
     * @return 
     */
    public List<CreditAssign> listByCriteria(PageInfo pageInfo, int minRate, int maxRate, int minLeftMonth, int maxLeftMonth, String repayMethod);
    
    /**
     * get by ids and status
     *
     * @author jiadong.cao@fengjr.com
     * @param creditAssignIds
     * @param statusList
     * @return
     */
    public List<CreditAssign> listByIdsAndStatus(List<String> creditAssignIds, List<CreditAssignStatus> statusList);
    
   /**
    * 
    * @param investIdList
    * @param statusList
    * @return 
    */ 
    public List<CreditAssign> listByUserInvest(List<String> investIdList, List<CreditAssignStatus> statusList);
    
    /**
     * 获取某用户的所有债权信息
     * 
     * @param pageInfo
     * @param userId
     * @param statusList
     * @return 
     * @author xiongyong
     */
    public PagedResult<com.creditcloud.model.loan.CreditAssign> listByUser(PageInfo pageInfo, String userId, List<CreditAssignStatus> statusList);
    
    /**
     * 获取某用户已发生转让的所有债权信息
     * 
     * @param pageInfo
     * @param userId
     * @param statusList
     * @return 
     * @author xiongyong
     */
    public PagedResult<com.creditcloud.model.loan.CreditAssign> listUserHasTransfer(PageInfo pageInfo, String userId, List<CreditAssignStatus> statusList);
    
    public BigDecimal getFundAmount(com.creditcloud.model.loan.Invest invest);
    
    /**
     * 债权转让列表模糊查询（根据转让标题、转让金额）
     * 
     * @param search
     * @param statusList
     * @param pageInfo
     * @return 
     */
    public PagedResult<CreditAssign> listByLikeQuery(String search, List<CreditAssignStatus> statusList, PageInfo pageInfo);
}
