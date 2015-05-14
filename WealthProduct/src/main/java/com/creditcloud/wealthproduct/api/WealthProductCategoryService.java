/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.wealthproduct.model.WealthProductCategory;
import javax.ejb.Remote;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface WealthProductCategoryService {

    /**
     * 获取产品类别
     * 
     * @param categoryId 类别ID
     * @return 
     */
    WealthProductCategory find(String categoryId);

    /**
     * 获取产品类别
     * 
     * @param category 产品类别
     * @return 
     */
    WealthProductCategory findByCategory(String category);
    
    /**
     * 创建产品归类（如信托、私募债等）
     * 
     * @param category 产品类别
     * @return 
     */
    WealthProductCategory create(WealthProductCategory category);

    /**
     * 创建产品归类（如信托、私募债等）
     * 
     * @param category 产品类别
     */
    void update(WealthProductCategory category);
    
    /**
     * 理财产品类别列表
     * 
     * @param info  检索信息
     * @return 
     */
    public PagedResult<WealthProductCategory> list(PageInfo info);
}
