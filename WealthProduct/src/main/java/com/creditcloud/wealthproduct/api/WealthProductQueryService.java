/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.wealthproduct.enums.IncomeType;
import com.creditcloud.wealthproduct.enums.ProductStatus;
import com.creditcloud.wealthproduct.model.WealthProduct;
import com.creditcloud.wealthproduct.model.WealthProductCategory;
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
     * 理财产品类别列表
     * 
     * @param info  检索信息
     * @return 
     */
    public PagedResult<WealthProductCategory> listCategory(CriteriaInfo info);
    
    /**
     * 获取用户收藏的产品
     * 
     * @param userId        用户ID
     * @param pageInfo      分页信息
     * @return 产品ID列表
     */
    public PagedResult<String> listFavoriteByUser(String userId, PageInfo pageInfo);
}
