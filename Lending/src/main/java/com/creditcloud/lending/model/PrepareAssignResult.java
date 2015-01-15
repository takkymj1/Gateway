/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.AssignBidResult;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author rooseek
 */
@AllArgsConstructor
public class PrepareAssignResult extends BaseObject {

    private static final long serialVersionUID = 20140831L;

    @Getter
    private final CreditAssignOrder order;

    @Getter
    private final AssignBidResult bidResult;

}
