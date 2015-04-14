/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.EventStatus;
import com.creditcloud.fund.model.enums.EventType;
import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author wenqiang
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class FundEvent extends BaseObject {

    public static final String EVENT_IN_ACTIVE = "OK";

    private String id;

    private EventType eventType;
    
    private String name;
    
    private String description;

    private Date startTime;

    private Date endTime;

    private int joinLimit;//参与次数限制

    private EventStatus status;

    public FundEvent(String id, EventType eventType, String name, String description, Date startTime, Date endTime, int joinLimit, EventStatus status) {
        this.id = id;
        this.eventType = eventType;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.joinLimit = joinLimit;
        this.status = status;
    }
}
