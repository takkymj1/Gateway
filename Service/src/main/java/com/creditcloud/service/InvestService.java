/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.loan.Invest;
import java.util.List;

/**
 *
 * @author rooseek
 */
public interface InvestService {

    /**
     * 
     * @param clientCode
     * @param invest
     * @return 
     */
    boolean submitInvest(String clientCode, Invest invest);

    /**
     * 
     * @param clientCode
     * @param userId
     * @return 
     */
    List<Invest> listbyUserId(String clientCode, String userId);

    /**
     * 
     * @param clientCode
     * @param loanId
     * @return 
     */
    List<Invest> listByLoanId(String clientCode, String loanId);
    
}
