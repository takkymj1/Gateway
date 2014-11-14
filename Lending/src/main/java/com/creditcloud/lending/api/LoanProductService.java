/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.loan.LoanProduct;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanProductService {
    
    public LoanProduct find(String id);
    
    public List<LoanProduct> findAll();
    
    public LoanProduct create(LoanProduct product);

    public void update(LoanProduct product);
    
}