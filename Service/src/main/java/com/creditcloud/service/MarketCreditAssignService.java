/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

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
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface MarketCreditAssignService {

    /**
     * mark credit assign status
     *
     * @param clientCode
     * @param status
     * @param creditAssignIds
     */
    @Deprecated
    public void markStatus(String clientCode, CreditAssignStatus status, String... creditAssignIds);

    /**
     *
     * @param clientCode
     * @param creditAssignId
     * @param status
     * @param bidNumber
     * @param bidAmount
     * @return
     */
    public boolean markStatus(String clientCode, String creditAssignId, CreditAssignStatus status, int bidNumber, BigDecimal bidAmount);

    /**
     * get by id
     *
     * @param clientCode
     * @param creditAssignId
     * @return
     */
    public CreditAssign getById(String clientCode, String creditAssignId);

    /**
     * list by open time and status
     *
     * @param clientCode
     * @param from
     * @param to
     * @param info
     * @param status
     * @return
     */
    public PagedResult<CreditAssign> list(String clientCode,
                                          Date from, Date to,
                                          PageInfo info,
                                          CreditAssignStatus... status);

    /**
     * list by status
     *
     * @param clientCode
     * @param info
     * @param status
     * @return
     */
    public PagedResult<CreditAssign> list(String clientCode,
                                          PageInfo info,
                                          CreditAssignStatus... status);

    /**
     * list by criteriaInfo info
     *
     * @param clientCode
     * @param criteriaInfo
     * @return
     */
    @Deprecated
    public PagedResult<CreditAssign> list(String clientCode,
                                          CriteriaInfo criteriaInfo);

    /**
     * list all credit assign from an original loan invest
     *
     * @param clientCode
     * @param investId
     * @param status
     * @return
     */
    public List<CreditAssign> listByOriginalInvest(String clientCode,
                                                   String investId,
                                                   CreditAssignStatus... status);

    /**
     * list invest on a credit assign
     *
     * @param clientCode
     * @param creditAssignId
     * @param status
     * @return
     */
    public PagedResult<Invest> listInvest(String clientCode, String creditAssignId, InvestStatus... status);
}
