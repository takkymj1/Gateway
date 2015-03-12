/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.model.FundProduct;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.Remote;

/**
 * 基金产品
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
     * 查询所有诺安基金产品
     *
     * @param pageInfo  分页信息
     * @param brandList 品牌
     * @return
     */
    public PagedResult<FundProduct> listByBrand(PageInfo pageInfo, FundBrand... brandList);
    
}
