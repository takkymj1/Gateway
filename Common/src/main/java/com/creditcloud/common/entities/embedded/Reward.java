/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.loan.RewardType;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Reward extends BaseEntity {

    /**
     * 奖励金额方式
     */
    @Column(name = "REWARD_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private RewardType type;

    /**
     * 固定奖励金额
     */
    @Min(0)
    @Column(name = "REWARD_FIXED",
            nullable = true,
            precision = 15,
            scale = 2)
    private BigDecimal fixed;

    /**
     * 浮动奖励费用
     */
    @Min(0)
    @Max(1)
    @Column(name = "REWARD_RATE",
            nullable = true,
            precision = 7,
            scale = 5)
    private BigDecimal rate;

    /**
     * 计算投标金额
     *
     * @param reward
     * @param amount
     * @return
     */
    public static BigDecimal calculateReward(Reward reward, BigDecimal amount) {
        if (reward == null || amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO;
        }
        switch (reward.getType()) {
            case FIXED:
                return reward.getFixed() == null ? BigDecimal.ZERO : reward.getFixed();
            case FLOATING:
                if (reward.getRate() == null || reward.getRate().compareTo(BigDecimal.ZERO) == 0) {
                    return BigDecimal.ZERO;
                }
                return amount.multiply(reward.getRate());
            case BOTH:
                BigDecimal fixed = reward.getFixed() == null ? BigDecimal.ZERO : reward.getFixed();
                BigDecimal floating = BigDecimal.ZERO;
                if (reward.getRate() != null) {
                    floating = amount.multiply(reward.getRate());
                }
                return fixed.add(floating);
            case NONE:
                return BigDecimal.ZERO;
        }
        return BigDecimal.ZERO;
    }
}
