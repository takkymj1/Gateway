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
public enum TicketStatus implements BaseEnum {

    /**
     * 已创建，待分配
     */
    CREATED("已创建"),
    /**
     * 已分配，待处理
     */
    ASSIGNED("已分配"),
    /**
     * 已回复，待审核
     */
    REPLIED("已回复"),
    /**
     * 审核通过，完成
     */
    FINISHED("已完成"),
    /**
     * 审核未通过，未解决
     */
    FAILED("未解决");
    
    private final String key;
    
    private TicketStatus(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
