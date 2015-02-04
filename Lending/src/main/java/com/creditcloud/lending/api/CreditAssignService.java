/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.CreditAssignStatus;
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

    public CreditAssign addNew(CreditAssign creditAssign);

    /**
     * mark credit assign status
     *
     * @param status
     * @param creditAssignId
     * @return 
     */
    public boolean markStatus(CreditAssignStatus status, String creditAssignId);

    /**
     *
     * @param creditAssignId
     * @param status
     * @param bidNumber
     * @param bidAmount
     * @return 
     */
    public boolean markStatus(String creditAssignId, CreditAssignStatus status, int bidNumber, BigDecimal bidAmount, BigDecimal bidDealAmount);

    /**
     * get by id
     *
     * @param creditAssignId
     * @return
     */
    public CreditAssign find(String creditAssignId);
    
}
