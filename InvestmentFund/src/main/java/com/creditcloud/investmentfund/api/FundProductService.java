/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.model.FundProduct;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 基金产品
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundProductService {

    /**
     * 获取基金产品
     * 
     * @param id 基金产品ID
     * @return 
     */
    public FundProduct find(String id);
    
    /**
     * 查询所有诺安基金产品
     *
     * @param pageInfo  分页信息
     * @param brandList 品牌
     * @return
     */
    public PagedResult<FundProduct> listByBrand(PageInfo pageInfo, FundBrand... brandList);
    
}
