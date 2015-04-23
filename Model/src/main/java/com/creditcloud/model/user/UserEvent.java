/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.enums.user.UserEventType;
import java.util.Date;
import lombok.Data;

/**
 * 用户触发的事件
 * 
 * @author sobranie
 */
@Data
public class UserEvent {

    /**
     * 用户ID
     */
    private String userId;
    
    /**
     * 事件类型
     */
    private UserEventType eventType;
    
    /**
     * 事件发生时间
     */
    private Date timeHappened;
    
    /**
     * 快速创建UserEvent对象
     * 
     * @param userEventType
     * @param id
     * @return 
     */
    public static UserEvent of(UserEventType userEventType, String id) {
        UserEvent result = new UserEvent();
        result.setEventType(userEventType);
        result.setUserId(id);
        result.setTimeHappened(new Date());
        return result;
    }
}
