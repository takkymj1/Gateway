/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.enums.ProjectLoanStatus;
import com.creditcloud.crowdfunding.enums.ProjectStatus;
import com.creditcloud.crowdfunding.model.FundingProject;
import com.creditcloud.crowdfunding.model.FundingReward;
import com.creditcloud.model.enums.loan.InvestStatus;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CrowdFundingService extends CrowdFundingQueryService, CrowdFundingTradeService {

    /**
     *
     * @param clientCode
     * @param project
     * @return
     */
    public FundingProject addProject(String clientCode, FundingProject project);

    /**
     *
     * @param clientCode
     * @param project
     * @return
     */
    public FundingProject updateProject(String clientCode, FundingProject project);

    /**
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public FundingProject getProjectById(String clientCode, String projectId);

    /**
     *
     * @param clientCode
     * @param reward
     * @return
     */
    public FundingReward addReward(String clientCode, FundingReward reward);

    /**
     *
     * @param clientCode
     * @param reward
     * @return
     */
    public FundingReward updateReward(String clientCode, FundingReward reward);

    /**
     *
     * @param clientCode
     * @param rewardId
     * @return
     */
    @Deprecated
    public boolean deleteReward(String clientCode, String rewardId);

    /**
     *
     * @param clientCode
     * @param rewardId
     * @return
     */
    public FundingReward getRewardById(String clientCode, String rewardId);

    /**
     *
     * @param clientCode
     * @param projectId
     * @param status
     * @return
     */
    public boolean markProjectStatus(String clientCode, String projectId, ProjectStatus status);

    /**
     *
     * @param clientCode
     * @param currentStatus current status
     * @param newStatus     status after update
     * @param investIds
     * @return
     */
    public boolean markInvestStatus(String clientCode,
                                    InvestStatus currentStatus,
                                    InvestStatus newStatus,
                                    List<String> investIds);

    /**
     *
     * @param clientCode
     * @param loanId
     * @param status
     * @return
     */
    public boolean markLoanStatus(String clientCode,
                                  String loanId,
                                  ProjectLoanStatus status);

    /**
     *
     * @param clientCode
     * @param projectId
     * @param userId
     * @return
     */
    public boolean markFavorite(String clientCode, String projectId, String userId);
}
