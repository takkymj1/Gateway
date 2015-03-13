/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsuranceOrder;
import com.creditcloud.insurance.model.InsurancePolicy;
import com.creditcloud.insurance.model.InsuranceProduct;
import com.creditcloud.insurance.model.enci.BaseDTO;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 新华保险万能险产品查询接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface EnciInsuranceService {
    
    /**
     * 查询所有保险产品
     *
     * @param pageInfo
     * @return
     */
    public PagedResult<InsuranceProduct> list(PageInfo pageInfo);
    
    /**
     * 调用远程接口并获取到响应
     * @param <T>
     * @param request
     * @param classOfT
     * @return 
     */
    public <T extends BaseDTO> T getResponseFromEnci(BaseDTO request, Class<T> classOfT);
    
    /**
     * 创建保险订单
     * @param order
     * @return 
     */
    public InsuranceOrder createInsuranceOrder(InsuranceOrder order);
    
    /**
     * 创建保险保单
     * @param policy
     * @return 
     */
    public InsurancePolicy createInsurancePolicy(InsurancePolicy policy);
    
    /**
     * 创建保险产品
     * @param product
     * @return 
     */
    public InsuranceProduct createInsuranceProduct(InsuranceProduct product);
    
    /**
     * 更新InsuranceOrder的proposalNo信息
     * @param clientCode
     * @param proposalNo
     * @param insuranceOrderId
     * @return 
     */
    public boolean updateProposalNo(String clientCode, String insuranceOrderId, String proposalNo);
    
    /**
     * 更新InsurancePolicy的policyNo信息
     * @param clientCode
     * @param insurancePolicyId
     * @param policyNo
     * @return 
     */
    public boolean upatePolicyNo(String clientCode, String insurancePolicyId, String policyNo);
    
    /**
     * 根据ID查找InsuranceOrder
     * @param clientCode
     * @param insuranceOrderId
     * @return 
     */
    public InsuranceOrder findInsuranceOrderById(String clientCode, String insuranceOrderId);
    
    /**
     * 根据保险订单ID查找保险保单
     * @param clientCode
     * @param insuranceOrderId
     * @return 
     */
    public InsurancePolicy findInsurancePolicyByOrderId(String clientCode, String insuranceOrderId);
    
    /**
     * 根据ID查找InsurancePolicy
     * @param clientCode
     * @param insurancePolicyId
     * @return 
     */
    public InsurancePolicy findInsurancePolicyById(String clientCode, String insurancePolicyId);
    
    /**
     * 根据ID查询InsuranceProduct
     * @param clientCode
     * @param insuranceProductId
     * @return 
     */
    public InsuranceProduct findInsuranceProductById(String clientCode, String insuranceProductId);
}
