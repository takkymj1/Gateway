/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 众筹回报限制结果
 *
 * @author admin
 */
public enum CrowdFundingRewardRestrictionResult implements BaseEnum {

    /**
     * satisfyrestriction 
     */
    SATISFYRISTRICTION("满足限制条件"),
    /**
     * unsatisfyrestriction
     */
    UNSATISFYRISTRICTION("不满足限制条件"),
    /**
     * normal
     */
    NORMAL("正常的众筹回报");

    private final String key;

    private CrowdFundingRewardRestrictionResult(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
