/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.FundingInvest;
import com.creditcloud.crowdfunding.model.FundingProject;
import com.creditcloud.crowdfunding.model.FundingReward;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CrowdFundingService {

    /**
     * create if not exist, update if exsit
     *
     * @param clientCode
     * @param project
     * @return
     */
    public FundingProject saveProject(String clientCode, FundingProject project);

    /**
     *
     * @param clientCode
     * @param pageInfo
     * @param criteriaInfo
     * @return
     */
    public PagedResult<FundingProject> listProject(String clientCode, PageInfo pageInfo, CriteriaInfo criteriaInfo);

    /**
     *
     * @param clientCode
     * @param reward
     * @return
     */
    public FundingReward saveReward(String clientCode, FundingReward reward);

    /**
     *
     * @param clientCode
     * @param rewardId
     * @return
     */
    public boolean deleteReward(String clientCode, String rewardId);

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
     * @param amount
     * @return
     */
    public boolean invest(String clientCode, String projectId, BigDecimal amount);
}
