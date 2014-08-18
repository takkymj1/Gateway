/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.CreditAssignStatus;
import com.creditcloud.model.loan.CreditAssign;
import com.creditcloud.model.loan.CreditAssignInvest;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CreditAssignService {

    /**
     * mark credit assign status
     *
     * @param clientCode
     * @param status
     * @param creditAssignIds
     */
    public void markStatus(String clientCode, CreditAssignStatus status, String... creditAssignIds);

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
     * list by criteriaInfo info
     *
     * @param clientCode
     * @param criteriaInfo
     * @return
     */
    public PagedResult<CreditAssign> list(String clientCode,
                                          CriteriaInfo criteriaInfo);

    /**
     * list invest on a credit assign
     *
     * @param clientCode
     * @param creditAssignId
     * @return
     */
    public PagedResult<CreditAssignInvest> listInvest(String clientCode, String creditAssignId);
}
