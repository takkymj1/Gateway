/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.FundingInvest;
import com.creditcloud.crowdfunding.model.FundingReward;
import com.creditcloud.crowdfunding.model.ProjectLoan;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CrowdFundingQueryService {

    /**
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public List<FundingReward> listRewardByProject(String clientCode, String projectId);

    /**
     *
     * @param clientCode
     * @param projectId
     * @param statusList
     * @return
     */
    public PagedResult<FundingInvest> listInvestByProject(String clientCode, String projectId, List<InvestStatus> statusList);

    /**
     *
     * @param clientCode
     * @param rewardId
     * @param statusList
     * @return
     */
    public PagedResult<FundingInvest> listInvestByReward(String clientCode, String rewardId, List<InvestStatus> statusList);

    /**
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public List<ProjectLoan> listLoanByProject(String clientCode, String projectId);
}
