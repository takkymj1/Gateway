/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.loan.LoanPreRepayment;
import javax.ejb.Remote;

/**
 *
 * @author peili
 */
@Remote
public interface LoanPreRepayService {
    
    public LoanPreRepayment find(String id);

    public void addNew(LoanPreRepayment repay);
    
}
