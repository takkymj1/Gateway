/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.model.WealthProductRate;
import java.util.List;
import javax.ejb.Remote;

/**
 * 理财产品利率接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface WealthProductRateService {

    /**
     * 获取产品的利率列表
     * 
     * @param productId 产品ID
     * @return 
     */
    public List<WealthProductRate> listByProduct(String productId);
    
    /**
     * 新增产品利率
     * 
     * @param productId
     * @param rates
     * @return false 已经存在
     */
    public boolean addNew(String productId,  List<WealthProductRate> rates);
}
