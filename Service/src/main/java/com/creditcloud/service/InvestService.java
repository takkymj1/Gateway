/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.InvestRepayment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestService {

    /**
     * add new Invest
     *
     * @param clientCode
     * @param invest
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void submitInvest(String clientCode, Invest invest);

    /**
     * update an Invest
     *
     * @param clientCode
     * @param invest
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, Invest invest);

    /**
     * list Invest by user Id
     *
     * @param clientCode
     * @param userId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<Invest> listInvestbyUserId(String clientCode, String userId);

    /**
     * list Invest by loan Id
     *
     * @param clientCode
     * @param loanId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<Invest> listInvestByLoanId(String clientCode, String loanId);

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
