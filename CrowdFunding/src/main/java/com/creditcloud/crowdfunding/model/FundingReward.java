/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.RewardConfirmStatus;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class FundingReward extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    @NotNull
    @PathParam("projectId")
    private String projectId;

    /**
     * donate/invest/pledge amount
     */
    @NotNull
    @FormParam("amount")
    private BigDecimal amount;

    /**
     * reward number limit
     */
    @NotNull
    @FormParam("limitNumber")
    private int limitNumber;

    /**
     * number raised
     */
    @NotNull
    private int raiseNumber;

    /**
     * return description
     */
    @NotNull
    @FormParam("description")
    private String description;

    /**
     * delivery cost, area, time ...</p>
     * can be json
     */
    @FormParam("deliveryDetail")
    private String deliveryDetail;

    /**
     * hard limit, TODO not used now
     */
    private boolean hardLimit;

    /**
     * amount actual raised, hard limit, TODO not used now
     */
    private BigDecimal raiseAmount;

    /**
     * 预计回报发送时间
     */
    private String deliveryTime;
    
    private boolean needConfirmReward = false;
    
    private RewardConfirmStatus launcherRewardConfirmStatus = RewardConfirmStatus.NONEED;
    
    private Date launcherRewardConfirmTime;
    
    /**
     * 众筹回报申请体验次数
     */
    private int applyCount;

    /**
     * 限定条件的判断结果
     */
    private String restrictionResult;
    
    /**
     * 是否可以申请体验
     */
    private boolean needExperienceApply;
    
    /**
     * 申请体验提示内容
     */
    private String experienceApplyContent;
    
    /**
     * 支持时是否弹出提醒
     */
    private boolean supportPopNotice;
    
    /**
     * 申请体验按钮是否可以点击
     */
    private boolean applyClickable;
    
    /**
     * 申请体验按钮操作指向类型
     */
    private String applyAction;
    
    /**
     * 手机端专题页url
     */
    private String mobileSpecialTopic;
    
    /**
     * 
     * @param id
     * @param projectId
     * @param amount
     * @param limitNumber
     * @param description
     * @param deliveryDetail 
     */
    public FundingReward(String id,
                         String projectId,
                         BigDecimal amount,
                         int limitNumber,
                         String description,
                         String deliveryDetail) {
        this.id = id;
        this.projectId = projectId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.description = description;
        this.deliveryDetail = deliveryDetail;
    }

    public FundingReward(String id,
                         String projectId,
                         BigDecimal amount,
                         int limitNumber,
                         String description,
                         String deliveryDetail,
                         String deliveryTime) {
        this.id = id;
        this.projectId = projectId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.description = description;
        this.deliveryDetail = deliveryDetail;
        this.deliveryTime = deliveryTime;
    }

    public FundingReward(String id,
                         String projectId,
                         BigDecimal amount,
                         int limitNumber,
                         String description,
                         String deliveryDetail,
                         String deliveryTime,
                         boolean needConfirmReward,
                         RewardConfirmStatus launcherRewardConfirmStatus,
                         boolean needExperienceApply,
                         String experienceApplyContent,
                         Date launcherRewardConfirmTime,
                         String restrictionResult,
                         boolean supportPopNotice,
                         boolean applyClickable,
                         String applyAction,
                         String mobileSpecialTopic) {
        this.id = id;
        this.projectId = projectId;
        this.amount = amount;
        this.limitNumber = limitNumber;
        this.description = description;
        this.deliveryDetail = deliveryDetail;
        this.deliveryTime = deliveryTime;
        this.needConfirmReward = needConfirmReward;
        this.launcherRewardConfirmStatus = launcherRewardConfirmStatus;
        this.needExperienceApply = needExperienceApply;
        this.experienceApplyContent = experienceApplyContent;
        this.launcherRewardConfirmTime = launcherRewardConfirmTime;
        this.restrictionResult = restrictionResult;
        this.supportPopNotice = supportPopNotice;
        this.applyClickable = applyClickable;
        this.applyAction = applyAction;
        this.mobileSpecialTopic = mobileSpecialTopic;
    }
    
    /**
     * left number
     *
     * @return
     */
    public int getLeftNumber() {
        int result = limitNumber - raiseNumber;
        return result < 0 ? 0 : result;
    }
    
}
