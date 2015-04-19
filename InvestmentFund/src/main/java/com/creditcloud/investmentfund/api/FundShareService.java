/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.model.FundShare;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 * 用户基金份额记录（目前只有非货币基金）
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
     * 获取基金份额列表
     * 
     * @param userId        用户ID 
     * @param pageInfo      分页信息
     * @return 
     */
    public PagedResult<FundShare> listByUserId(String userId, PageInfo pageInfo);
    
    /**
     * 获取基金份额
     * 
     * @param userId    用户ID
     * @param fundCode  基金代码
     * @param fundBrand 基金品牌
     * @return 
     */
    public FundShare getByUserIdAndCodeAndBrand(String userId, String fundCode, FundBrand fundBrand);
    
    /**
     * 某基金总份额
     * 
     * @param fundCode  基金代码
     * @param fundBrand 基金品牌
     * @return 总份额
     */
    public BigDecimal sumShareByFund(String fundCode, FundBrand fundBrand);
    
    /**
     * 用户持有该基金人数
     * 
     * @param fundCode  基金代码
     * @param fundBrand 基金品牌
     * @return 用户持有该基金人数
     */
    public int countByFund(String fundCode, FundBrand fundBrand);
    
    /**
     * 获取份额列表
     * 
     * @param pageInfo 分页信息
     * @return 
     */
    public PagedResult<FundShare> list(PageInfo pageInfo);
}
