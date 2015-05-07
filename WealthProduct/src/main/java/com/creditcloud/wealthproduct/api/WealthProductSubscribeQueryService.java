/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.wealthproduct.enums.SubscribeStatus;
import com.creditcloud.wealthproduct.model.Subscribe;
import java.util.List;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public interface WealthProductSubscribeQueryService {

    /**
     * 根据产品ID和认购状态获取认购列表
     * 
     * @param productId     产品ID
     * @param statusList    状态列表
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<Subscribe> listByProduct(
            String productId, 
            List<SubscribeStatus> statusList, 
            PageInfo pageInfo);
 
    /**
     * 根据产品ID和认购状态获取认购列表
     * 
     * @param userId        用户ID
     * @param statusList    状态列表
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<Subscribe> listByUser(
            String userId, 
            List<SubscribeStatus> statusList, 
            PageInfo pageInfo
    );
    
    /**
     * 根据产品获取认购总金额
     *
     * @param productId    产品ID
     * @param status       认购状态
     * @return
     */
    public int sumByProduct(String productId, List<SubscribeStatus> status);
}
