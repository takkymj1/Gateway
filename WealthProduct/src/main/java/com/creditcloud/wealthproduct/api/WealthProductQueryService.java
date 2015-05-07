/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.wealthproduct.enums.IncomeType;
import com.creditcloud.wealthproduct.enums.ProductStatus;
import com.creditcloud.wealthproduct.model.WealthProduct;
import com.creditcloud.wealthproduct.model.WealthProductFixed;
import java.util.List;

/**
 * 查询产品
 * 
 * @author rooseek
 */
public interface WealthProductQueryService {

    /**
     * 列出下标区间的基金产品
     *
     * @param start 
     * @param end
     * 
     * @return empty list if nothing found
     */
    public List<WealthProduct> listByOrdinal(int start, int end);
    
    /**
     * 搜索产品列表
     * 
     * @param categoryKey
     * @param incomeType
     * @param statusList
     * @param pageInfo
     * @return 
     */
    public PagedResult<WealthProduct> listBySearch(String categoryKey, IncomeType incomeType, List<ProductStatus> statusList, PageInfo pageInfo);
    
    
    /**
     * 根据状态获取固收类产品列表
     * 
     * @param subscribeOnly 只能认购
     * @param statusList    产品状态
     * @param pageInfo      分页信息
     * @return
     */
    public PagedResult<WealthProductFixed> listFixedByStatus(boolean subscribeOnly, List<ProductStatus> statusList, PageInfo pageInfo);

    /**
     * 搜索固收益类产品列表
     * 
     * @param categoryKey
     * @param minRate
     * @param maxRate
     * @param statusList
     * @param pageInfo
     * @return 
     */
    public PagedResult<WealthProductFixed> listFixedBySearch(String categoryKey, int minRate, int maxRate, List<ProductStatus> statusList, PageInfo pageInfo);
    
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
