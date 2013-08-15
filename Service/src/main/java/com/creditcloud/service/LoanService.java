/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.loan.Loan;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface LoanService extends LoanRequestService, LoanRepayService {

    /**
     * update loan
     *
     * @param clientCode
     * @param loan
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void updateLoan(String clientCode, Loan loan);

    /**
     * get Loan by id
     *
     * @param clientCode
     * @param loanId
     * @return Loan
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    Loan getLoanById(String clientCode, String loanId);

    /**
     * list loan by user id
     *
     * @param clientCode
     * @param userId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<Loan> listLoanByUserId(String clientCode, String userId);

    /**
     * list loan by loan request id
     *
     * @param clientCode
     * @param requestId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<Loan> listLoanByRequestId(String clientCode, String requestId);

    /**
     * list all loans
     *
     * @param clientCode
     * @return
     */
    List<Loan> listAllLoans(String clientCode);
}
