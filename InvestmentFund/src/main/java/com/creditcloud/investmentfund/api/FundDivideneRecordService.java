/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.FundDividendRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 基金分红接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundDivideneRecordService {

    /**
     * 新增一条基金分红记录
     * 
     * @param record    
     * @return 
     */
    public FundDividendRecord addNew(FundDividendRecord record);
    
    /**
     * 获取分红列表
     * 
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundDividendRecord> list(PageInfo pageInfo);
    
}
