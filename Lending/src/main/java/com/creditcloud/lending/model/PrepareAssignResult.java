/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.AssignBidResult;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author rooseek
 */
@Data
public class PrepareAssignResult extends BaseObject {

    private static final long serialVersionUID = 20140831L;

    private CreditAssignOrder order;

    private AssignBidResult bidResult;

    private BigDecimal principalAmount;

    /**
     * 债权转让最后一笔承接
     */
    private boolean lastAssign;

    public PrepareAssignResult(CreditAssignOrder order,
                               AssignBidResult bidResult) {
        this(order, bidResult, null);
    }

    public PrepareAssignResult(CreditAssignOrder order,
                               AssignBidResult bidResult,
                               BigDecimal principalAmount) {
        this(order, bidResult, principalAmount, false);
    }

    public PrepareAssignResult(CreditAssignOrder order,
                               AssignBidResult bidResult,
                               BigDecimal principalAmount,
                               boolean lastAssign) {
        this.order = order;
        this.bidResult = bidResult;
        this.principalAmount = principalAmount;
        this.lastAssign = lastAssign;
    }
}
