/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.model.SubscribeRepayment;
import javax.ejb.Remote;

/**
 * 认购回款
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface WealthProductSubscribeRepayService {

    /**
     * 新增认购回款
     * 
     * @param repay
     * @return 
     */
    SubscribeRepayment addNew(SubscribeRepayment repay);
    
}
