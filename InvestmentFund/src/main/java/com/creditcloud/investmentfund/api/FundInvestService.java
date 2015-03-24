/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundInvestStatus;
import com.creditcloud.investmentfund.model.FundInvest;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;

/**
 * 基金投资记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundInvestService {

    /**
     * 新增一条投资记录（如果已经存在会更新当前记录）
     * 
     * @param fundInvest 
     * @return 
     */
    public FundInvest addNew(FundInvest fundInvest);
            
    /**
     * 获取基金投资列表
     * 
     * @param userId        用户ID 
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundInvest> listByUserId(String userId, PageInfo pageInfo);
    
    /**
     * 获取用户资金
     * 
     * @param userId        用户ID
     * @param statusList    投资状态列表
     * @return 
     */
    public BigDecimal sumByUserIdAndInvestStatus(String userId, List<FundInvestStatus> statusList);
}
