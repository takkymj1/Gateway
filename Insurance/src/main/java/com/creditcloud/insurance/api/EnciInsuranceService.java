/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsuranceProduct;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 新华保险万能险产品查询接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface EnciInsuranceService {
    
    /**
     * 查询所有保险产品
     *
     * @param pageInfo
     * @return
     */
    public PagedResult<InsuranceProduct> list(PageInfo pageInfo);
    
}
