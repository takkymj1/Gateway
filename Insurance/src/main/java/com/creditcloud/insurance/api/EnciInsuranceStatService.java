/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsurancePolicyProfitRecord;
import com.creditcloud.insurance.model.InsuranceProductSaleInfo;
import com.creditcloud.insurance.model.enci.enums.InsuranceOrderStatus;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chai
 */
public interface EnciInsuranceStatService {
    
    /**
     * 统计用户的各保单的收益
     * @param clientCode
     * @param userId
     * @return 
     */
    public List<InsurancePolicyProfitRecord> getByLatestUserId(String clientCode, String userId);
    
    /**
     * 统计用户最近若干天内的每日收益
     * @param clientCode
     * @param userId
     * @param from
     * @param to
     * @return 
     */
    public List<InsurancePolicyProfitRecord> recentProfitRecords(String clientCode, String userId, Date from, Date to);
    
    /**
     * 统计保单若干天内的每日收益
     * @param clientCode
     * @param policyNo
     * @param from
     * @param to
     * @return 
     */
    public List<InsurancePolicyProfitRecord> recentPolicyProfitRecords(String clientCode, String policyNo, Date from, Date to);
    
    /**
     * 统计产品的购买份数和人数
     * @param clientCode
     * @param productId
     * @param status
     * @return 
     */
    public InsuranceProductSaleInfo sumNumAndUsers(String clientCode, String productId, InsuranceOrderStatus... status);
}
