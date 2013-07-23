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
     * @return true if submit request successful, false if not
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean submitLoanRequest(String clientCode, LoanRequest loanRequest);

    /**
     * list loans by user id
     *
     * @param clientCode
     * @param userId
     * @return empty result is no loan found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<LoanRequest> getListByUserId(String clientCode, String userId);
}
