/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 众筹回报限制的键
 *
 * @author admin
 */
public enum CrowdFundingRewardRestrictionMsg implements BaseEnum {

    /**
     * investnum lessthan minnum 
     */
    INVESTNUM_LESSTHAN_MINNUM("投资次数少于最小次数"),
    
    /**
     * invest amount lessthan min amount
     */
    INVESTAMOUNT_LESSTHAN_MINAMOUNT("投资金额小于最小金额"),
    
    /**
     * user not invest p2pbidlist
     */
    USER_NOTINVEST_P2PBIDLIST("用户没有投指定的必投p2p标的列表"),
    
    /**
     * user invest nop2pbidlist
     */
    USER_INVEST_NOP2PBIDLIST("用户投了指定的必不投p2p标的列表"),
    
    /**
     * reward supportnum more than maxnum
     */
    REWARDSUPPORTNUM_MORETHAN_MAXNUM("回报支持次数超过最大支持次数"),
    
    /**
     * user supported exlusivescrowdfunding
     */
    USER_SUPPORTED_EXCLUSIVESCROWDFUNDING("用户支持了互斥的众筹回报"),

    /**
     * reward restriction success
     */
    SUCCESS("成功");
    
    private final String key;

    private CrowdFundingRewardRestrictionMsg(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
