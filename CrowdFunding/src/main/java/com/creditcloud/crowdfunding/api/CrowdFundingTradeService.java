/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.FundingInvest;
import com.creditcloud.crowdfunding.model.PrepareLoanResult;
import java.math.BigDecimal;

/**
 *
 * @author rooseek
 */
public interface CrowdFundingTradeService {

    /**
     *
     * @param clientCode
     * @param invest
     * @return
     */
    public FundingInvest prepareInvest(String clientCode, FundingInvest invest);

    /**
     *
     * @param clientCode
     * @param investId
     * @return
     */
    public boolean finishInvest(String clientCode, String investId);

    /**
     * 放款
     *
     * @param clientCode
     * @param projectId
     * @param amount
     * @param orderId
     * @return
     */
    public PrepareLoanResult prepareLoan(String clientCode, String projectId, BigDecimal amount, String orderId);

    /**
     *
     * @param clientCode
     * @param loanId
     * @return
     */
    public boolean finishLoan(String clientCode, String loanId);

}
