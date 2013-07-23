/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.LoanRequest;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface LoanService {

    /**
     *
     * @param clientCode
     * @param loanRequest
     * @return
     */
    boolean submitLoanRequest(String clientCode, LoanRequest loanRequest);

    /**
     * 
     * @param clientCode
     * @param userId
     * @return 
     */
    List<LoanRequest> getListByUserId(String clientCode, String userId);

    
    /**
     * 
     * @param clientCode
     * @return 
     */
    List<LoanRequest> listAllLoans(String clientCode);

    /**
     * 
     * @param clientCode
     * @param criteriaInfo
     * @return 
     */
    PagedResult<LoanRequest> listLoans(String clientCode, CriteriaInfo criteriaInfo);
}
