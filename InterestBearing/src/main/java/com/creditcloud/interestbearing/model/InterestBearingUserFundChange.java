/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import com.creditcloud.interestbearing.enums.InterestBearingUserFundChangeDirection;
import com.creditcloud.interestbearing.enums.InterestBearingUserFundChangeType;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 用户余额生息资金变动
 *
 * @author guohuazhang
 */
@Data
public class InterestBearingUserFundChange {

    /**
     * 用于余额生息资金变动类型
     */
    private InterestBearingUserFundChangeType type;
    // 要开通余额生息的用户的ID
    @NotNull
    private String userId;
    // 变动时间，由调用者设置
    @NotNull
    private Date registrationTime;

    // 资金变动量
    @NotNull
    private BigDecimal changeAmount;

    public InterestBearingUserFundChangeDirection getChangeDirection() {
        if (changeAmount == null) {
            return InterestBearingUserFundChangeDirection.NO_CHANGE;
        }

        if (changeAmount.equals(BigDecimal.ZERO)) {
            return InterestBearingUserFundChangeDirection.NO_CHANGE;
        }

        InterestBearingUserFundChangeDirection direction = (changeAmount.compareTo(BigDecimal.ZERO) > 0) ? InterestBearingUserFundChangeDirection.INCREASED : InterestBearingUserFundChangeDirection.DECREASED;
        return direction;
    }

    public BigDecimal getAbsoluteChangeAmount() {
        if (changeAmount == null) {
            return BigDecimal.ZERO;
        }

        return changeAmount.abs();
    }

}
