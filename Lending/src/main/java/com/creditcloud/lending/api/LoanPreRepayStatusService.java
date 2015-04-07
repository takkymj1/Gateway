/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.PreRepaymentStatus;
import com.creditcloud.model.loan.LoanPreRepaymentStatus;
import javax.ejb.Remote;

/**
 *
 * @author peili
 */
@Remote
public interface LoanPreRepayStatusService {
    
    /**
     * mark loanPreRepayment status
     *
     * @param status
     * @param id
     * @return 
     */
    public boolean markStatus(PreRepaymentStatus status, String id);

    /**
     * get LoanPreRepaymentStatus by id
     *
     * @param id
     * @return
     */
    public LoanPreRepaymentStatus find(String id);
}
