/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.model.WealthProductFee;
import javax.ejb.Remote;

/**
 * 产品费率
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface WealthProductFeeService {

    /**
     * 获取产品费率
     * 
     * @param productId 产品ID
     * @return 
     */
    WealthProductFee findByProduct(String productId);

    /**
     * 创建产品费率
     * 
     * @param fee 费率
     * @return 
     */
    WealthProductFee create(WealthProductFee fee);

    /**
     * 更新产品费率
     * 
     * @param fee 费率
     */
    void update(WealthProductFee fee);
}
