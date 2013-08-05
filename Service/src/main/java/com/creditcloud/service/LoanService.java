/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface LoanService extends LoanRequestService {

    /**
     * submit a new loan
     *
     * @param clientCode
     * @param loan
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void submitLoan(String clientCode, Loan loan);

    /**
     * update loan
     *
     * @param clientCode
     * @param loan
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, Loan loan);

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
     *
     * @param clientCode
     * @param loanId
     * @return true if successful
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean cancelLoan(String clientCode, String loanId);

    /**
     * list loan repayment by loanId
     *
     * @param clientCode
     * @param loanId
     * @return emptyList if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<LoanRepayment> listRepayByLoanId(String clientCode, String loanId);

    /**
     * settle loan, generate corresponding LoanRepayment
     *
     * @param clientCode
     * @param loanId
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void settle(String clientCode, String loanId);
}
