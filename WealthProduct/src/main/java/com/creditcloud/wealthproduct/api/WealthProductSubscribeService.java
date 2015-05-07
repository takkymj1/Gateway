/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.model.Subscribe;
import javax.ejb.Remote;

/**
 * 产品认购记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface WealthProductSubscribeService extends WealthProductSubscribeQueryService {

    /**
     * 认购产品
     *
     * @param productId 产品ID
     * @param amount    金额
     * @param userId    用户ID
     * @return
     */
    Subscribe appoint(String productId, int amount, String userId);
    
}
