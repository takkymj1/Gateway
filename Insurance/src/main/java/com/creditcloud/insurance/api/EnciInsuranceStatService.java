/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.insurance.model.InsurancePolicyProfitRecord;
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
}
