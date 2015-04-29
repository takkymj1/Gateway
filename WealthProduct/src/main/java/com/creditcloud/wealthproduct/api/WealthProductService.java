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
     * @param clientCode
     * @param product
     * @return
     */
    public WealthProduct create(String clientCode, WealthProduct product);

    /**
     * update exist wealth product, only certain field fields can be updated by
     * this method
     *
     * @param clientCode
     * @param product
     * @return
     */
    public WealthProduct update(String clientCode, WealthProduct product);
    
    /**
     * 
     * @param clientCode
     * @param productId
     * @return 
     */
    public WealthProduct getById(String clientCode, String productId);

    /**
     *
     * @param clientCode
     * @param productId
     * @param status
     * @return
     */
    public boolean markStatus(String clientCode, String productId, ProductStatus status);

}
