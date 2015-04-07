/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.model.FundIncomeRecord;
import com.creditcloud.investmentfund.model.UserIncomeRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import javax.ejb.Remote;

/**
 * 用户基金收益记录（图表展示）
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
    
    /**
     * 获取某天的用户基金收益
     * 
     * @param userId        用户ID
     * @param fundCode      基金代码
     * @param fundBrand     基金品牌
     * @param navDate       净值日期
     * @return 
     */
    public FundIncomeRecord getByUserAndProductAndDate(String userId, String fundCode, FundBrand fundBrand, Date navDate);
    
    /**
     * 获取某段净值时间内某个用户所有基金收益合
     * 
     * @param userId        用户ID
     * @param start         开始时间
     * @param end           结束时间
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<UserIncomeRecord> listUserIncomeByUserAndDate(String userId, Date start, Date end, PageInfo pageInfo);
    
    /**
     * 获取最新的用户收益记录
     * 
     * @param userId        用户ID
     * @param navDate       <=当前净值日期
     * @return 
     */
    public UserIncomeRecord getLatestUserIncome(String userId, Date navDate);
    
    /**
     * 获取收益列表
     * 
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundIncomeRecord> list(PageInfo pageInfo);
    
}
