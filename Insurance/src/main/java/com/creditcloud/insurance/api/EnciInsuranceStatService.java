/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsurancePolicyProfitRecord;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

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
     * 统计最近若干天内的每日收益
     * @param clientCode
     * @param userId
     * @param from
     * @return 
     */
    public List<InsurancePolicyProfitRecord> recentProfitRecords(String clientCode, String userId, Date from);
}
