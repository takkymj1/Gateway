/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.loan.LoanFee;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanFeeService {
    
    LoanFee find(String loanFeeId);
    
    LoanFee create(LoanFee loanFee);

    void update(LoanFee loanFee);
}
