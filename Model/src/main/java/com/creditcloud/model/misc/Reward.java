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

}
