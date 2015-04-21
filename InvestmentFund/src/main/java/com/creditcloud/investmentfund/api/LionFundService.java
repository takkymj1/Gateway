/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.AreaLevel;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.model.Area;
import com.creditcloud.investmentfund.model.FundAccount;
import com.creditcloud.investmentfund.model.FundProductNavRecord;
import com.creditcloud.investmentfund.model.FundResult;
import com.creditcloud.investmentfund.model.lion.FundProduct;
import com.creditcloud.investmentfund.model.lion.FundTradingRequestRecord;
import com.creditcloud.investmentfund.model.lion.request.QueryFundDividendRequest;
import com.creditcloud.investmentfund.model.lion.request.QueryFundFeeRateRequest;
import com.creditcloud.investmentfund.model.lion.request.QueryFundShareRequest;
import com.creditcloud.investmentfund.model.lion.request.QueryTradeRecordRequest;
import com.creditcloud.investmentfund.model.lion.request.TradeBuyFundRequest;
import com.creditcloud.investmentfund.model.lion.request.TradeSellFundRequest;
import com.creditcloud.investmentfund.model.lion.request.UserRegisterRequest;
import com.creditcloud.investmentfund.model.lion.request.UserRiskAssessmentRequest;
import com.creditcloud.investmentfund.model.lion.response.QueryFundDividendResponse;
import com.creditcloud.investmentfund.model.lion.response.QueryFundFeeRateResponse;
import com.creditcloud.investmentfund.model.lion.response.QueryFundShareResponse;
import com.creditcloud.investmentfund.model.lion.response.QueryTradeConfirmRecordResponse;
import com.creditcloud.investmentfund.model.lion.response.QueryTradeRecordResponse;
import com.creditcloud.investmentfund.model.lion.response.TradeBuyFundResponse;
import com.creditcloud.investmentfund.model.lion.response.TradeSellFundResponse;
import com.creditcloud.investmentfund.model.lion.response.UserRiskAssessmentResponse;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * 诺安基金接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface LionFundService {

    /**
     * 去诺安基金官网抓取净值记录
     * 
     * @param fundCode      基金代码
     * @param fundType      基金类型
     * @param startDate     开始时间
     * @param endDate       结束时间
     * @return 
     */
    public List<FundProductNavRecord> queryFundProductNavRecord(String fundCode, FundType fundType, Date startDate, Date endDate);
    
    /**
     * 查询用户基金交易记录
     * 
     * @param request   基金交易记录请求信息
     * @return 
     */
    public QueryTradeRecordResponse queryTradingRecord(QueryTradeRecordRequest request);
    
    /**
     * 获取基金账户
     * 
     * @param userId    用户ID
     * @return 
     */
    public List<FundAccount> listFundAccountByUserId(String userId);
    
    /**
     * 获取基金账户
     * 
     * @param userId    用户ID
     * @param fundType  基金类型
     * @return 
     */
    public FundAccount getFundAccount(String userId, FundType fundType);
    
    /**
     * 创建股票型基金账户
     * 
     * @param userId            用户ID
     * @param request           全基金开户请求
     * @return 
     */
    public FundResult<FundAccount> createStockFundAccount(String userId, UserRegisterRequest request);
    
    /**
     * 创建货币型基金账户
     * 
     * @param userId                用户ID
     * @param transactionaccountid  交易账号
     * @param orderId               订单号
     * @return 
     */
    public FundResult<FundAccount> createMoneyFundAccount(String userId, String transactionaccountid, String orderId);
    
    /**
     * 申购基金
     * 
     * @param userId        用户ID
     * @param request       申购请求
     * @return 
     */
    public TradeBuyFundResponse purchase(String userId, TradeBuyFundRequest request);
    
    /**
     * 赎回金额
     * 
     * @param userId    用户ID
     * @param request   赎回请求
     * @return 
     */
    public TradeSellFundResponse redeem(String userId, TradeSellFundRequest request);

    /**
     * 风险评测
     * 
     * @param userId    用户ID
     * @param request   风险评测
     * @return 
     */
    public UserRiskAssessmentResponse evaluate(String userId, UserRiskAssessmentRequest request);
    
    /**
     * 基金投资列表
     * 
     * @param request   基金请求信息
     * @return 
     */
    public QueryFundShareResponse queryFundShareResponse(QueryFundShareRequest request);
    
    /**
     * 查询基金费率
     * 
     * @param request 基金费率请求信息
     * @return 
     */
    public QueryFundFeeRateResponse queryFundFeeRate(QueryFundFeeRateRequest request);
    
    /**
     * 查询所有基金产品
     * 
     * @param fundCode 基金代码：为空返回所有基金产品
     * @return 
     */
    public List<FundProduct> listFundProduct(String fundCode);
    
    /**
     * 新增银行网点区域
     * 
     * @param parentId  上级区域ID 可以为空表明没有上级
     * @param name      区域
     * @param code      区域代码
     * @param areaLevel 区域类别
     * @return 
     */
    public Area addBankBranchArea(String parentId, String name, String code, AreaLevel areaLevel);
    
    /**
     * 获取银行网点列表
     * 
     * @param parentId
     * @return 
     */
    public List<Area> listByParentId(String parentId);
    
    /**
     * 获取银行网点区域
     * 
     * @param code      区域代码
     * @param areaLevel 区域类别
     * @return 
     */
    public Area getAreaByCodeAndLevel(String code, AreaLevel areaLevel);
    
    /**
     * 查询交易确认结果
     * @param request
     * @return 
     */
    public QueryTradeConfirmRecordResponse queryTradingConfirmRecord(QueryTradeRecordRequest request);
    
    /**
     * 查询用户收益
     * @param request
     * @return 
     */
    public QueryFundDividendResponse queryFundDividendRecord(QueryFundDividendRequest request);
    
    /**
     * 查询基金产品并入库（基金产品&基金净值）
     * 
     * 异步
     */
    public void asyncUpdateFundProducts();
}
