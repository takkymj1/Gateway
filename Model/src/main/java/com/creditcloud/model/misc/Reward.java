/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RewardType;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
public class Reward extends BaseObject {

    @NotNull
    private RewardType type;

    /**
     * 固定奖励金额
     */
    @Min(0)
    private BigDecimal fixed;

    /**
     * 浮动奖励费用
     */
    @Min(0)
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
