/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsuranceProduct;
import com.creditcloud.insurance.model.InsuranceProductInfo;
import com.creditcloud.insurance.model.InsuranceProductNavRecord;
import com.creditcloud.insurance.model.enci.enums.ProductType;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author chai
 */
@Remote
public interface EnciInsuranceProductService {
    
    /**
     * 添加保险产品
     * @param product
     * @return 
     */
    public InsuranceProduct createInsuranceProduct(InsuranceProduct product);
    
    /**
     * 添加保险产品详细信息
     * @param productInfo
     * @return 
     */
    public InsuranceProductInfo createInsuranceProductInfo(InsuranceProductInfo productInfo);
    
    /**
     * 更新产品信息
     * 
     * @param product
     * @return 
     */
    public InsuranceProduct updateInsuranceProduct(InsuranceProduct product);
    
    /**
     * 更新产品详情信息
     * @param productInfo
     * @return 
     */
    public InsuranceProductInfo upInsuranceProductInfo(InsuranceProductInfo productInfo);
    
    /**
     * 查询所有保险产品
     *
     * @param pageInfo
     * @return
     */
    public PagedResult<InsuranceProduct> list(PageInfo pageInfo);
    
    /**
     * 根据预期利率、持有时间和类型搜索保险产品
     * @param pageInfo
     * @param minRate
     * @param maxRate
     * @param minDuration
     * @param maxDuration
     * @param types
     * @return 
     */
    public PagedResult<InsuranceProduct> listBySearch(PageInfo pageInfo,
                                                        BigDecimal minRate,
                                                        BigDecimal maxRate,
                                                        Integer minDuration,
                                                        Integer maxDuration,
                                                        ProductType... types);
    
    /**
     * 根据ID查询InsuranceProduct
     * @param clientCode
     * @param insuranceProductId
     * @return 
     */
    public InsuranceProduct findInsuranceProductById(String clientCode, String insuranceProductId);
    
    /**
     * 根据保险产品ID查找保险产品详情
     * @param clientCode
     * @param insuranceProductId
     * @return 
     */
    public InsuranceProductInfo findInsuranceProductInfoByProductId(String clientCode, String insuranceProductId);
    
    /**
     * 根据ID查询保险产品详情
     * @param clientCode
     * @param infoId
     * @return 
     */
    public InsuranceProductInfo findInsuranceProductInfoById(String clientCode, String infoId);
    
    /**
     * 更新产品的净值和当日年化利率
     * @param clientCode
     * @param infoId
     * @param nav
     * @param dayRate
     * @return 
     */
    public InsuranceProductInfo updateNavAndDayRate(String clientCode, String infoId, BigDecimal nav, BigDecimal dayRate);
    
    /**
     * 添加新的保险净值记录
     * @param clientCode
     * @param record
     * @return 
     */
    public InsuranceProductNavRecord createNavRecord(String clientCode, InsuranceProductNavRecord record);
    
    /**
     * 根据净值、当日年化收益率和计价日查询保险净值记录
     * @param clientCode
     * @param nav
     * @param dayRate
     * @param valutionDate
     * @return 
     */
    public InsuranceProductNavRecord getByNavAndDate(String clientCode, BigDecimal nav, BigDecimal dayRate, Date valutionDate);
    
    /**
     * 编辑保险产品信息
     * @param clientCode
     * @param product
     * @return 
     */
    public InsuranceProduct editProduct(String clientCode, InsuranceProduct product);
    
    /**
     * 编辑保险产品详情信息
     * @param clientCode
     * @param info
     * @return 
     */
    public InsuranceProductInfo editProductInfo(String clientCode, InsuranceProductInfo info);
    
    /**
     * 根据下标区间列出保险产品
     * @param clientCode
     * @param start
     * @param end
     * @return 
     */
    public List<InsuranceProduct> listByOrdinal(String clientCode, int start, int end);
}
