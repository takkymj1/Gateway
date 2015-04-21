/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.enums.TradingRecordPayStatus;
import com.creditcloud.investmentfund.enums.TradingRecordResult;
import com.creditcloud.investmentfund.enums.TradingRecordStatus;
import com.creditcloud.investmentfund.enums.TradingRecordType;
import com.creditcloud.investmentfund.model.FundTradingRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
     * 获取交易记录
     * 
     * @param orderId   订单号
     * @param status    基金状态
     * @param fundBrand 基金品牌
     * @return 
     */
    public FundTradingRecord getByOrderIdAndStatusAndBrand(String orderId, TradingRecordStatus status, FundBrand fundBrand);
    
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
     * @param fundCode      基金代码
     * @param fudnBrand     基金品牌
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundTradingRecord> listByUserIdAndProduct(String userId, String fundCode, FundBrand fudnBrand, PageInfo pageInfo);
    
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
    
    /**
     * 获取基金交易记录
     * 
     * @param userId        用户ID
     * @param typeList      基金类型
     * @param statusList    基金状态
     * @param resultList    基金返回状态
     * @param fundBrandList 基金品牌
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundTradingRecord> listByUserIdAndTypeAndStatusAndResultAndBrand(String userId, List<TradingRecordType> typeList, List<TradingRecordStatus> statusList, List<TradingRecordResult> resultList, List<FundBrand> fundBrandList, PageInfo pageInfo);
    
    /**
     * 根据用户和交易类型和状态
     * 
     * @param userId        用户ID
     * @param fundTypeList  基金类型队列
     * @param typeList      交易类型    
     * @param status        交易状态
     * @param result        交易返回结果
     * @return 
     */
    public BigDecimal sumByUserAndTypeAndStatusAndResult(String userId, List<FundType> fundTypeList, List<TradingRecordType> typeList, List<TradingRecordStatus> status, TradingRecordResult result);
    
    /**
     * 根据基金产品获取申购总数
     * 
     * @param fundCode
     * @param fundBrand
     * @param typeList
     * @param status
     * @return 申购总数
     */
    public int countByFundAndTypeAndStatus(String fundCode, FundBrand fundBrand, List<TradingRecordType> typeList, List<TradingRecordStatus> status);
    
    /**
     * 获取交易记录列表
     * 
     * @param pageInfo  分页信息
     * @return 
     */
    public PagedResult<FundTradingRecord> list(PageInfo pageInfo);
    
    /**
     * 
     * @param codeList 代码
     * @param typeList 基金类型
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @param payStatusList 支付状态
     * @param brandList 基金品牌
     * @param pageInfo 分页信息
     * @return 
     */
    public PagedResult<FundTradingRecord> listByCodeAndTypeAndTranDateAndPayStatus(List<String> codeList,List<FundType> typeList,Date startDate,Date endDate,List<TradingRecordPayStatus> payStatusList,List<FundBrand> brandList,PageInfo pageInfo);
}
