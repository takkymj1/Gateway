/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.TradingRecordType;
import com.creditcloud.investmentfund.model.FundAccount;
import com.creditcloud.investmentfund.model.FundProduct;
import com.creditcloud.investmentfund.model.FundResult;
import com.creditcloud.investmentfund.model.lion.RiskAssessment;
import com.creditcloud.investmentfund.model.lion.TradingRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.fund.BankAccount;
import javax.ejb.Remote;

/**
 * 诺安基金
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface LionFundService {

    /**
     * 查询所有诺安基金产品
     *
     * @param pageInfo  分页信息
     * @return
     */
    public PagedResult<FundProduct> list(PageInfo pageInfo);
    
    /**
     * 查询用户基金交易记录
     * 
     * @param userId    用户ID
     * @param type      业务类型 可以为空
     * @param pageInfo  分页信息
     * @return 
     */
    public PagedResult<TradingRecord> listByUserId(String userId, TradingRecordType type, PageInfo pageInfo);
    
    /**
     * 获取基金账户
     * 
     * @param userId    用户ID
     * @return 
     */
    public FundAccount getFundAccount(String userId);
    
    /**
     * 创建基金账户
     * 
     * @param userId        用户ID
     * @param bankAccount   银行账户
     * @return 
     */
    public FundResult<FundAccount> createFundAccount(String userId, BankAccount bankAccount);
    
    /**
     * 申购基金
     * 
     * @param userId        用户ID
     * @param amount        申购金额
     * @param bankAccount   银行账户
     * @param fundProductId 基金产品
     * @return 
     */
    public FundResult buy(String userId, int amount, String fundProductId, BankAccount bankAccount);
    
    /**
     * 赎回金额
     * 
     * @param userId    用户ID
     * @param share     份额
     * @return 
     */
    public FundResult sell(String userId, int share);

    /**
     * 风险评测
     * 
     * @param assessment 风险评测
     * @return 
     */
    public FundResult assess(RiskAssessment assessment);
    
}
