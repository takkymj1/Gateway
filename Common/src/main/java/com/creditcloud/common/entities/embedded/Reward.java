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
}
