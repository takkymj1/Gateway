/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.TradingRecordStatus;
import com.creditcloud.investmentfund.enums.TradingRecordType;
import com.creditcloud.investmentfund.model.FundTradingRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 基金交易记录接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundTradingRecordService {

    /**
     * 新增一条交易记录 <br>
     * 如果已经存在则更新当前记录
     * 
     * @param fundTradingRecord 交易记录
     * @return 
     */
    public FundTradingRecord addNew(FundTradingRecord fundTradingRecord);
    
    /**
     * 获取基金交易记录
     * 
     * @param userId        用户ID
     * @param fundBrand     基金品牌
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundTradingRecord> listByUserIdAndBrand(String userId, FundBrand fundBrand, PageInfo pageInfo);
    
    /**
     * 获取基金交易记录
     * 
     * @param userId        用户ID
     * @param type          基金类型
     * @param status        基金状态
     * @param fundBrand     基金品牌
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundTradingRecord> listByUserIdAndTypeAndStatusAndBrand(String userId, TradingRecordType type, TradingRecordStatus status, FundBrand fundBrand, PageInfo pageInfo);
}
