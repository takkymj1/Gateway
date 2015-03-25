/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.FundShare;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 * 基金份额记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface FundShareService {

    /**
     * 新增一条投资记录（如果已经存在会更新当前记录）
     * 
     * @param fundShare  份额
     * @return 
     */
    public FundShare addNew(FundShare fundShare);
            
    /**
     * 获取基金投资列表
     * 
     * @param userId        用户ID 
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundShare> listByUserId(String userId, PageInfo pageInfo);
    
    /**
     * 获取用户资金
     * 
     * @param userId        用户ID
     * @return 
     */
    public BigDecimal sumByUserId(String userId);
}
