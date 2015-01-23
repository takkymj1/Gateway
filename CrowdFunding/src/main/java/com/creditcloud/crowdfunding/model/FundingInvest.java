/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.RewardConfirmStatus;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.InvestStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
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
public class FundingInvest extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    /**
     * project
     */
    @NotNull
    private String projectId;

    @NotNull
    private InvestStatus status;

    /**
     * amount pledged/donated/invested
     */
    @NotNull
    private BigDecimal amount;

    private BigDecimal deliveryFee;

    /**
     * corresponding reward
     */
    private String rewardId;

    @NotNull
    private String userId;

    private Date submitTime;

    private RewardConfirmStatus rewardConfirmStatus = RewardConfirmStatus.NONEED;
    
    private Date rewardConfirmTime;
    
    /**
     * record orderId related to this invest</p>
     */
    private String orderId;

    public FundingInvest(String id,
                         String projectId,
                         InvestStatus status,
                         BigDecimal amount,
                         BigDecimal deliveryFee,
                         String rewardId,
                         String userId,
                         Date submitTime,
                         String orderId) {
        this.id = id;
        this.projectId = projectId;
        this.status = status;
        this.amount = amount;
        this.deliveryFee = deliveryFee;
        this.rewardId = rewardId;
        this.userId = userId;
        this.submitTime = submitTime;
        this.orderId = orderId;
    }
    
    public FundingInvest(String id,
                         String projectId,
                         InvestStatus status,
                         BigDecimal amount,
                         BigDecimal deliveryFee,
                         String rewardId,
                         String userId,
                         Date submitTime,
                         String orderId,
                         RewardConfirmStatus rewardConfirmStatus,
                         Date rewardConfirmTime) {
        this.id = id;
        this.projectId = projectId;
        this.status = status;
        this.amount = amount;
        this.deliveryFee = deliveryFee;
        this.rewardId = rewardId;
        this.userId = userId;
        this.submitTime = submitTime;
        this.orderId = orderId;
        this.rewardConfirmStatus = rewardConfirmStatus;
        this.rewardConfirmTime = rewardConfirmTime;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee == null ? BigDecimal.ZERO : deliveryFee;
    }

    public BigDecimal getTotalAmount() {
        return amount.add(getDeliveryFee());
    }
}
