/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.wealthproduct.enums.PurchaseStatus;
import com.creditcloud.wealthproduct.enums.WealthProductStatus;
import com.creditcloud.wealthproduct.model.Purchase;
import com.creditcloud.wealthproduct.model.WealthProduct;
import java.util.List;

/**
 *
 * @author rooseek
 */
public interface WealthProductQueryService {

    /**
     *
     * @param clientCode
     * @param statusList
     * @param pageInfo
     * @return
     */
    public PagedResult<WealthProduct> listByStatus(String clientCode,
                                                   List<WealthProductStatus> statusList,
                                                   PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param productId
     * @param statusList
     * @param pageInfo
     * @return
     */
    public PagedResult<Purchase> listPurchaseByProduct(String clientCode,
                                                       String productId,
                                                       List<PurchaseStatus> statusList,
                                                       PageInfo pageInfo);
}
