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

    private BigDecimal princilPalAmount;

    public PrepareAssignResult(CreditAssignOrder order, AssignBidResult bidResult) {
        this.order = order;
        this.bidResult = bidResult;
    }

    public PrepareAssignResult(CreditAssignOrder order,
                               AssignBidResult bidResult,
                               BigDecimal princilPalAmount) {
        this.order = order;
        this.bidResult = bidResult;
        this.princilPalAmount = princilPalAmount;
    }
}
