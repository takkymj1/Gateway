/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

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

}
