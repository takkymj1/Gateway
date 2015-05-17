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
     * @param start          开始索引
     * @param end            结束索引
     * 
     * @return empty list if nothing found
     */
    public List<WealthProduct> listByOrdinal(int start, int end);
    
    /**
     * 根据产品目录和产品状态查询产品
     * @param category 产品目录/类型 如私募、信托
     * @param pageInfo 分页信息
     * @param statusList 产品状态
     * @return 
     */
    public PagedResult<WealthProduct> listByCategoryAndStatus(String category, PageInfo pageInfo,List<ProductStatus> statusList);
    
    /**
     * 查询理财产品
     * @param category 产品目录/类型 如私募、信托
     * @param pageInfo 分页信息
     * @param statusList 产品状态
     * @param employeeId 创建人ID
     * @return 
     */
    public PagedResult<WealthProduct> listBySearch(String category, PageInfo pageInfo,List<ProductStatus> statusList,String employeeId);
    /**
     * 搜索产品列表
     * 
     * @param category          产品大类  
     * @param incomeType        收益类型
     * @param statusList        产品状态
     * @param subscribeOnly     是否只是认购产品
     * @param pageInfo          分页信息
     * @return 
     */
    public PagedResult<WealthProduct> listBySearch(String category, IncomeType incomeType, List<ProductStatus> statusList, boolean subscribeOnly, PageInfo pageInfo);
    
    
    /**
     * 根据状态获取固收类产品列表
     * 
     * @param statusList        产品状态
     * @param pageInfo          分页信息
     * @param subscribeOnly     是否只是认购产品
     * @return
     */
    public PagedResult<WealthProductFixed> listFixedByStatus(List<ProductStatus> statusList, boolean subscribeOnly, PageInfo pageInfo);

    /**
     * 根据产品目录查找固收类产品
     * 
     * @param category      产品目录/类型 如私募、信托
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<WealthProductFixed> listFixedByCategory(String category, PageInfo pageInfo);
    
    /**
     * 搜索固收益类产品列表
     * 
     * @param category          产品大类 
     * @param minRate           最小利率
     * @param maxRate           最大利率
     * @param statusList        产品状态列表
     * @param subscribeOnly     是否只是认购产品
     * @param pageInfo          分页信息
     * @return 
     */
    public PagedResult<WealthProductFixed> listFixedBySearch(String category, int minRate, int maxRate, List<ProductStatus> statusList, boolean subscribeOnly, PageInfo pageInfo);
    
    /**
     * 获取用户收藏的产品
     * 
     * @param userId        用户ID
     * @param pageInfo      分页信息
     * @return 产品ID列表
     */
    public PagedResult<String> listFavoriteByUser(String userId, PageInfo pageInfo);
}
