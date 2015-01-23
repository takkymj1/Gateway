/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.enums.ProjectLoanStatus;
import com.creditcloud.crowdfunding.enums.ProjectStatus;
import com.creditcloud.crowdfunding.model.FundingExperienceApply;
import com.creditcloud.crowdfunding.model.FundingInvestInfo;
import com.creditcloud.crowdfunding.model.FundingProject;
import com.creditcloud.crowdfunding.model.FundingReward;
import com.creditcloud.crowdfunding.model.FundingRewardRestriction;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.misc.PagedResult;
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
     * @param reward
     * @return
     */
    public FundingReward addReward(String clientCode, FundingReward reward);
    
    /**
     *
     * @param clientCode
     * @param apply
     * @return
     */
    public FundingExperienceApply addExperienceApply(String clientCode, FundingExperienceApply apply);

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
     * @param projectId
     * @param status
     * @return
     */
    public boolean markProjectStatus(String clientCode, String projectId, ProjectStatus status);

    /**
     *
     * @param clientCode
     * @param currentStatus current status
     * @param newStatus status after update
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
     * @param currentStatus
     * @param newStatus
     * @param investId
     * @return
     */
    public boolean markInvestStatus(String clientCode,
                                    InvestStatus currentStatus,
                                    InvestStatus newStatus,
                                    String investId);

    /**
     * update field in FundingInvestInfo except FundingInvest
     *
     * @param clientCode
     * @param investInfo
     * @return
     */
    public boolean updateInvestInfo(String clientCode,
                                    FundingInvestInfo investInfo);

    /**
     *
     * @param clientCode
     * @param loanId
     * @param status
     * @return
     */
    @Deprecated
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

    /**
     *
     * @param clientCode
     * @param projectId
     * @param userId
     * @return
     */
    public boolean unmarkFavorite(String clientCode, String projectId, String userId);

    /**
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public int favoriteCountByProject(String clientCode, String projectId);

    // like 接口，用TagService实现
    /**
     * 标记某用户喜欢该项目
     *
     * @param clientCode
     * @param projectId
     * @param userId
     * @return 该项目的like数
     */
    public int markLike(String clientCode, String projectId, String userId);

    /**
     * 标记某用户不喜欢该项目
     *
     * @param clientCode
     * @param projectId
     * @param userId
     * @return 该项目的like数
     */
    public int unmarkLike(String clientCode, String projectId, String userId);

    /**
     * 某项目的Like计数
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public int likeCountByProject(String clientCode, String projectId);

    /**
     * 设置项目的ordinal
     *
     * @param clientCode
     * @param projectId
     * @param ordinal
     * @return true if change successful, false if project not found
     */
    public boolean changeOrdinal(String clientCode, String projectId, Integer ordinal);
    
    
    /**
     * 根据项目id获取回报限定条件
     *
     * @param clientCode
     * @param projectId
     * @return true if change successful, false if project not found
     */
    public PagedResult<FundingRewardRestriction> getRewardRistrictionByProject(String clientCode, String projectId);

    
    /**
     * 计算用户众筹回报申请体验次数
     * @param clientCode
     * @param projectId
     * @param rewardId
     * @param userId
     * @return 
     */
    public int countByProjectAndRewardAndUser(String clientCode, String projectId, String rewardId, String userId);

    public int countByRewardAndUser(String rewardId, String userId, List successInvestList);

}
