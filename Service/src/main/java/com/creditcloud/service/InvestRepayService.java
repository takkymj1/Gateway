/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.InvestRepayment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService {

    /**
     * notify the repayment status of certain period for a loan
     *
     * @param clientCode
     * @param loanId
     * @param period
     * @param status
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void notifyRepaymentStatus(String clientCode, String loanId, int period, RepaymentStatus status);

    /**
     * list InvestRepayment by invest id
     *
     * @param clientCode
     * @param investId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<InvestRepayment> listRepayByInvestId(String clientCode, String investId);
}
