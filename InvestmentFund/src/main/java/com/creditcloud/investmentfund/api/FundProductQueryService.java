/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.FundProduct;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;

/**
 * 基金产品查询接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public interface FundProductQueryService {
    
    /**
     * 获取基金产品列表
     * 
     * @param pageInfo
     * @return 
     */
    PagedResult<FundProduct> list(PageInfo pageInfo);
    
}
