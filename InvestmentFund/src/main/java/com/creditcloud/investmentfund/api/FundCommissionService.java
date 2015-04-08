/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.model.FundCommission;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author xiedingyuan
 */
@Remote
public interface FundCommissionService {
    
    /**
     * 新增一条基金佣金记录
     * 
     * @param record    
     * @return 
     */
    public FundCommission addNew(FundCommission record);
    
    
    /**
     * 获取基金的佣金记录
     * @param fundCode
     * @param fundBrand
     * @param pageInfo
     * @return 
     */
    public PagedResult<FundCommission> listByBrandAndType(List<FundBrand> fundBrandList,List<FundType> fundTypeList,PageInfo pageInfo);
    
    /**
     * 获取基金某一天的佣金记录
     * @param fundCode
     * @param fundBrand
     * @param day
     * @return 
     */
    public FundCommission getByCommissionAndDate( String fundCode, FundBrand fundBrand, Date day);
    
    /**
     *获取基金某时间范围的佣金记录
     * @param fundBrandList
     * @param fundTypeList
     * @param day
     * @return 
     */
    public PagedResult<FundCommission> listBrandAndTypeAndCommDate(List<FundBrand> fundBrandList,List<FundType> fundTypeList,Date startDate,Date endDate,PageInfo pageInfo);
    /**
     * 获取全部记录
     * @return 
     */
    public List<FundCommission> listAll();
    
}
