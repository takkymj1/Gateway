/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.wealthproduct.enums.ProductStatus;
import com.creditcloud.wealthproduct.model.WealthProductFixed;
import java.util.List;

/**
 * 查询产品
 * 
 * @author rooseek
 */
public interface WealthProductQueryService {

    /**
     * 根据状态获取产品列表
     * 
     * @param offline       线下or线上
     * @param statusList    产品状态
     * @param pageInfo      分页信息
     * @return
     */
    public PagedResult<WealthProductFixed> listFixedByStatus(boolean offline, List<ProductStatus> statusList, PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param productId
     * @param statusList
     * @param pageInfo
     * @return
     */
//    public PagedResult<Purchase> listPurchaseByProduct(String clientCode,
//                                                       String productId,
//                                                       List<TradingType> statusList,
//                                                       PageInfo pageInfo);
}
