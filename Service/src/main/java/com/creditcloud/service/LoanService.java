/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.LoanRequest;
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
    int submitLoanRequest(String clientCode, LoanRequest loanRequest);
    
    List<LoanRequest> getListByUserId(String clientCode, String userId);

}
