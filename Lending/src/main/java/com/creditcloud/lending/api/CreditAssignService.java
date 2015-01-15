/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.PrepareAssignResult;
import com.creditcloud.model.enums.loan.BidMethod;
import com.creditcloud.model.enums.loan.CreditAssignStatus;
import com.creditcloud.model.enums.loan.SubmitCreditAssignResult;
import com.creditcloud.model.loan.CreditAssign;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CreditAssignService extends CreditAssignQueryService {

    public SubmitCreditAssignResult create(String investId,
                                           BigDecimal creditDealAmount,
                                           BigDecimal creditDealRate);

    /**
     * mark credit assign status
     *
     * @param status
     * @param creditAssignIds
     */
    public void markStatus(CreditAssignStatus status, List<String> creditAssignIds);

    /**
     * get by id
     *
     * @param creditAssignId
     * @return
     */
    public CreditAssign getById(String creditAssignId);

    /**
     * prepare for assign
     *
     * @param creditAssignId
     * @param bidMethod
     * @param principalAmount
     * @param userId
     * @return
     */
    public PrepareAssignResult prepareAssign(String creditAssignId, BidMethod bidMethod, BigDecimal principalAmount, String userId);

    /**
     * finish assign
     *
     * @param userId
     * @param orderId
     * @param creditAmount
     * @param creditDealAmount
     * @param feeAmount
     * @return
     */
    public boolean finishAssign(String userId,
                                String orderId,
                                BigDecimal creditAmount,
                                BigDecimal creditDealAmount,
                                BigDecimal feeAmount);
}
