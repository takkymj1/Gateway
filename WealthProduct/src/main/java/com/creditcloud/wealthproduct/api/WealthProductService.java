/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.api;

import com.creditcloud.wealthproduct.enums.ProductStatus;
import com.creditcloud.wealthproduct.model.WealthProduct;
import com.creditcloud.wealthproduct.model.WealthProductFixed;
import com.creditcloud.wealthproduct.model.WealthProductFloat;
import com.creditcloud.wealthproduct.model.WealthProductRate;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface WealthProductService extends WealthProductQueryService {

    /**
     * 新建固定收益类产品
     *
     * @param product
     * @return
     */
    public WealthProductFixed create(WealthProductFixed product);

    /**
     * update exist wealth product, only certain field fields can be updated by
     * this method
     *
     * @param product
     * @return
     */
    public WealthProduct update(WealthProduct product);
    
    /**
     * 
     * @param productId
     * @return 
     */
    public WealthProduct getById(String productId);

    /**
     * 获取固定收益类产品
     * 
     * @param productId
     * @return 
     */
    public WealthProductFixed getFixedById(String productId);
    
    /**
     * 获取浮动收益类产品
     * 
     * @param productId
     * @return 
     */
    public WealthProductFloat getFloatById(String productId);
    
    /**
     *
     * @param productId
     * @param status
     * @return
     */
    public boolean markStatus(String productId, ProductStatus status);

    /**
     * 添加收益档位
     * 
     * 1. 档位区间必须闭合
     * 2. 档位前闭后开
     * 3. 暂时只支持按照金额或者期限划分
     * 
     * @param productId 产品ID
     * @param rates     产品利率
     * @return 
     */
//    public boolean addFixedRates(String productId,  List<WealthProductRate> rates);
    
    /**
     * 修改产品展示序号
     * 
     * @param productId 产品ID
     * @param ordinal   产品序号
     * @return 
     */
    public boolean changeOrdinal(String productId, Integer ordinal);
    
    /**
     * 收藏产品
     * 
     * @param productId     产品ID
     * @param userId        用户ID
     * @return 当前产品的收藏数
     */
    public int markFavorite(String productId, String userId);

    /**
     * 取消收藏产品
     * 
     * @param productId     产品ID
     * @param userId        用户ID
     * @return 当前产品的收藏数
     */
    public int unmarkFavorite(String productId, String userId);

    /**
     * 产品被收藏数
     * 
     * @param productId     产品ID
     * @return 当前产品的收藏数
     */
    public int favoriteCountByProduct(String productId);

    /**
     * 产品前台显示
     * 
     * @param productId 
     */
    public void enable(String productId);
    
    /**
     * 产品前台隐藏
     * 
     * @param productId 
     */
    public void disable(String productId);
    
}
