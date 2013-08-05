/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.enums.loan.BidResult;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.Invest;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface BidService {

    /**
     * try to invest a loan by bid
     *
     * @param clientCode
     * @param invest
     * @return BidResult
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    BidResult bid(String clientCode, Invest invest);

    /**
     * notify loan and corresponding investments about their status
     *
     * @param clientCode
     * @param loanId
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void notifyBidStatus(String clientCode, String loanId, LoanStatus status);

    /**
     * settle a bid, calculate loanRepayments for loan, and investRepayments for
     * invests
     *
     * @param clientCode
     * @param loanId
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void settle(String clientCode, String loanId);
}
