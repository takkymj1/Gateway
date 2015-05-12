/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.loan.InvestPreRepayment;
import javax.ejb.Remote;

/**
 *
 * @author peili
 */
@Remote
public interface InvestPreRepayService {
    
    public InvestPreRepayment find(String id);

    public void addNew(InvestPreRepayment repay);
    
}
