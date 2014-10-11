/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.FundingInvest;

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
     *
     * @param clientCode
     * @param projectId
     * @param userId
     * @return
     */
    public boolean favorite(String clientCode, String projectId, String userId);
}
