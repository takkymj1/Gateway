/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.model.FundIncomeRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundIncomeRecordService {

    /**
     * 新增一条基金收益记录
     * 
     * @param record    
     * @return 
     */
    public FundIncomeRecord addNew(FundIncomeRecord record);
    
    /**
     * 获取基金收益记录
     * 
     * @param userId        用户ID
     * @param fundCode      基金代码
     * @param fundBrand     基金品牌
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundIncomeRecord> listByUserIdAndCodeAndBrand(String userId, String fundCode, FundBrand fundBrand, PageInfo pageInfo);
    
}
