/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.model.FundProduct;
import com.creditcloud.investmentfund.model.FundProductNavRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * 基金产品接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundProductService {

    /**
     * 添加基金产品
     * 
     * @param fundProduct   基金产品
     * @return 
     */
    public FundProduct addNew(FundProduct fundProduct);
    
    /**
     * 获取基金产品
     * 
     * @param id 基金产品ID
     * @return 
     */
    public FundProduct find(String id);
    
    /**
     * 根据基金代码和基金品牌获取基金
     * 
     * @param fundCode  基金代码
     * @param fundBrand 基金品牌
     * @return 
     */
    public FundProduct findByCodeAndBrand(String fundCode, FundBrand fundBrand);
    
    /**
     * 更新产品信息
     * 
     * @param product 
     */
    public void update(FundProduct product);
    
    /**
     * 更新股票型基金净值
     * 
     * @param fundCode      基金代码
     * @param fundBrand     基金品牌
     * @param nav           最新净值
     * @param navDate       最近净值日期
     * @param totalNav      累计净值
     * @param oneMonthRate  近一月涨幅
     * @param threeMonthRate 近三月涨幅
     * @param oneYearRate   近一年涨幅
     * 
     * @return 是否更新成功
     */
    public boolean updateNAV(String fundCode, FundBrand fundBrand, 
            BigDecimal nav, Date navDate,BigDecimal totalNav,
            int oneMonthRate,int threeMonthRate,int oneYearRate);
    
    /**
     * 平台手动更新参数
     * 
     * @param productId             产品ID
     * @param expectedRate          预期收益率
     * @param proposedHoldDuration  建议持有时间
     * 
     * @return 是否更新成功
     */
    public boolean updateManualInputParameters(String productId, int expectedRate, int proposedHoldDuration);
    
    /**
     * 查询所有基金产品
     *
     * @param brandList 基金品牌
     * @param pageInfo  分页信息
     * 
     * @return
     */
    public PagedResult<FundProduct> listByBrand(List<FundBrand> brandList, PageInfo pageInfo);
    
    /**
     * 查询所有基金产品
     * 
     * @param typeList      基金类型
     * @param brandList     基金品牌
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundProduct> listByTypeAndBrand(List<FundType> typeList, List<FundBrand> brandList, PageInfo pageInfo);
    
    /**
     * 查询所有诺安基金产品 (前端） 不显示未激活产品
     * 
     * @param minRate           最小期望收益率
     * @param maxRate           最大期望收益率
     * @param minDuration       最小期望持有期限
     * @param maxDuration       最大期望持有期限
     * @param brandList         品牌
     * @param pageInfo          分页信息
     * @return 
     */
    public PagedResult<FundProduct> listByExpectedRateAndProposedHoldDurationAndBrand(int minRate, int maxRate, Integer minDuration, Integer maxDuration, List<FundBrand> brandList, PageInfo pageInfo);
    
    /**
     * 查询所有诺安基金产品 (前端） 不显示未激活产品
     * 
     * @param minRate           最小期望收益率
     * @param maxRate           最大期望收益率
     * @param brandList         品牌
     * @param pageInfo          分页信息
     * @return 
     */
    public PagedResult<FundProduct> listDemandByExpectedRateAndBrand(int minRate, int maxRate, List<FundBrand> brandList, PageInfo pageInfo);
            
    /**
     * 新增一条基金净值记录 <br>
     * 如果为当天的记录只做更新操作 <br>
     * 
     * @param fundProductNavRecord    基金净值记录
     * @return 
     */
    public FundProductNavRecord addNavRecord(FundProductNavRecord fundProductNavRecord);
    
    /**
     * 列出特定净值日期内的基金产品净值记录
     * 
     * @param fundCode
     * @param fundBrand
     * @param startDate
     * @param endDate
     * @param info
     * @return 
     */
    public PagedResult<FundProductNavRecord> listNavRecordByCodeAndBrandAndNavDate(String fundCode, FundBrand fundBrand, Date startDate, Date endDate, PageInfo info);
    
    /**
     * 设置产品的ordinal
     *
     * @param projectId
     * @param ordinal
     * @return true if change successful, false if project not found
     */
    public boolean changeOrdinal(String projectId, Integer ordinal);
    
    /**
     * 列出下标区间的基金产品
     *
     * @param startOrdinal  
     * @param endOrdinal
     * 
     * @return empty list if nothing found
     */
    public List<FundProduct> listProductByOrdinal(int startOrdinal, int endOrdinal);
 
    /**
     * 获取某天基金产品净值
     * 
     * @param fundCode      基金代码
     * @param fundBrand     基金品牌
     * @param navDate       净值日期
     * @return 
     */
    public FundProductNavRecord getFundProductNavRecord(String fundCode, FundBrand fundBrand, Date navDate);
    
    /**
     * 获取某天之前的最近一次产品净值
     * 
     * @param fundCode      基金代码
     * @param fundBrand     基金品牌
     * @param navDate       净值日期
     * @return 
     */
    public FundProductNavRecord getByCodeAndBrandAndRecentlyNavDate(String fundCode, FundBrand fundBrand, Date navDate);
    
    /**
     * 收藏产品
     * 
     * @param productId     产品ID
     * @param userId        用户ID
     * @return 
     */
    public int markFavorite(String productId, String userId);

    /**
     * 取消收藏产品
     * 
     * @param productId     产品ID
     * @param userId        用户ID
     * @return 
     */
    public int unmarkFavorite(String productId, String userId);

    /**
     * 产品被收藏数
     * 
     * @param productId     产品ID
     * @return 
     */
    public int favoriteCountByProduct(String productId);

    /**
     * 获取用户收藏的产品
     * 
     * @param userId        用户ID
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<String> listFavoriteByUser(String userId, PageInfo pageInfo);
}
