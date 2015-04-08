/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsuranceOrder;
import com.creditcloud.insurance.model.InsurancePolicy;
import com.creditcloud.insurance.model.InsurancePolicyProfitRecord;
import com.creditcloud.insurance.model.InsuranceProductSaleInfo;
import com.creditcloud.insurance.model.enci.BaseDTO;
import com.creditcloud.insurance.model.enci.enums.InsuranceOrderStatus;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * 新华保险万能险产品查询接口
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Remote
public interface EnciInsuranceService extends EnciInsuranceStatService{
    
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
    public boolean updatePolicyNo(String clientCode, String insurancePolicyId, String policyNo);
    
    /**
     * 更新InsurancePolicy的policyNo和url
     * @param clientCode
     * @param insurancePolicyId
     * @param policyNo
     * @param url
     * @return 
     */
    public boolean updatePolicyNoAndUrl(String clientCode, String insurancePolicyId, String policyNo, String url);
    
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
     * 根据投保单号查询InsuranceOrder
     * @param clientCode
     * @param proposalNo
     * @return 
     */
    public InsuranceOrder findInsuranceOrderByProposalNo(String clientCode, String proposalNo);
    
    /**
     * 修改保险订单的状态为指定状态
     * @param clientCode
     * @param OrderId
     * @param status
     * @return 
     */
    public boolean markStatus(String clientCode, String OrderId, InsuranceOrderStatus status);
    
    /**
     * 加密
     * 
     * @param plainText
     * @param type 加密类型（MD5, AES）
     * @return 
     */
    public String EnciEncrypt(String plainText, String type);
    
    /**
     * 根据状态查询主保险订单
     * 
     * 即不包括追加订单
     * @param clientCode
     * @param status
     * @return 
     */
    public List<InsuranceOrder> listByStatus(String clientCode, InsuranceOrderStatus... status);
    
    /**
     * 创建新的保单收益记录
     * @param clientCode
     * @param profitRecord
     * @return 
     */
    public InsurancePolicyProfitRecord createProfitRecord(String clientCode, InsurancePolicyProfitRecord profitRecord);
    
    /**
     * 根据保单号和计价日查询保单收益记录
     * @param clientCode
     * @param policyNo
     * @param valuationDate
     * @return 
     */
    public InsurancePolicyProfitRecord getByPolicyNoAndDate(String clientCode, String policyNo, Date valuationDate);
    
    /**
     * 修改保单收益记录的数据
     * @param clientCode
     * @param profitRecord
     * @return 
     */
    public InsurancePolicyProfitRecord eidtProfitRecord(String clientCode, InsurancePolicyProfitRecord profitRecord);
    
    /**
     * 获取最近一条收益信息
     * @param clientCode
     * @param policyNo
     * @return 
     */
    public InsurancePolicyProfitRecord getProfitRecordByLatest(String clientCode, String policyNo);
    
    /**
     * 列出用户的订单
     * 
     * 按照sortString排序，目前支持timeCreated/totalPremium
     * @param clientCode
     * @param userId
     * @param sortString
     * @param asc
     * @param status
     * @return 
     */
    public PagedResult<InsuranceOrder> listByUserId(String clientCode, PageInfo pageInfo, String userId, String sortString, boolean asc, InsuranceOrderStatus... status);
}
