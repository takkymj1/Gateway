/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.FundingInvestInfo;
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
     * @param investInfo
     * @return
     */
    public FundingInvestInfo prepareInvest(String clientCode, FundingInvestInfo investInfo);

    /**
     *
     * @param clientCode
     * @param investId
     * @return
     */
    public boolean finishInvest(String clientCode, String investId);

    /**
     *
     * @param clientCode
     * @param investId
     * @return
     */
    public boolean cancelInvest(String clientCode, String investId);

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

    /**
     * cancel a project
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public boolean cancelProject(String clientCode, String projectId);

}
