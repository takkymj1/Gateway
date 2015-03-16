/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.enums.TradingRecordType;
import com.creditcloud.investmentfund.model.FundAccount;
import com.creditcloud.investmentfund.model.FundResult;
import com.creditcloud.investmentfund.model.lion.FundInvest;
import com.creditcloud.investmentfund.model.lion.FundProduct;
import com.creditcloud.investmentfund.model.lion.RiskAssessment;
import com.creditcloud.investmentfund.model.lion.TradingRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.fund.BankAccount;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * 诺安基金
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface LionFundService {

    /**
     * 查询用户基金交易记录
     * 
     * @param userId    用户ID
     * @param type
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param pageInfo  分页信息
     * @return 
     */
    public PagedResult<TradingRecord> listTradingRecordByUserIdAndType(String userId, TradingRecordType type, Date startDate, Date endDate, PageInfo pageInfo);
    
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
     * 创建基金账户
     * 
     * @param userId            用户ID
     * @param bankAccount       银行账户
     * @param riskAssessment    风险评估
     * @param fundType          基金账户类型
     * @return 
     */
    public FundResult<FundAccount> createFundAccount(String userId, BankAccount bankAccount, RiskAssessment riskAssessment, FundType fundType);
    
    /**
     * 申购基金
     * 
     * @param userId        用户ID
     * @param fundCode      基金产品代码
     * @param bankAccount   银行账户
     * @param amount        申购金额
     * @return 
     */
    public FundResult buy(String userId, String fundCode, BankAccount bankAccount, int amount);
    
    /**
     * 赎回金额
     * 
     * @param userId    用户ID
     * @param fundCode  基金代码
     * @param share     份额
     * @return 
     */
    public FundResult sell(String userId, String fundCode, int share);

    /**
     * 风险评测
     * 
     * @param assessment 风险评测
     * @return 
     */
    public FundResult assess(RiskAssessment assessment);
    
    /**
     * 
     * @param userId    用户ID
     * @return 
     */
    public List<FundInvest> listFundInvestByUserId(String userId);
    
    /**
     * 查询所有基金产品
     * 
     * @param fundCode 基金代码：为空返回所有基金产品
     * @return 
     */
    public List<FundProduct> listFundProduct(String fundCode);
    
}
