/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.FundAccount;
import com.creditcloud.investmentfund.model.FundProduct;
import com.creditcloud.investmentfund.model.FundResult;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 诺安基金
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface LionFundService {

    /**
     * 查询所有诺安基金产品
     *
     * @param pageInfo
     * @return
     */
    public PagedResult<FundProduct> list(PageInfo pageInfo);
    
    /**
     * 获取基金账户
     * @param userId
     * @return 
     */
    public FundAccount getFundAccount(String userId);
    
    /**
     * 创建基金账户
     * @param userId
     * @return 
     */
    public FundResult<FundAccount> createFundAccount(String userId);
    
    /**
     * 申购基金
     */
//    public FundResult 
}
