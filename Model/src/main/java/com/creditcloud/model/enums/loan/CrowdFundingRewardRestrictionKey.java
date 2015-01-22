/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 众筹回报限制的键
 *
 * @author admin
 */
public enum CrowdFundingRewardRestrictionKey implements BaseEnum {

    /**
     * investTimes 
     *//**
     * investTimes 
     */
    INVESTTIMES("投资次数"),
    /**
     * investAmount
     */
    INVESTAMOUNT("总投资金额"),
    /**
     * p2pbidlist
     */
    P2PBIDLIST("必投的标的列表"),
    /**
     * notp2pbidlist
     */
    NOP2PBIDLIST("必未投的标的列表"),
    /**
     * supportTimes
     */
    SUPPORTTIMES("单人可支持次数上限"),
    /**
     * exclusivesCrowdfunding
     */
    EXCLUSIVESCROWDFUNDING("排除互斥众筹项目及回报");

    private final String key;

    private CrowdFundingRewardRestrictionKey(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
