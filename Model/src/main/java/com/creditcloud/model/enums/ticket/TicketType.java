/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.ticket;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author yanwei
 */
public enum TicketType implements BaseEnum {
    
    /**
     * 咨询
     */
    CONSULTING("咨询"),
    /**
     * 投诉
     */
    COMPLAINT("投诉"),
    /**
     * 活动
     */
    ACTIVITY("活动");
        
    private final String key;
    
    private TicketType (final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
