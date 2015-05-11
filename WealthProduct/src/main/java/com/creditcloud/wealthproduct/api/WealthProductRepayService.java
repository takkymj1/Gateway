/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.model.WealthProductRepayment;
import javax.ejb.Remote;

/**
 * 产品回款
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface WealthProductRepayService {

    /**
     * 新增产品回款
     * 
     * @param repay 
     * @return  
     */
    public WealthProductRepayment addNew(WealthProductRepayment repay);
    
}
