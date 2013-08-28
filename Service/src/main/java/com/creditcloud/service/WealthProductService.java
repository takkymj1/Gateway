/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.WealthProduct;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface WealthProductService {
    
    /**
     * 
     * @param clientCode
     * @param id
     * @return 
     */
    WealthProduct getById(String clientCode, String productId);
    
    /**
     * 
     * @param clientCode
     * @param product 
     */
    void update(String clientCode, WealthProduct product);
    
    /**
     * 
     * @param clientCode
     * @return 
     */
    List<WealthProduct> listAll(String clientCode);
    
    /**
     * 
     * @param clientCode
     * @param status
     * @return 
     */
    List<WealthProduct> listByStatus(String clientCode, LoanStatus ... status);
}
