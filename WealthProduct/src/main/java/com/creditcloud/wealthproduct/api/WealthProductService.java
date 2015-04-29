/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.enums.ProductStatus;
import com.creditcloud.wealthproduct.model.WealthProduct;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface WealthProductService extends WealthProductQueryService {

    /**
     * create new wealth product
     *
     * @param product
     * @return
     */
    public WealthProduct create(WealthProduct product);

    /**
     * update exist wealth product, only certain field fields can be updated by
     * this method
     *
     * @param product
     * @return
     */
    public WealthProduct update(WealthProduct product);
    
    /**
     * 
     * @param productId
     * @return 
     */
    public WealthProduct getById(String productId);

    /**
     *
     * @param productId
     * @param status
     * @return
     */
    public boolean markStatus(String productId, ProductStatus status);

}
