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
    public List<CreditAssign> listByOriginalInvest(String investId,
                                                   List<CreditAssignStatus> statusList);

    /**
     * list invest on a credit assign
     *
     * @param creditAssignId
     * @param statusList
     * @return
     */
    public PagedResult<Invest> listInvest(String creditAssignId, List<InvestStatus> statusList);
}
