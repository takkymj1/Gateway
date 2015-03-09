/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.loan.Loan;
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
     * list by user id
     *
     * @param userId
     * @param pageInfo
     * @return
     */
    public PagedResult<Loan> listByStatus(String userId, PageInfo pageInfo);
    
}
