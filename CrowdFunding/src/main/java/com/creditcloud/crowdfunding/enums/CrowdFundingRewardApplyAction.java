/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 众筹回报申请点击行为
 *
 * @author admin
 */
public enum CrowdFundingRewardApplyAction implements BaseEnum {

    /**
     * specialLink 
     */
    SPECIALLINK("专题链接"),
    
    /**
     * popNotice
     */
    POPNOTICE("弹出框提醒"),

    /**
     * mobileSpecialTopic 
     */
    MOBILESPECIALTOPIC("/specialTopic/mobileyhgj");
    
    private final String key;

    private CrowdFundingRewardApplyAction(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
