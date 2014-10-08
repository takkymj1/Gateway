/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.enums.ProjectStatus;
import com.creditcloud.crowdfunding.model.FundingInvest;
import com.creditcloud.crowdfunding.model.FundingProject;
import com.creditcloud.crowdfunding.model.FundingReward;
import com.creditcloud.crowdfunding.model.ProjectLoan;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;

/**
 *
 * @author rooseek
 */
public interface CrowdFundingQueryService {

    /**
     *
     * @param clientCode
     * @param statusList
     * @param pageInfo
     * @return
     */
    public PagedResult<FundingProject> listProject(String clientCode,
                                                   List<ProjectStatus> statusList,
                                                   PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param userId
     * @param statusList
     * @param pageInfo
     * @return
     */
    public PagedResult<FundingProject> listProject(String clientCode,
                                                   String userId,
                                                   List<ProjectStatus> statusList,
                                                   PageInfo pageInfo);

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
     * @param pageInfo
     * @return
     */
    public PagedResult<FundingInvest> listInvestByProject(String clientCode,
                                                          String projectId,
                                                          List<InvestStatus> statusList,
                                                          PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param projectId
     * @param statusList
     * @return
     */
    public int countInvestByProject(String clientCode,
                                    String projectId,
                                    List<InvestStatus> statusList);

    /**
     *
     * @param clientCode
     * @param rewardId
     * @param statusList
     * @param pageInfo
     * @return
     */
    public PagedResult<FundingInvest> listInvestByReward(String clientCode,
                                                         String rewardId,
                                                         List<InvestStatus> statusList,
                                                         PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param rewardId
     * @param statusList
     * @return
     */
    public int countInvestByReward(String clientCode,
                                   String rewardId,
                                   List<InvestStatus> statusList);

    /**
     *
     * @param clientCode
     * @param userId
     * @param statusList
     * @param pageInfo
     * @return
     */
    public PagedResult<FundingInvest> listInvestByUser(String clientCode,
                                                       String userId,
                                                       List<InvestStatus> statusList,
                                                       PageInfo pageInfo);

    /**
     *
     * @param clientCode
     * @param userId
     * @param statusList
     * @return
     */
    public int countInvestByUser(String clientCode,
                                 String userId,
                                 List<InvestStatus> statusList);

    /**
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public List<ProjectLoan> listLoanByProject(String clientCode, String projectId);
}
